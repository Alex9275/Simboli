package elementi;
import java.util.List;
import generatore.GeneratoreVariabiliDiStato;
//Descrive le maschere
public class Maschera {
	private String nome;
	private Opzione opzione;
	private List<VariabileDiStato> variabiliCheCambiano;
	public Maschera(String nome, Opzione opz){
		this.nome = nome;
		this.opzione = opz;
		this.variabiliCheCambiano = aggiornaLista();
	}
	
	//inserisce nella lista delle variabili quelle che vengono cambiate dall'opzione a cui essa si riferisce
	public List<VariabileDiStato> aggiornaLista(){
		//Genera la lista 
		GeneratoreVariabiliDiStato generatore = new GeneratoreVariabiliDiStato(this.opzione.GeneraListaImmagineIniziale(),this.opzione.GeneraListaImmagineFinale());
		List<VariabileDiStato> v = generatore.genera();
		return v;
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
