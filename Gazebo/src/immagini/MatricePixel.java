package immagini;

import java.awt.Color;
/*Crea le 3 matrici RGB di un'immagine*/
public class MatricePixel {
	private int[][] pixels;

	public MatricePixel(){

	}

	public int[][] creaMatriceRossa(Immagine imm){
		Color c;
		this.pixels=new int[imm.getLunghezza()][imm.getAltezza()];
		for( int i = 0; i < imm.getLunghezza(); i++ )
			for( int j = 0; j < imm.getAltezza(); j++ ){
				c = new Color(imm.getImage().getRGB(i,j));
				this.pixels[i][j] = c.getRed();
			}
		return this.pixels;
	}
	public int[][] creaMatriceBlu(Immagine imm){
		Color c;
		this.pixels=new int[imm.getLunghezza()][imm.getAltezza()];
		for( int i = 0; i < imm.getLunghezza(); i++ )
			for( int j = 0; j < imm.getAltezza(); j++ ){
				c = new Color(imm.getImage().getRGB(i,j));
				this.pixels[i][j] = c.getBlue();
			}
		return this.pixels;
	}
	public int[][] creaMatriceVerde(Immagine imm){
		Color c;
		this.pixels=new int[imm.getLunghezza()][imm.getAltezza()];
		for( int i = 0; i < imm.getLunghezza(); i++ )
			for( int j = 0; j < imm.getAltezza(); j++ ){
				c = new Color(imm.getImage().getRGB(i,j));
				this.pixels[i][j] = c.getGreen();
			}
		return this.pixels;
	}
	public int[][] creaMatriceRGB(Immagine imm){
		this.pixels=new int[imm.getLunghezza()][imm.getAltezza()];
		for( int i = 0; i < imm.getLunghezza(); i++ )
			for( int j = 0; j < imm.getAltezza(); j++ ){
				this.pixels[i][j] = imm.getImage().getRGB(i, j);
			}
		return this.pixels;
	}
}
