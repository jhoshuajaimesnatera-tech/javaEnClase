package Herencia;

public class EnsamblajeMovil {
	
	public final void  fabricar() {
		colocarPlaca();
		colocarPantalla();
		empaquetar();
	}
	
	public void colocarPlaca() {
		System.out.println("Colocando placa");
	}
	
	public void colocarPantalla() {
		System.out.println("Colocando pantalla LCD estandar");
	}
	
	public void empaquetar() {
		System.out.println("Empaquetando");
	}
}
