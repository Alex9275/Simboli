package elementi;

import java.util.LinkedList;
import java.util.List;

import generatore.GeneratoreVariabiliDiStato;


public class Maschera {
	private String nome;
	private Opzione opzione;
	private List<VariabileDiStato> variabiliCheCambiano;
	public Maschera(String nome, Opzione opz){
		this.nome = nome;
		this.opzione = opz;
		this.variabiliCheCambiano = new LinkedList<VariabileDiStato>();
	}
	
	public void aggiornaLista(){
		GeneratoreVariabiliDiStato generatore = new GeneratoreVariabiliDiStato(this.opzione.GeneraListaImmagineIniziale(),this.opzione.GeneraListaImmagineFinale());
		this.variabiliCheCambiano = generatore.genera();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Opzione getOpzione() {
		return opzione;
	}
	public void setOpzione(Opzione opzione) {
		this.opzione = opzione;
	}
	public List<VariabileDiStato> getVariabiliCheCambiano() {
		return variabiliCheCambiano;
	}
	public void setVariabiliCheCambiano(List<VariabileDiStato> variabiliCheCambiano) {
		this.variabiliCheCambiano = variabiliCheCambiano;
	} 
}
