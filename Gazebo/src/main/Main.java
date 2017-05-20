package main;
import java.io.IOException;
import immagini.Immagine;
import immagini.MatricePixel;
import stampa.Stampa;

public class Main {

	public static void main(String[] args) throws IOException {
		Immagine image = new Immagine("C:/Users/alex/Desktop/SfereGazebo/SferaAaccesa.jpg");
		MatricePixel matrice = new MatricePixel();
		Stampa stampa = new Stampa();
		int a = image.getAltezza();
		int b = image.getLunghezza();
		int[][] matriceRossa = matrice.creaMatriceRossa(image);
		int[][] matriceBlu = matrice.creaMatriceVerde(image);
		int[][] matriceVerde = matrice.creaMatriceBlu(image);
		stampa.stampaMatriceFile(matriceRossa,"rosso");
		stampa.stampaMatriceFile(matriceBlu,"blu");
		stampa.stampaMatriceFile(matriceVerde,"verde");
		System.out.println("Larghezza:"+ b +" Altezza:"+ a);
	}
}
