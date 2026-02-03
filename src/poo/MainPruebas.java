package poo;

public class MainPruebas {

	public static void main(String[] args) {
		// Un error o un ataque puede poner el saldo en negativo
		Cartera.saldo = -5000.0;
		System.out.println("Titular: " + Cartera.titular);
		System.out.println("Saldo actual: " + Cartera.saldo);
	}

}

