package Interfaces;

public class AppAnimales {

	public static void main(String[] args) {
		Animales a = new Perro("Bruno", 5);
		Animales b = new Aguila("Fenix", 2);
		
		a.hacerSonido();
		a.respirar();
		
		b.hacerSonido();
		b.respirar();
		
		Avion v = new Avion("b6542");
		
		Pato p = new Pato("Juan", 5);
		Pato pa = new Pato("Paco", 6);
		
		
		ejecutarVuelo((Aguila)b, 30);
		ejecutarVuelo(v, 1200);
		
		ejecutarVuelo(p, 1200);
		ejecutarNado(pa, 30);
	}

	public static void ejecutarVuelo (Volador v, int metros) {
		System.out.println("iniciando vuelo:");
		v.despegar();
		v.volar(metros);
		v.aterrizar();
	}
	
	public static void ejecutarNado(Nadador n, int metros) {
		System.out.println("iniciando nado");
		n.zambullirse();
		n.nadar(metros);
		n.salirDelAgua();
	}
}
