package stampa;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import elementi.VariabileDiStato;

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

	public void stampaListaSuFile(List<VariabileDiStato> x,String file) throws IOException {
		FileWriter w;
		String s;
		
		w=new FileWriter(file);
		BufferedWriter b;
		b=new BufferedWriter(w);
		
			for(VariabileDiStato v : x) {
				s= v.toString();
				if(s!="")
					b.write(s+"   ");
			}
			b.write("\n");
		
		b.flush();
		b.close();
	}

}
