package generatore;

import java.util.List;

import elementi.*;
public class GeneraId {
	private int inizio;

	public GeneraId(){

	}

	public GeneraId(int inizio){
		this.inizio = inizio;

	}

	public int getInizio() {
		return this.inizio;
	}

	public void setInizio(int inizio) {
		this.inizio = this.inizio+inizio;
	}

	public void assegnaId(List<VariabileDiStato> v){
		int i = this.getInizio();
		for(VariabileDiStato vs : v){
			vs.setId(i);
			i++;
		}
	}
}
