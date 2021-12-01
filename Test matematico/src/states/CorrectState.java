package states;

import java.awt.Graphics;
import java.util.ArrayList;

import gameObjects.Constants;
import graphics.Assets;
import ui.Action;
import ui.Button;
import ui.Question;

public class CorrectState extends State{

	private ArrayList<Button> buttons;
	private ArrayList<Question> questions;
	
	
	public CorrectState() {
		buttons = new ArrayList<Button>();
		questions = new ArrayList<Question>();

	
		
		buttons.add(new Button(
				Assets.greyBtn,
				Assets.blueBtn,
				Constants.WIDTH / 5 + 500,
				Constants.HEIGHT / 2 - Assets.greyBtn.getHeight()+400,
				Constants.VOLVER,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new GameState());
					}
				}
				));}
	
	public void update() {
		for(Button b: buttons) {
			b.update();
		}
		
	}
	
	public void draw(Graphics g) {
		g.drawImage(Assets.Congrats, 0, 0, null);
		
		    for(Question b: questions
		    		) {
			b.draw(g);
	    }
		    
			for(Button b: buttons) {
				b.draw(g);
		}
	}
	

		
	}