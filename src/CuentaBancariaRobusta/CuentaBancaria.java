package CuentaBancariaRobusta;

public class CuentaBancaria {
	private double saldo;

	public CuentaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void retirar (double cantidad) {
		if(cantidad <= 0){
			throw new IllegalArgumentException("La cantidad del retiro no puede ser negativa");
		}else if (cantidad > saldo){
			throw new IllegalArgumentException("La cantidad del retiro supera tu saldo actual");
		}else {
			this.saldo -= cantidad;
			System.out.println(getSaldo());
		}
	}
}
