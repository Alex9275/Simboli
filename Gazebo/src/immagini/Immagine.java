package immagini;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Immagine {
	private BufferedImage image;
	private int altezza;
	private int lunghezza;

	public Immagine(String percorso) throws IOException{
		this.image = ImageIO.read(new File(percorso));
		this.altezza=this.image.getHeight();
		this.lunghezza=this.image.getWidth();
	}

	public BufferedImage getImage() {
		return this.image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public int getAltezza() {
		return this.altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int getLunghezza() {
		return this.lunghezza;
	}

	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}
	

}
