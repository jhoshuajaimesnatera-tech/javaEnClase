package SistemaValidacionArchivos;

public class DocumentoPDF extends Documento{

	public DocumentoPDF(long tamanio) {
		super(tamanio);
	}

	@Override
	public boolean isValid() {
		if(getTamanio() < 1048576) {
			return true;
		}else {
			return false;
		}

	}

}
