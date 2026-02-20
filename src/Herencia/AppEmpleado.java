package Herencia;

public class AppEmpleado {

	public static void main(String[] args) {
		Repartidor re = new Repartidor("Jom", 1000, 1);
		Repartidor re1 = new Repartidor("Juan", 1000, 2);
		
		re.getInfoEmpleado();
		re1.getInfoEmpleado();
		// ------------------------------------------------------
		Comercial co = new Comercial("Pepe", 1000, 500);
		Comercial co1 = new Comercial("Pablo", 1000, 600);
		
		co.getInfoEmpleado();
		co1.getInfoEmpleado();
	}

}
