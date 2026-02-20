package Herencia;

import java.util.ArrayList;

public class Carrito {

	public static void main(String[] args) {
		ArrayList<Producto> Productos = new ArrayList<>();
		
		Producto smartphone = new Smartphone("Nokia", 32.0, 4);
		Producto television = new Television("Samsung", 100.0, 32);
		
		Productos.add(television);
		Productos.add(smartphone);
		
		System.out.println(Productos);
	}

}
