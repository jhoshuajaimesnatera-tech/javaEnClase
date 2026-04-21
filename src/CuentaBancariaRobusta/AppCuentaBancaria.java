package CuentaBancariaRobusta;

public class AppCuentaBancaria {

	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaBancaria(1800.00);
		CuentaBancaria cuenta2 = new CuentaBancaria(1000.00);
		
		try {
			cuenta1.retirar(1000);	
			cuenta2.retirar(100050);
		}catch(IllegalArgumentException e) {
			System.out.println("Error " + e.getMessage());
		}
	}

}
