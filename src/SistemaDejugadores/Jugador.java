package SistemaDejugadores;

public class Jugador {
	private static int numeroJugadores=0;
	private static int puntuacionMax=0;
	
	private String nombre;
	private int puntuacionActual;
	private String identificador;
	
	public Jugador(String nombre, int punticionActual) {
		numeroJugadores++;
		this.identificador= String.format("j%03d", numeroJugadores);
		this.nombre = nombre;
		this.puntuacionActual = punticionActual;
		// this.identificador = identificador;
		if(this.puntuacionActual > puntuacionMax) {
			puntuacionMax = this.puntuacionActual;
		}
	}
	public String getnombre() {
		return this.nombre;
	}
	
	public int getPuntuacionActual() {
		return this.puntuacionActual;
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
	
	public void getIfoJuagdor() {
		System.out.println("Nombre:" + nombre + ", Puntuacion:" + puntuacionActual + ", ID:" + identificador);
	}
	
	public static int getNumeroJugadores() {
		return numeroJugadores;
	}
	
	public static int getpuntuacionMaxima() {
		return puntuacionMax;
	}
	
	public static void mostrarResumen() {
		System.out.println("Este es el numero de jugadores:" + numeroJugadores + ", Puntuacion Maxima:" + puntuacionMax);
	}
}
