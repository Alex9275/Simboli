package elementi;

import immagini.Pixel;

public class VariabileDiStato {
    private int id;
    private Pixel pixel;

	
	public VariabileDiStato(int index, int i) {
		this.id = index;
		this.pixel = new Pixel(i);
				
	}
	

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public Pixel getPixel() {
		return pixel;
	}




	public void setPixel(Pixel pixel) {
		this.pixel = pixel;
	}




	@Override
	public boolean equals(Object o) {
		VariabileDiStato v = (VariabileDiStato) o;
		return this.pixel.equals(v.getPixel());
	}




	@Override
	public String toString() {
	       return id + " ";
	}
   
}
