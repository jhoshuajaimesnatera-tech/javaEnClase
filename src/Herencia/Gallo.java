package Herencia;

public class Gallo extends Ave {
	private boolean estaAfonico;

	public Gallo(String nombre) {
		super(nombre);
		this.estaAfonico = false;
	}
	
	public void ponerAfonico() {
		estaAfonico=true;
	}
	
	public void cuararAfonico() {
		estaAfonico=true;
	}
	
	public boolean isEstaAfonico() {
		return estaAfonico;
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		super.volar();
		System.out.println("Pero no muy alto ya que soy una gallo");
	}
}
