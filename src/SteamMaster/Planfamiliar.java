package SteamMaster;

public class Planfamiliar extends Suscripcion{
	private double plus= 0.4;
	private int maxPerfiles = 5;

	public Planfamiliar(String nombre, double precioBase) {
		super(nombre, precioBase);
	}

	@Override
	protected double calcularPrecio() {
		return getPrecioBase()*(1+plus);
	}

	@Override
	// posible refactorizacion subir al padre el atributo e inicializarlo en el dconstructor
	protected int getMaxPerfiles() {
		return maxPerfiles;
	}
	
	
}
