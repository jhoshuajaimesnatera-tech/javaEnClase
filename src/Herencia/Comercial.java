package Herencia;

public class Comercial extends Empleado {
	private double comision;
	
	public Comercial (String nombre, int salarioBase, double comision) {
		super(nombre, salarioBase);
		this.comision = comision;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + comision;
	}

	

}
