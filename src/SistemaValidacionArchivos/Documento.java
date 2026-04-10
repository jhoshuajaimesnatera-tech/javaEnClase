package SistemaValidacionArchivos;

public abstract class Documento implements Validable {
	private long tamanio;
	
	// recuesta no necesariamente necesitas aplicar el metodo de la interfas si es abstracta pero en el hijo si
	public Documento(long tamanio) {
		this.tamanio = tamanio;
	}

	public long getTamanio() {
		return tamanio;
	}

}
