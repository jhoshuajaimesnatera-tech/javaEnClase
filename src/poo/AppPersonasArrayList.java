package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class AppPersonasArrayList {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<>();

		personas.add(new Persona("Ana García", 25));
		personas.add(new Persona("Carlos López", 17));
		personas.add(new Persona("María Rodríguez", 30));
		personas.add(new Persona("Juan Martínez", 16));
		personas.add(new Persona("Laura Pérez", 22));

		System.out.println("\n == TODAS LAS PERSONAS ==");
		for (Persona persona : personas) {
			System.out.println(persona);
		}

		System.out.println( "\n== LA EDAD DE LOS MAYORES ==");
		for(Persona persona : personas){
			if(persona.getEdad() >= 18)
				System.out.println(persona);
		}
	}

}

