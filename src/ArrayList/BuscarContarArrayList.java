package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BuscarContarArrayList {

	public static void main(String[] args) {
		ArrayList <Integer> numeros = new ArrayList<>();
		numeros.add(6);
		numeros.add(7);
		numeros.add(20);
		numeros.add(3);
		numeros.add(80);
		
		int mayor = numeros.get(0);
		int menor = numeros.get(0);
		int suma=0;
		int mayores10=0;
		
		for(int n : numeros) {
			suma+=n;
			if(n>10) {
				mayores10++;
			}
			if(n < menor) {
				menor = n;
				continue;
			}
			if(n > mayor) {
				mayor=n;
			}
		}
		
		System.out.println("El mayor es: " + mayor + " y el menor es: " + menor );
		System.out.println("Segun collections el meyor es : " + Collections.max(numeros) + " y el menor es: " + Collections.min(numeros));
		System.out.println("Esta es la suma de todos: " + suma);
		System.out.println("Cuantos son mayores a 10: " + mayores10);
	}

}
