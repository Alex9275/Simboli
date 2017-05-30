package immagini;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

public class ListaPixel {
	private Pixel pixels;
	private List<Integer> listaPixel;

	public ListaPixel(){
		listaPixel = new LinkedList<Integer>();
	}

	public void creaMatriceRossa(Immagine imm){
		Color c;
		for( int i = 0; i < imm.getLunghezza(); i++ )
			for( int j = 0; j < imm.getAltezza(); j++ ){
				c = new Color(imm.getImage().getRGB(i,j));
				this.listaPixel.add(c.getRed());

			}
	}

	public void creaMatriceBlu(Immagine imm){
		Color c;
		for( int i = 0; i < imm.getLunghezza(); i++ )
			for( int j = 0; j < imm.getAltezza(); j++ ){
				c = new Color(imm.getImage().getRGB(i,j));
				this.listaPixel.add(c.getBlue());
			}
	}

	public void creaMatriceVerde(Immagine imm){
		Color c;
		for( int i = 0; i < imm.getLunghezza(); i++ )
			for( int j = 0; j < imm.getAltezza(); j++ ){
				c = new Color(imm.getImage().getRGB(i,j));
				this.listaPixel.add(c.getGreen());
			}
	}

	public Pixel getPixels() {
		return pixels;
	}

	public void setPixels(Pixel pixels) {
		this.pixels = pixels;
	}

	public List<Integer> getListaPixel() {
		return listaPixel;
	}

	public void setListaPixel(List<Integer> listaPixel) {
		this.listaPixel = listaPixel;
	}
}
