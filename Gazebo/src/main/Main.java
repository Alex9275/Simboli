package main;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import elementi.Fattore;
import elementi.Maschera;
import elementi.Opzione;
import generatore.GeneratoreFattori;
import immagini.Immagine;
import stampa.Stampa;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Immagine image = new Immagine("C:/Users/alex/Desktop/SfereGazebo/SfereSpente.jpg");
		Immagine image2 = new Immagine("C:/Users/alex/Desktop/SfereGazebo/SferaAaccesa.jpg");
		Immagine image3 = new Immagine("C:/Users/alex/Desktop/SfereGazebo/SfereAccese.jpg");

        Opzione opzione1 = new Opzione("op1",image,image2);
        Opzione opzione2 = new Opzione("op2",image2,image3);
        Opzione opzione3 = new Opzione("op3",image,image);
        
        Maschera maschera1 = new Maschera("mask1",opzione1,0);
        Maschera maschera2 = new Maschera("mask2",opzione2,maschera1.getDimensioneLista());
        Maschera maschera3 = new Maschera("mask3",opzione3,maschera2.getDimensioneLista());
        
        List<Maschera> maschere = new LinkedList<Maschera>();
        maschere.add(maschera1);
        maschere.add(maschera2);
        maschere.add(maschera3);
        
        GeneratoreFattori generaFattori= new GeneratoreFattori(maschere);
        
        Stampa stampa = new Stampa();
        
        List<Fattore> fattori = generaFattori.fattorizzazione();
        int i=1;
        for(Fattore f : fattori){
        	System.out.println(f.getNome());
        	System.out.println(f.getVariabili().size());
        	stampa.stampaListaSuFile(f.getVariabili(),"fattore"+i+".txt");
        	i++;
        }
        
        System.out.println(fattori.size());
        
		
		System.out.println("test generatore.");


		/*stampa.stampaListaSuFile(maschera1.getVariabiliCheCambiano(),"mask1.txt");
		stampa.stampaListaSuFile(maschera2.getVariabiliCheCambiano(),"mask2.txt");
		stampa.stampaListaSuFile(maschera3.getVariabiliCheCambiano(),"mask3.txt");*/
		

		
		System.out.println("ok.");
	}
}