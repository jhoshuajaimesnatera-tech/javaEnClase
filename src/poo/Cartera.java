package poo;

public class Cartera {

	private String titular;
	private double saldo;

	public Cartera(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		
	}
	
	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			saldo += cantidad;
		}else {
			System.out.println("No se puede ingresar numeros negativos");
		}
	}

	public void retirar(double cantidad) {
		if(cantidad > 0 && cantidad <= this.saldo) {
			this.saldo -= cantidad;
		}else {
			System.out.println("Error o saldo insuficiente");
		}
	}
	
	public void consultarSaldo() {
		System.out.println("Este es tu saldo: " + this.saldo);
	}
}

