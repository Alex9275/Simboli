package elementi;

import java.util.List;

import immagini.Immagine;
import immagini.ListaPixel;
//Classe che rappresenta le opzioni
public class Opzione {
	private String nome;
	private Immagine immIniziale;
	private Immagine immFinale;
	public Opzione(String nome, Immagine i1, Immagine i2 ){
		this.nome = nome;
		this.immIniziale = i1;
		this.immFinale = i2;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Immagine getImmIniziale() {
		return this.immIniziale;
	}
	public void setImmIniziale(Immagine immIniziale) {
		this.immIniziale = immIniziale;
	}
	public Immagine getImmFinale() {
		return this.immFinale;
	}
	public void setImmFinale(Immagine immFinale) {
		this.immFinale = immFinale;
	}
	
	
	//Genera la lista di pixel dell'immagine iniziale(sotto forma di un vettore rgb)
	public List<Integer> GeneraListaImmagineIniziale(){
		
		ListaPixel iniziale = new ListaPixel();
		iniziale.creaMatriceBlu(immIniziale);
		iniziale.creaMatriceRossa(immIniziale);
		iniziale.creaMatriceVerde(immIniziale);
		return iniziale.getListaPixel();
	}
	
	//Genera la lista di pixel dell'immagine finale(sotto forma di un vettore rgb)
	public List<Integer> GeneraListaImmagineFinale(){
		ListaPixel finale = new ListaPixel();
		finale.creaMatriceBlu(immFinale);
		finale.creaMatriceRossa(immFinale);
		finale.creaMatriceVerde(immFinale);
		return finale.getListaPixel();
	}

}
