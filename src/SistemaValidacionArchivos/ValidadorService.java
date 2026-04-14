package SistemaValidacionArchivos;

public class ValidadorService {
	private Validable[] fichero;

	public ValidadorService(Validable[] ficheros) {
		this.fichero = ficheros;
	}
	
	public boolean validarTodo() {
		for(Validable v: fichero) {
			if(v.isValid()==false) { //manera pro !v.isValid()
				return false;
			}
		}
		return true;
	}
	
	public static boolean validarFichero(Validable fichero) {
		return fichero.isValid();
	}
}
