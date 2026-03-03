package SteamMaster;

import java.util.ArrayList;

public abstract class Suscripcion{
	protected String nombre;
	protected double precioBase;
	protected ArrayList<Perfiles> perfiles = new ArrayList<>();
	
	protected Suscripcion(String nombre, double precioBase) {
		this.nombre = nombre;
		if(precioBase < 1) {
			this.precioBase=100;
		}else {
		this.precioBase = precioBase;
		}
	}

	public String getNombre() {
		return nombre;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}


	protected abstract double calcularPrecio();
	
	protected abstract int getMaxPerfiles();
	
	protected void añadirPerfil(Perfiles p) {
		if(getPerfiles().size()>=getMaxPerfiles()) {
			System.out.println("Tu lista de perfiles ya esta llena");
		}else {
			getPerfiles().add(p);
		}
	}
	protected ArrayList<Perfiles> getPerfiles(){
		return perfiles;
	}
}
