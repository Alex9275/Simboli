package main;
import java.io.IOException;
import java.util.List;

import elementi.Maschera;
import elementi.Opzione;
import elementi.VariabileDiStato;
import generatore.GeneratoreVariabiliDiStato;
import immagini.Immagine;
import immagini.ListaPixel;
import stampa.Stampa;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Immagine image = new Immagine("/Users/federicogiulianelli/Desktop/SfereSpente.jpg");
		Immagine image2 = new Immagine("/Users/federicogiulianelli/Desktop/SferaAaccesa.jpg");
		Immagine image3 = new Immagine("/Users/federicogiulianelli/Desktop/SfereAccese.jpg");

        Opzione opzione1 = new Opzione("op1",image,image2);
        Opzione opzione2 = new Opzione("op2",image2,image3);
        Opzione opzione3 = new Opzione("op3",image,image);
        
        Maschera maschera1 = new Maschera("mask1",opzione1);
        Maschera maschera2 = new Maschera("mask2",opzione2);
        Maschera maschera3 = new Maschera("mask3",opzione3);
        
        maschera1.aggiornaLista();
        maschera2.aggiornaLista();
        maschera3.aggiornaLista();
        
        Stampa stampa = new Stampa();
	
		
		System.out.println("test generatore.");


		stampa.stampaListaSuFile(maschera1.getVariabiliCheCambiano(),"mask1.txt");
		stampa.stampaListaSuFile(maschera2.getVariabiliCheCambiano(),"mask2.txt");
		stampa.stampaListaSuFile(maschera3.getVariabiliCheCambiano(),"mask3.txt");


		
		System.out.println("ok.");
	}
}