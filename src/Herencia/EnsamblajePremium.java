package Herencia;

public class EnsamblajePremium extends EnsamblajeMovil {

	@Override
	public void colocarPantalla() {
		System.out.println("Colocando pantalla OLED curva");
	}

	@Override
	public void empaquetar() {
		System.out.println("Empaquetando en caja de lujo con auriculares");
	}
	
}
