package states;

import java.awt.Graphics;
import java.util.ArrayList;

import gameObjects.Constants;
import graphics.Assets;
import ui.Action;
import ui.Button;

public class MenuState extends State{
	
	private ArrayList<Button> buttons;
	
	public MenuState() {
		buttons = new ArrayList<Button>();
		
		buttons.add(new Button(
				Assets.greyBtn,
				Assets.blueBtn,
				Constants.WIDTH / 2 - Assets.greyBtn.getWidth()/2,
				Constants.HEIGHT / 2 - Assets.greyBtn.getHeight(),
				Constants.PLAYER1,
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
				Constants.WIDTH / 2 - Assets.greyBtn.getWidth()/2,
				Constants.HEIGHT / 2 + Assets.greyBtn.getHeight()/2 -10,
				Constants.PLAYER2,
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
				Constants.HELP,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new HelpState());
					}
				}
				));
		
		buttons.add(new Button(
				Assets.greyBtn,
				Assets.blueBtn,
				Constants.WIDTH / 2 - Assets.greyBtn.getWidth()/2,
				Constants.HEIGHT / 2 + Assets.greyBtn.getHeight()/2 +120 ,
				Constants.EXIT,
				new Action() {
					@Override
					public void doAction() {
						System.exit(0);
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
