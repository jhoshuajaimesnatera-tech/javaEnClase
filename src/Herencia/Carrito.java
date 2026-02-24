package Herencia;

import java.util.ArrayList;

public class Carrito {

	public static void main(String[] args) {
		ArrayList<Producto> Productos = new ArrayList<>();
		
		Producto smartphone1 = new Smartphone("Nokia", 32.0, 4);
		Producto television1 = new Television("Samsung", 100.0, 32);
		
		Productos.add(television1);
		Productos.add(smartphone1);
		
		System.out.println(Productos);
	}

}
