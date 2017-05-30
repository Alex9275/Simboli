package generatore;

import java.util.LinkedList;
import java.util.List;

import elementi.VariabileDiStato;

public class GeneratoreVariabiliDiStato {
	private List<Integer> listaPartenza;
	private List<Integer> listaArrivo;
	
	public GeneratoreVariabiliDiStato(List<Integer> l1,List<Integer> l2){
		this.listaPartenza = l1;
		this.listaArrivo = l2;
	}
	public List<VariabileDiStato> genera(int dim){
		List<VariabileDiStato> list = new LinkedList<VariabileDiStato>();
		int cont = dim;
		for(Integer i : this.listaPartenza){
			for(Integer j : this.listaArrivo){
				if(!(i.equals(j))){
					VariabileDiStato variabile = new VariabileDiStato(cont,(int)j);
					cont++;
                    list.add(variabile);
				}
				this.listaArrivo.remove(j);
				break;
			}

		
		}
//		int cont = 0;
//		for(Integer i : this.listaPartenza){
//		    if(!(i.equals(this.listaArrivo.get(cont)))){
//		    	VariabileDiStato variabile = new VariabileDiStato(cont,(int)this.listaArrivo.get(cont));
//		    	list.add(variabile);
//		    }
//		    cont++;
//		}
		return list;
		
	}
	public List<Integer> getListaPartenza() {
		return listaPartenza;
	}
	public void setListaPartenza(List<Integer> listaPartenza) {
		this.listaPartenza = listaPartenza;
	}
	public List<Integer> getListaArrivo() {
		return listaArrivo;
	}
	public void setListaArrivo(List<Integer> listaArrivo) {
		this.listaArrivo = listaArrivo;
	}


}
