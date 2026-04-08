package Exenciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TipoDatoErroneo {
	static Scanner sc = new Scanner(System.in);
	
	public static int leerEntero() {
		int enteroLeido;
		while(true) {
			System.out.println("Dime un numero entero");
			try{
				enteroLeido = sc.nextInt();
				return enteroLeido;
			}catch(InputMismatchException e) {
				System.out.println("eso no es un numero entero");
				sc.nextLine();
			}

		}
	}
	
	public static void main(String[] args) {
		System.out.println("Numero introducido: " + leerEntero());
	
		sc.close();
	}
}
