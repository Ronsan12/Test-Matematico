package main;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import graphics.Assets;
import input.MouseInput;
import states.GameState;
import states.MenuState;
import states.State;

public class Main extends JFrame implements Runnable{ //clase para crear la ventana 
	
	public static final int WIDHT = 1000, HEIGHT =772; 
	private Canvas canvas; //objeto canvas para dibujar
	private Thread thread; //objeto del hilo
	private boolean running=false;
	
	private BufferStrategy bs;
	private Graphics g;
	
	private final int FPS = 60; //fotogramas para el juego
	private double TARGETTIME = 1000000000/FPS; //tiempo objetivo para los FPS 
	private double delta = 0; //almacena temporalmente el tiempo que ha pasado
	private int AVERAGEFPS = FPS; // nos permite saber a cuantos FPS corre el juego
		
	private MouseInput mouseInput;
	
	public Main(){ //constructor de la clase Window
		
		setTitle("Test matematico");
		setSize(WIDHT, HEIGHT); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		canvas = new Canvas();
		mouseInput = new MouseInput();
		
		canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		canvas.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		canvas.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		canvas.setFocusable(true);
		
		add(canvas);
		canvas.addMouseListener(mouseInput);
		canvas.addMouseMotionListener(mouseInput);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().start();
	}

	
	private void update(){ //metodo para actualizar el juego
		//gameState.update();
		State.getCurrentState().update();//Actualizar siempre estado actual

	}
	
	private void draw(){ //metodo para dibujar el juego
		bs = canvas.getBufferStrategy();
		
		if(bs==null) {
			canvas.createBufferStrategy(3);
			return;
		}
		
		g=bs.getDrawGraphics();
		
		//-------------------
		g.setColor(Color.WHITE);
		
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		State.getCurrentState().draw(g);//Dibujar siempre estado actual
		
		g.drawString(""+AVERAGEFPS,10,10); //imprime el promedio de fps que corre el juego
		
		//------------------- 
		
		g.dispose();
		bs.show();
				
	}
	
	
	private void init() {
		Assets.init();
		State.changeState(new MenuState());
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		long now = 0; //registro del tiempo
		long lastTime = System.nanoTime(); //hora actual del sistema en nano segundos
		int frames = 0; //Saber el rendimiento del juego
		long time = 0; 
		
		init();
		
		while(running) { //correr el juego y actualizarlo 
			
			now=System.nanoTime();
			delta += (now-lastTime)/TARGETTIME;
			time += (now-lastTime);
			lastTime = now; //restringe el tiempo a 60 fps
			
			if(delta >= 1) {
				update();
				draw();
				delta --;
				frames ++;
			}
			
			if(time >= 1000000000) {//saber que ya ha pasado 1 segundo
				AVERAGEFPS = frames;
				frames = 0;
				time=0;
			}
		}
		
		stop();
	}
	
	private void start() { //iniciar el hilo
		
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	private void stop() { //detener el hilo
		try {
			thread.join();
			running = false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}