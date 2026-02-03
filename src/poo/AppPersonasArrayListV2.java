package poo;

import java.util.Scanner;
import java.util.ArrayList;

public class AppPersonasArrayListV2 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void agregarPersonas(ArrayList<Persona> pers) {
		String nombre;
		int edad;
		
		System.out.println("\n ¿Como te llamas ?");
		nombre = sc.nextLine();
		System.out.println("Y cusntos años tienes");
		edad = sc.nextInt();
		
		sc.nextLine();
		
		Persona per = new Persona(nombre, edad);
		pers.add(per);
		
	}
	
	
	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<>();

	}

}
