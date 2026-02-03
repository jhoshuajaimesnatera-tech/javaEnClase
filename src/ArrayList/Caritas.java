package ArrayList;

import java.util.ArrayList;

public class Caritas {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("(` ^ ´)");
		lista.add("(T - T)");
		lista.add("(> w <)");
		lista.add("(^ u ^)");
		lista.add("(O v O)");
		lista.add("(U w U)");
		
		for(int i=0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("-------------------");
		
		for (String caritas : lista) {
			System.out.println(caritas);
		}
	}

}
