package Interfaces;

public class Pato extends Animales implements Volador, Nadador {

	public Pato(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void zambullirse() {
		System.out.println(getNombre() + " Se zambulle");
		
	}

	@Override
	public void nadar(int metros) {
		System.out.println(getNombre() + " nada " + metros + " metros");
	}

	@Override
	public void salirDelAgua() {
		System.out.println(getNombre() + " Sale del agia");
	}

	@Override
	public void despegar() {
		System.out.println(getNombre() + " Despega");
	}

	@Override
	public void volar(int altitud) {
		System.out.println(getNombre() + " Vuela a " + altitud + " de altura");
	}

	@Override
	public void aterrizar() {
		System.out.println(getNombre() + " Aterriza");
	}

	@Override
	public void hacerSonido() {
		System.out.println(getNombre() + " guac guac");
	}

	
}
