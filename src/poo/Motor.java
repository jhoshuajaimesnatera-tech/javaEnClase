package poo;

public class Motor {
	
	private String tipo;
	private int potencia;
	
	public Motor(String tipo, int potencia) {
		this.tipo=tipo;
		this.potencia=potencia;
	}

	public  String getInfo() {
		
		return "de " + tipo + " y su potencia es de  " + potencia;
	}
}
