package Juegos;

import java.util.Scanner;
import Juegos.TresEnRaya;
import Juegos.TresEnRayaMisery;

public class AppJuegos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eleccion;
		
		do {
			System.out.println("¿A qué quieres jugar?");
			System.out.println("1-Tres en raya");
			System.out.println("2-Tres en raya miseria");
			System.out.println("0-Salir");
			eleccion=sc.nextInt();
			
		
	
		
		switch(eleccion) { 
		case 1:
			TresEnRaya partida = new TresEnRaya("Jhos", 'X', "Isa", 'O');
			partida.inicio();
			break;
		case 2:
			TresEnRayaMisery partida2 = new TresEnRayaMisery("Jhos", 'X', "Isa", 'O');
			partida2.inicio();
			break;
		case 0:
			System.out.println("Vuelve pronto!");
		}	}while(eleccion!=0);
		
		

	}

}
