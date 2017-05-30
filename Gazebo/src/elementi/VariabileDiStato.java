package elementi;

import immagini.Pixel;

public class VariabileDiStato {
    private int id;
    private Pixel pixel;

	
	public VariabileDiStato(int index, int i) {
		this.id = index;
		this.pixel = new Pixel(i);
				
	}


	@Override
	public String toString() {
	       return id + " ";
	}
   
}
