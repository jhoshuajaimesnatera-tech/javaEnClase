package SistemaValidacionArchivos;

public abstract class Imagen implements Validable {
	private int width;
	private int height;
	
	// recuesta no necesariamente necesitas aplicar el metodo de la interfas si es abstracta pero en el hijo si
	public Imagen(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

}
