package Herencia;

public class Television extends Producto {
	private int pulgadas;
	
	public Television(String nombre, double precio, int pulgadas) {
		super(nombre, precio);
		this.pulgadas = pulgadas;
	}

	@Override
	public String toString() {
		return super.toString() + " Es una television de " + pulgadas + " pulgadas";
	}
}
