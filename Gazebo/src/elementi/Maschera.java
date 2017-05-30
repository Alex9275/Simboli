package elementi;

import java.util.LinkedList;
import java.util.List;

import generatore.GeneratoreVariabiliDiStato;


public class Maschera {
	private String nome;
	private Opzione opzione;
	private List<VariabileDiStato> variabiliCheCambiano;
	private int dimensioneLista;
	public Maschera(String nome, Opzione opz,int dim){
		this.nome = nome;
		this.opzione = opz;
		this.dimensioneLista=dim;
		this.variabiliCheCambiano = aggiornaLista();
	}
	
	public List<VariabileDiStato> aggiornaLista(){
		GeneratoreVariabiliDiStato generatore = new GeneratoreVariabiliDiStato(this.opzione.GeneraListaImmagineIniziale(),this.opzione.GeneraListaImmagineFinale());
		List<VariabileDiStato> v = generatore.genera(this.dimensioneLista);
		setDimensioneLista(v.size());
		return v;
	}
	
	
	public int getDimensioneLista() {
		return this.dimensioneLista;
	}

	public void setDimensioneLista(int dimensioneLista) {
		this.dimensioneLista = dimensioneLista;
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
