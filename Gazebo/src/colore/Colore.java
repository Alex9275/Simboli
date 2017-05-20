package colore;

public class Colore {
	private String nome;
	private int rosso;
	private int blu;
	private int verde;

	public Colore(int rosso,int blu,int verde){
		this.rosso=rosso;
		this.blu=blu;
		this.verde=verde;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRosso() {
		return this.rosso;
	}

	public void setRosso(int rosso) {
		this.rosso = rosso;
	}

	public int getBlu() {
		return this.blu;
	}

	public void setBlu(int blu) {
		this.blu = blu;
	}

	public int getVerde() {
		return this.verde;
	}

	public void setVerde(int verde) {
		this.verde = verde;
	}
}
