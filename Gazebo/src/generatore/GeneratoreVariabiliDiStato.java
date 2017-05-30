package generatore;

import java.util.LinkedList;
import java.util.List;

import elementi.VariabileDiStato;
//Questa classe prendende due liste che rappresentano i pixel dell'immagine iniziale e i pixel dell'immagine finale.
public class GeneratoreVariabiliDiStato {
	private List<Integer> listaPartenza;
	private List<Integer> listaArrivo;
	public GeneratoreVariabiliDiStato(List<Integer> l1,List<Integer> l2){
		this.listaPartenza = l1;
		this.listaArrivo = l2;
	}

	//Restituisce i pixel che vengono modificati
	public List<VariabileDiStato> genera(){
		List<VariabileDiStato> list = new LinkedList<VariabileDiStato>();
		int cont = 0;
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
