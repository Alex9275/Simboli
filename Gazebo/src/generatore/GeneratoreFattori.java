package generatore;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import elementi.*;

public class GeneratoreFattori {
	private List<Maschera> maschere;

	public GeneratoreFattori(List<Maschera> maschere){
		this.maschere = maschere;
	}

	public List<Maschera> getMaschere() {
		return maschere;
	}

	public void setMaschere(List<Maschera> maschere) {
		this.maschere = maschere;
	}

	public List<Fattore> fattorizzazione(){
		List<Fattore> fattori = new LinkedList<Fattore>();
		int i=1;
		for(Maschera m : this.maschere){
			Fattore f = new Fattore("f" + i);
			if(controllaFattori(fattori,m.getVariabiliCheCambiano())){
				f = restituisciFattore(fattori, m.getVariabiliCheCambiano());
				if(f!=null)
				f.aggiungiOpzione(m.getOpzione());
				
			}
			else{
				f.aggiungiOpzione(m.getOpzione());
				f.aggiungiVariabili(m.getVariabiliCheCambiano());
				fattori.add(f);
				i++;
			}	
		}
		return fattori;
	}
	
	public boolean confrontaLista(List<VariabileDiStato> v1,List<VariabileDiStato> v2){
		for(VariabileDiStato i : v1){
			for(VariabileDiStato j : v2){
				if(!(i.equals(j))) return false;
			}
		}
		return true;
	}
	
	public boolean controllaFattori(List<Fattore> fattori,List<VariabileDiStato> v){
		if(fattori==null) return false;
		for(Fattore f : fattori){
			if((confrontaLista(f.getVariabili(),v))) return true;
		}
		return false;
	}
	
	public Fattore restituisciFattore(List<Fattore> fattori,List<VariabileDiStato> v){
		for(Fattore f : fattori){
			if((confrontaLista(f.getVariabili(),v))) return f;
		}
		return null;
	}
}
