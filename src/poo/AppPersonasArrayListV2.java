package poo;

import java.util.Scanner;
import java.util.ArrayList;

public class AppPersonasArrayListV2 {

	private static Scanner sc = new Scanner(System.in);

	private static void agregarPersonas(ArrayList<Persona> pers) {
		String nombre;
		int edad;

		System.out.println("\n ¿Como te llamas ?");
		nombre = sc.nextLine();
		System.out.println("Y cusntos años tienes");
		edad = sc.nextInt();

		sc.nextLine();
		/**
		Persona per = new Persona(nombre, edad);
		if(pers.contains(pers)) {
			System.out.println("Esa persona ya existe");
		}else {
			pers.add(per);
		}
		 */
		boolean esta=false;
		for(Persona per : pers) {
			if(per.getNombre().equals(nombre)) {
				System.out.println("Esa persona ya existe");
			}
		}
		if (!esta) {
			pers.add(new Persona(nombre, edad));
		}
	}

	public static void eliminarPersona(ArrayList<Persona> pers) {
		String nombre;
		System.out.println("\n ¿A quien eliminamos?");
		nombre = sc.nextLine();

		for(int i=0; i <pers.size();i++) {
			if(pers.get(i).getNombre().equals(nombre)) {
				pers.remove(i);
				break;
			}
		}
	}

	public static void mostrarPersonas(ArrayList<Persona> pers) {
		for (Persona persona : pers) {
			System.out.println(persona.toString());
		}
	}

	public static void main (String[] args) {
		ArrayList<Persona> personas = new ArrayList<>();
		int opcion;
		do {

			System.out.println("¿Qué te gustaría hacer?");
			System.out.println("1-Añadir una persona");
			System.out.println("2-Eliminar una persona");
			System.out.println("3-Mostrar el listado de personas");
			System.out.println("4-Salir");

			System.out.println("¿qué eliges?");
			opcion=sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				agregarPersonas(personas);
				break;
			case 2:
				eliminarPersona(personas);
				break;
			case 3:
				mostrarPersonas(personas);
				break;
			case 4:
				System.out.println("Hasta luego!");
			default:
				System.out.println("Elige una opción valida");

			}


		}while(opcion!=4); 

		//Otra forma de mostrarlos
		for (Persona persona : personas) {
			System.out.println("Soy " +  persona.getNombre() + " y tengo " + persona.getEdad() + " años");

			System.out.println(persona.toString());
		}

		//Ahora solo los mayores de edad
		for (int i=0; i<personas.size();i++) {
			if (personas.get(i).getEdad()>=18) {
				System.out.println(personas.get(i).toString());
			}
		}

		//Lo mismo que el anterior, pero con foreach
		for (Persona persona : personas) {
			if(persona.getEdad()>=18) {
				System.out.println(persona.toString());
			}
		}


	}

}