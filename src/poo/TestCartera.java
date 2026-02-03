package poo;

public class TestCartera {

	public static void main(String[] args) {
		Cartera cartera1 = new Cartera ("Alan Turing", 200);
		Cartera MiCartera = new Cartera ("Alan Turing", -1000);
		
		MiCartera.consultarSaldo();
		cartera1.retirar(500);
		cartera1.consultarSaldo();
		cartera1.ingresar(50);
		cartera1.retirar(20);
		cartera1.consultarSaldo();
	}

}
