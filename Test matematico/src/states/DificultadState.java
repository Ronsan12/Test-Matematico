package states;

import java.awt.Graphics;
import java.util.ArrayList;

import gameObjects.Constants;
import graphics.Assets;
import ui.Action;
import ui.Button;

public class DificultadState extends State{
	
	private ArrayList<Button> buttons;
	
	public DificultadState() {
		buttons = new ArrayList<Button>();
		
		buttons.add(new Button(
				Assets.greyBtn,
				Assets.blueBtn,
				Constants.WIDTH / 2 - Assets.greyBtn.getWidth()/2,
				Constants.HEIGHT / 2 - Assets.greyBtn.getHeight(),
				Constants.EASY,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new DificultadState());
					}
				}
				));
		
		buttons.add(new Button(
				Assets.greyBtn,
				Assets.blueBtn,
				Constants.WIDTH / 2 - Assets.greyBtn.getWidth()/2,
				Constants.HEIGHT / 2 + Assets.greyBtn.getHeight()/2 -10,
				Constants.NORMAL,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new DificultadState());
					}
				}
				));
		
		buttons.add(new Button(
				Assets.greyBtn,
				Assets.blueBtn,
				Constants.WIDTH / 2 - Assets.greyBtn.getWidth()/2,
				Constants.HEIGHT / 2 + Assets.greyBtn.getHeight()/2 + 55 ,
				Constants.HARD,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new DificultadState());
					}
				}
				));
		
		buttons.add(new Button(
				Assets.greyBtn,
				Assets.blueBtn,
				Constants.WIDTH / 5 + 500,
				Constants.HEIGHT / 2 - Assets.greyBtn.getHeight()+220,
				Constants.VOLVER,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new MenuState());
					}
				}
				));
	}
	
	
	
	@Override
	public void update() {
		for(Button b: buttons) {
			b.update();
		}
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Assets.Menu, 0, 0, null);
		for(Button b: buttons) {
			b.draw(g);
		}
	}

}
