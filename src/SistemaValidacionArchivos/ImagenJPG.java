package SistemaValidacionArchivos;

public class ImagenJPG extends Imagen {

	public ImagenJPG(int width, int height) {
		super(width, height);
	}

	@Override
	public boolean isValid() {
		if(getHeight() * getWidth() < 5000000) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
