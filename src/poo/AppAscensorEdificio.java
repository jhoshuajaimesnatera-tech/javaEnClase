package poo;

public class AppAscensorEdificio {

	public static void main(String[] args) {
		Edificio torre = new Edificio ("TorreCentral", 10, 0);
		Edificio parking = new Edificio ("ParkingSubterráneo", 0, -3);
		
		torre.ordenarSubir(5);
		torre.ordenarSubir(8);
		torre.ordenarBajar(5);
 
		parking.ordenarBajar(2);
		parking.ordenarSubir(1);
		parking.ordenarBajar(5);
		parking.ordenarBajar(2);
	}

}
