package states;

import java.awt.Graphics;
import java.util.ArrayList;

import gameObjects.Constants;
import graphics.Assets;
import math.Vector2D;
import ui.Action;
import ui.Button;
import ui.Question;

public class GameState extends State{
	
	private ArrayList<Button> buttons;
	private ArrayList<Question> questions;

	private int score = 0;

	
	
	public GameState() {
		buttons = new ArrayList<Button>();
		questions = new ArrayList<Question>();

		questions.add(new Question(
				Assets.question,
				Assets.question,
				Constants.WIDTH /2-200,
				Constants.HEIGHT / 2 - Assets.question.getHeight()+190,
				Constants.QUESTION1,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new GameState());
					}
				}
				));
	
		
		buttons.add(new Button(
				Assets.greyBtn,
				Assets.blueBtn,
				Constants.WIDTH / 5 + 30,
				Constants.HEIGHT / 2 - Assets.greyBtn.getHeight()+260,
				Constants.ANSWER1,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new CorrectState());
					}
				}
				));
		
		buttons.add(new Button(
				Assets.greyBtn,
				Assets.blueBtn,
				Constants.WIDTH / 2 + 80,
				Constants.HEIGHT / 2 - Assets.greyBtn.getHeight()+260,
				Constants.ANSWER2,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new IncorrectState());
					}
				}
				));
		
		buttons.add(new Button(
				Assets.greyBtn,
				Assets.blueBtn,
				Constants.WIDTH / 5 + 30,
				Constants.HEIGHT / 2 - Assets.greyBtn.getHeight()+320,
				Constants.ANSWER3,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new IncorrectState());
					}
				}
				));
		
		buttons.add(new Button(
				Assets.greyBtn,
				Assets.blueBtn,
				Constants.WIDTH / 2 + 80,
				Constants.HEIGHT / 2 - Assets.greyBtn.getHeight()+320,
				Constants.ANSWER4,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new IncorrectState());
					}
				}
				));
		
	}
	
	public void update() {
		for(Button b: buttons) {
			b.update();
		}
		
		 for(Question b: questions
		    		) {
			 b.update();
	    }
		
	}
	
	public void draw(Graphics g) {
		g.drawImage(Assets.level, 0, 0, null);
		g.drawImage(Assets.player, 400, 150, null);
		
		    for(Question b: questions
		    		) {
			b.draw(g);
	    }
		    
			for(Button b: buttons) {
				b.draw(g);
		}
	}
	

		
	}


