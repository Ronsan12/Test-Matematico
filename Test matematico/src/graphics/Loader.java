package graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Font;
import java.awt.FontFormatException;

import javax.imageio.ImageIO;

public class Loader { //cargar imagenes
	
	public static BufferedImage ImageLoader(String path) {
		
		try {
			return ImageIO.read(Loader.class.getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Font loadFont(String path, int size) {
		try {
			return Font.createFont(Font.TRUETYPE_FONT, Loader.class.getResourceAsStream(path)).deriveFont(Font.PLAIN, size);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
			return null;
		}
}

}
