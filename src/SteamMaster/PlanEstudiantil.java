package SteamMaster;

public class PlanEstudiantil extends Suscripcion {
	private int maxPerfiles=1;
	private double plus=0.5;
	
	public PlanEstudiantil(String nombre, double precioBase) {
		super(nombre, precioBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calcularPrecio() {
		return getPrecioBase() * plus;
	}

	@Override
	protected int getMaxPerfiles() {
		return maxPerfiles;
	}
	
}
