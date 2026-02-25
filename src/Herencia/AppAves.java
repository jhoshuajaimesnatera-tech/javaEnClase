package Herencia;

public class AppAves {

	public static void main(String[] args) {
		Ave gallina = new Gallina("Turu");
		Ave gallo = new Gallo("Claudio");
		((Gallina)gallina).ponerHuevo();
	}

}
