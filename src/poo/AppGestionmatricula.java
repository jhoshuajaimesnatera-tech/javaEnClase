package poo;

public class AppGestionmatricula {

	public static void main(String[] args) {
		Estudiante estu1 = new Estudiante ("Eduardo");
		System.out.println("Me llamo " + estu1.getNombre() + " y mi matrucula es " + estu1.getNumMatricula());
		
		Estudiante estu2 = new Estudiante ("Paco");
		System.out.println("Me llamo " + estu2.getNombre() + " y mi matrucula es " + estu2.getNumMatricula());
		
		System.out.println(estu1.getSiguienteMatricula() + " " + estu2.getSiguienteMatricula());
		
		System.out.println (Estudiante.getSiguienteMatricula());
		
	}

}
