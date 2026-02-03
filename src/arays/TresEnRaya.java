package arays;
import java.util.Arrays;
import java.util.Scanner;
public class TresEnRaya {
	
	static char [][] tablero = new char[3][3];
	
	public static void mostrarTablero() {
		System.out.println("\n tablero actual \n-------------------");
		for(int i = 0; i <tablero.length; i ++ ) {
			for(int j= 0; j <tablero[i].length; j ++ ) {
				System.out.print(tablero[i][j] +" \t");
			}
			System.out.println();
		}
		
	}
	
	public static boolean colocarFicha(int fila, int columna, char ficha ){
		if(tablero[fila][columna] == '-') {
			tablero[fila][columna]=ficha;
			return true;
		}else {
			System.out.println("ya hay una ficha colocada");
			return false;
		}
	}
	
	public static boolean finPartida() {
		//hay 3 en raya en la horizontal
		for (int i=0; i < tablero.length;i++) {
			if ((tablero[i][0]==tablero[i][1] && tablero[i][1]==tablero[i][2])  && tablero[i][0]!='-') {
				return true;
			}
		}
		//Comprobamos las columnas
		for (int j=0; j< tablero[0].length;j++) {
			if ((tablero[0][j]==tablero[1][j] && tablero[1][j]==tablero[2][j]) && tablero[0][j]!='-') {
				return true;
			}
		}
		//Ahora con las diagonales
		if ((tablero[0][0]==tablero[1][1] && tablero[1][1]==tablero[2][2] && tablero[0][0]!='-')
				||
		    (tablero[0][2]==tablero[1][1] && tablero[1][1]==tablero[2][0])  && tablero[0][2]!='-') {
			return true;
		}
		//Si llegamos aquí es que nadie ganó aun
		return false;
	}
	
	public static boolean hayEmpate() {
		for (int i=0; i < tablero.length; i++){
			for (int j=0; j < tablero.length; j++) {
				if (tablero[i][j]=='-') {
					return false;
				}
			}
		}
		return true;
	}

	
	public static void crearTablero() {
		for(int i = 0; i <tablero.length; i ++ ) {
			Arrays.fill(tablero[i], '-');
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ficha1, ficha2;
		int fila, columna;
		int jugadorActivo;
		boolean fichaColocada;
		System.out.println("Dime que quieres usar X o O jugador1");
		ficha1 = sc.next().charAt(0);
		System.out.println("Dime que quieres usar X o O jugador 2");
		ficha2 = sc.next().charAt(0);
		
		boolean turnoJugador1=true;
		
		crearTablero();
		do {
			do {
				jugadorActivo = (turnoJugador1) ? 1 : 2;
				System.out.println("turno del jugador" + jugadorActivo);
				System.out.println("Dime la fila donde quieres poner la ficha (1-3) ");
				fila  = sc.nextInt()-1;
				System.out.println("Dime la columna donde quieres poner ficha (1-3) ");
				columna = sc.nextInt()-1;
				/*if(turnoJugador) {
					fichaColocada=colocarFicha(fila,columna,ficha1);
				}else {
					fichaColocada=colocarFicha(fila,columna,ficha2);
				}*/
				fichaColocada = (turnoJugador1) ? colocarFicha(fila, columna, ficha1) : colocarFicha(fila, columna, ficha2);
			
			}while(!fichaColocada);
			mostrarTablero();
			turnoJugador1 =! turnoJugador1;
		}while(finPartida()==false && hayEmpate()==false);

		if(hayEmpate()) {
			System.out.println("Empate");
		}else {
			System.out.println("Ha ganado el jugador " + jugadorActivo);
		}
		
		System.out.println(finPartida());
		sc.close();
	}

}
