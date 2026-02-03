package poo;

public class Edificio {

	private String nombre;
	private int pisoMax;
	private int pisoMin;
	private Ascensor ascensorPrincipal;
	 
	public Edificio(String nombre, int pisoMax, int pisoMin) {
		this.nombre = nombre;
		this.pisoMax = pisoMax;
		this.pisoMin = pisoMin;
		
		this.ascensorPrincipal = new Ascensor();
	}
	
	public void ordenarSubir(int cuantosPisos) {
		System.out.println("\n[SISTEMA " + nombre + "]: Petición de subir " + cuantosPisos + " pisos.");
		int destinoFinal = ascensorPrincipal.getPisoActual() + cuantosPisos;

		if (destinoFinal <= pisoMax) {
			// DELEGACIÓN: Si es seguro, el edificio le da la orden al objeto ascensor
			ascensorPrincipal.subir(cuantosPisos);
		} else {
			System.out.println("ERROR SEGURIDAD: El piso " + destinoFinal + " excede el límite de la " + nombre);
		}

	}

	
	public void ordenarBajar(int cuantosPisos) {
		System.out.println("\n[SISTEMA " + nombre + "]: Petición de bajar " + cuantosPisos + " pisos.");
		int destinoFinal = ascensorPrincipal.getPisoActual() - cuantosPisos;
		if (destinoFinal >= pisoMin) {
			ascensorPrincipal.bajar(cuantosPisos);
		} else {
			System.out.println("ERROR SEGURIDAD: El piso " + destinoFinal + " está por debajo del sótano.");

		}
	}
}
