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
	
	public boolean confrontaImmagine(Immagine im1,Immagine im2,MatricePixel m){
		int[][] pixelRossi1,pixelRossi2;
		int[][] pixelBlu1,pixelBlu2;
		int[][] pixelVerdi1,pixelVerdi2;
		pixelRossi1=m.creaMatriceRossa(im1);pixelRossi2=m.creaMatriceRossa(im2);
		pixelBlu1=m.creaMatriceBlu(im1);pixelBlu2=m.creaMatriceBlu(im2);
		pixelVerdi1=m.creaMatriceVerde(im1);pixelVerdi2=m.creaMatriceVerde(im2);
		if(!(pixelRossi1==pixelRossi2)) return false;
		else if(!(pixelBlu1==pixelBlu2)) return false;
		else if(!(pixelVerdi1==pixelVerdi2)) return false;
		else return true;
	}
}
