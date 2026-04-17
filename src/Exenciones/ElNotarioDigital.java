package Exenciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ElNotarioDigital {

	public static void main(String[] args) {
		File miFichero = new File("registro.txt");
		PrintWriter escritor = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			escritor = new PrintWriter(miFichero);
			
			while(true) {
				System.out.println("Escribe una frase o un FIN");
				String frase = sc.nextLine();
				if(frase.equals("FIN")) {
					break;
				}else {
					escritor.println(frase);
				}
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("ERROR: EL FICHERO NO EXISTE");
		}finally {
			if(escritor!=null) {
				escritor.close();
			}
		}
		
		sc.close();
	}

}
