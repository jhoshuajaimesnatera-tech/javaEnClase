package SteamMaster;

public class Perfiles {
	private String nombre;
	private int edad;
	
	public Perfiles(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Perfiles nombre=" + nombre + ", edad=" + edad;
	}

	
}
