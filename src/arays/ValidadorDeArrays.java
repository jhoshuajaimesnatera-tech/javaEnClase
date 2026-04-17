package arays;

import java.util.Scanner;

public class ValidadorDeArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {5, 4, 3, 2, 1};
		
		try {
			System.out.println("Indica un indice (0-4): ");
			int indice = sc.nextInt();
			System.out.println("En posicion: " + indice + " tenemos el valor: " + arr[indice]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Estas tratando de acceder a un indice que no existe");
		}
		
		sc.close();
	}

}
