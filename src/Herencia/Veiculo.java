package Herencia;

public class Veiculo {
	protected String marca;
	protected String modelo;
	
	public Veiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String toString() {
		return "Coche marca: " + marca + ", modelo: " + modelo ;
	}

}
