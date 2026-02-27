package SistemaDejugadores;

import java.util.ArrayList;

public class AppJuagdor {
	public static void main(String[] args) {
		ArrayList<Jugador> Jugadores = new ArrayList<>();
		
		Jugador j1 = new Jugador("Isa", 500);
		Jugador j2 = new Jugador("Jhos", 501);
		Jugador j3 = new Jugador("Brayan", 475);
		
		Jugadores.add(j1);
		Jugadores.add(j2);
		Jugadores.add(j3);
		
		for(Jugador j : Jugadores) {
			j.getIfoJuagdor();
		}
		
		Jugador.mostrarResumen();
		
	}
}
