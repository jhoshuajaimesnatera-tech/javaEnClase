package Herencia;

public class Coche extends Veiculo {
	private int puertas;
	
	public Coche(String marca, String modelo, int puertas) {
		super(marca, modelo);
		this.puertas = puertas;
	}
	
	public String toString() {
		return "Coche marca: " + marca + ", modelo: " + modelo + ", numero de puertas: " + puertas;
	}


}
