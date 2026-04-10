package SistemaValidacionArchivos;

public class DocumentoOPDf extends Documento{

	public DocumentoOPDf(long tamanio) {
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
