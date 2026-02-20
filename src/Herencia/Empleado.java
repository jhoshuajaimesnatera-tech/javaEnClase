package Herencia;

public class Empleado {
	private String nombre;
	private double salarioBase;
	public Empleado(String nombre, double salarioBase) {
		this.nombre = nombre;
		this.salarioBase = salarioBase;
	}
	
	public void getInfoEmpleado() {
		System.out.println("Nombre: " + nombre + " Salario: " + calcularSalario());
	}
	
	public double calcularSalario() {
	 return  salarioBase;
	}
	
	
}
