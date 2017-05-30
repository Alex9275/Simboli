package elementi;

import java.util.LinkedList;
import java.util.List;

public class Fattore {
	private String nome;
	private List<Opzione> opzioni;
	private List<VariabileDiStato> variabili;

	public Fattore(String nome){
		this.nome = nome;
		this.opzioni = new LinkedList<Opzione>();
		this.variabili = new LinkedList<VariabileDiStato>();
	}

	public Fattore(String nome,List<Opzione> opzioni ,List<VariabileDiStato> variabili){
		this.nome = nome;
		this.opzioni = opzioni;
		this.variabili = variabili;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Opzione> getOpzioni() {
		return opzioni;
	}

	public void setOpzioni(List<Opzione> opzioni) {
		this.opzioni = opzioni;
	}

	public List<VariabileDiStato> getVariabili() {
		return variabili;
	}

	public void setVariabili(List<VariabileDiStato> variabili) {
		this.variabili = variabili;
	}
	
	public void aggiungiOpzione(Opzione o){
		this.opzioni.add(o);
	}
	public void aggiungiVariabili(List<VariabileDiStato> v){
		this.variabili.addAll(v);
	}


}
