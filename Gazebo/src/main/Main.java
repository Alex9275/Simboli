package main;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import elementi.Fattore;
import elementi.Maschera;
import elementi.Opzione;
import generatore.GeneraId;
import generatore.GeneratoreFattori;
import immagini.Immagine;
import stampa.Stampa;

public class Main {

	public static void main(String[] args) throws IOException {
		//Carico le immagini
		Immagine image = new Immagine("C:/Users/alex/Desktop/SfereGazebo/SfereSpente.jpg");
		Immagine image2 = new Immagine("C:/Users/alex/Desktop/SfereGazebo/SferaAaccesa.jpg");
		Immagine image3 = new Immagine("C:/Users/alex/Desktop/SfereGazebo/SfereAccese.jpg");
		//Creo le opzioni
        Opzione opzione1 = new Opzione("Tocca sfera A",image,image2);
        Opzione opzione2 = new Opzione("Tocca sfera B quando A è accesa",image2,image3);
        Opzione opzione3 = new Opzione("Tocca sfera B quando A è spenta",image,image);
        //Creo il generatore di id che assegnerà ad ogni variabile un id diverso
        GeneraId id = new GeneraId(1);
        
        Stampa stampa = new Stampa();
        //Creo le maschere e modifico gli id delle variabili di stato per renderle uniche
        Maschera maschera1 = new Maschera("mask1",opzione1);
        id.assegnaId(maschera1.getVariabiliCheCambiano());
        id.setInizio(maschera1.getVariabiliCheCambiano().size());
        Maschera maschera2 = new Maschera("mask2",opzione2);
        id.assegnaId(maschera2.getVariabiliCheCambiano());
        id.setInizio(maschera2.getVariabiliCheCambiano().size());
        Maschera maschera3 = new Maschera("mask3",opzione3);
        id.assegnaId(maschera3.getVariabiliCheCambiano());
        id.setInizio(maschera3.getVariabiliCheCambiano().size());
        //Creo la lista di maschere
        List<Maschera> maschere = new LinkedList<Maschera>();
        maschere.add(maschera1);
        maschere.add(maschera2);
        maschere.add(maschera3);
        //Genero tutti i fattori
        GeneratoreFattori generaFattori= new GeneratoreFattori(maschere);
       
        List<Fattore> fattori = generaFattori.fattorizzazione();
        int i=1;
        for(Fattore f : fattori){
        	System.out.println("Nome fattore: " + f.getNome());
        	System.out.println("Nome opzione: " + f.getOpzioni().get(0).getNome());
        	System.out.println("Numero variabili di stato: " + f.getVariabili().size());
        	stampa.stampaListaSuFile(f.getVariabili(),"fattore"+i+".txt");
        	i++;
        }
        
        System.out.println("Numero fattori: " + fattori.size());
        
		stampa.stampaListaSuFile(maschera1.getVariabiliCheCambiano(),"mask1.txt");
		stampa.stampaListaSuFile(maschera2.getVariabiliCheCambiano(),"mask2.txt");
		stampa.stampaListaSuFile(maschera3.getVariabiliCheCambiano(),"mask3.txt");
	}
}