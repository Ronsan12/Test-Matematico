package graphics;
import java.awt.Font;
import java.awt.image.BufferedImage;

public class Assets { //contiene recuersos externos
	
	public static BufferedImage player;
	public static BufferedImage greyBtn;
	public static BufferedImage blueBtn;
	public static BufferedImage Menu;
	public static Font fontMed;
	public static BufferedImage level;
	public static BufferedImage question;
	public static BufferedImage Congrats;
	public static BufferedImage Incorrect;
	public static BufferedImage Help;

	
	// numbers
	
		public static BufferedImage[] numbers = new BufferedImage[11];


	
	public static void init() {
		player = Loader.ImageLoader("/personajes/player.png");
		greyBtn = Loader.ImageLoader("/ui/grey_button.png");
		blueBtn = Loader.ImageLoader("/ui/blue_button.png");		
		Menu = Loader.ImageLoader("/ui/Menu.png");
		fontMed = Loader.loadFont("/ui/futureFont.ttf", 20);
		level = Loader.ImageLoader("/juego/Level.png");
		question = Loader.ImageLoader("/ui/question.png");
		Congrats = Loader.ImageLoader("/ui/Correct.png");
		Incorrect = Loader.ImageLoader("/ui/Incorrect.png");
		Help = Loader.ImageLoader("/ui/Help.png");


		
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = Loader.ImageLoader("/numbers/"+i+".png");

	}

}
