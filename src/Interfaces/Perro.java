package Interfaces;

public class Perro extends Animales {

	public Perro(String nombre, int edad) {
		super(nombre, edad);
	}
	

	@Override
	public void respirar() {
		super.respirar();
	}

	@Override
	public void hacerSonido() {
		System.out.println(getNombre() + " Guau Guau");
	}

	
}
