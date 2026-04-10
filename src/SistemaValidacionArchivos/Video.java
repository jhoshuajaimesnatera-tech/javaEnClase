package SistemaValidacionArchivos;

public abstract class Video implements Validable{
	private int length;

	// recuesta no necesariamente necesitas aplicar el metodo de la interfas si es abstracta pero en el hijo si
	public Video(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}
	
}
