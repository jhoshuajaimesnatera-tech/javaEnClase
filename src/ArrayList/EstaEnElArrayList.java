package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class EstaEnElArrayList {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		Scanner sr = new Scanner(System.in);
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add("Andres");
		nombres.add("Pablo");

		System.out.println("Dime un nombre y te dire si esta en el ArrayList");
		String nombre = sr.nextLine();
		boolean esta=false;

		for(String n: nombres ) {
			if(n.equals(nombre)) {
				esta=true;
				break;
			}
		}
		if(esta=true) {
			System.out.println("Si esta en la lista");
		}else {
			System.out.println("No esta en la lista");
		}
		
		// ahora con un metodo de ArrayList
		if(nombre.contains(nombre)) {
			System.out.println("Si esta en la lista");
		}else {
			System.out.println("No esta en la lista");
		}
		
		sr.close();
	}

}
