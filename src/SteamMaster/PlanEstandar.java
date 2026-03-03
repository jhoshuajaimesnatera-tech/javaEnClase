package SteamMaster;

public class PlanEstandar extends Suscripcion {
	private int maxPerfiles=1;
	public PlanEstandar(String nombre, double precioBase) {
		super(nombre, precioBase);
	}
	
	public int getMaxPerfiles() {
		return maxPerfiles;
	}
	
	@Override
	public double calcularPrecio() {
		return getPrecioBase();
	
	}
	
}
