package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TamañoArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner sr = new Scanner(System.in);
		int num;
		System.out.println("Dime el numero que quieres guardar: ");
		do{
			num = sr.nextInt();
			if(num == -1) {
				break;
			}
			numeros.add(num);
		
		}while(num != -1);
		
		System.out.print("El primero es:" + numeros.get(0) +" "+ "y el ultimo es:" +numeros.get(numeros.size()-1));
		
		sr.close();
	}

}
