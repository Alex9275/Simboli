package stampa;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Stampa {
	public Stampa(){

	}
	public void stampaMatrici(int[][] x) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print("\t"+x[i][j]);
			}
			System.out.println();
		}
	}

	public void stampaMatriceFile(int[][] x,String colore) throws IOException {
		FileWriter w;
		String s;
		colore=nomeFile(colore);
		w=new FileWriter(colore);
		BufferedWriter b;
		b=new BufferedWriter(w);
		for(int i=0;i<x[i].length;i++) {
			for(int j=0;j<x.length;j++) {
				s=Integer.toString(x[j][i]);
				if(s!="")
					b.write(s+"   ");
			}
			b.write("\n");
		}
		b.flush();
		b.close();
	}
	private String nomeFile(String colore) {
		String s;
		if(colore.equals("rosso")) s="MatriceRossa.txt";
		else if(colore.equals("blu")) s="MatriceBlu.txt";
		else s="MatriceVerde.txt";
		return s;
	}
}
