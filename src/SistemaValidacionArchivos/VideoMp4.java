package SistemaValidacionArchivos;

public class VideoMp4 extends Video {

	public VideoMp4(int length) {
		super(length);
	}

	@Override
	public boolean isValid() {
		if(getLength() < 300) {
			return true;
		}else {
			return false;
		}
	}
}
