package Interfaces;

public class Aguila extends Animales implements Volador{

	
	
	public Aguila(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void respirar() {
		super.respirar();
	}

	@Override
	public void hacerSonido() {
		System.out.println(getNombre() + " Caaaa");
	}
	

	@Override
	public void despegar() {
		System.out.println(getNombre() + " Despliega sus alas y despega");
	}

	@Override
	public void volar(int altitud) {
		System.out.println(getNombre() + " Esta volando a una altura de " + altitud);
	}

	@Override
	public void aterrizar() {
		System.out.println(getNombre() + " Se posa en una rama ");
	}
	
}
