package immagini;

public class Pixel {
	private int value;

	public Pixel(int i) {
		this.value = i;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Pixel v = (Pixel)obj;
		return this.getValue() == v.getValue();
	}

}