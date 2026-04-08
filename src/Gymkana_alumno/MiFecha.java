package Gymkana_alumno;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class MiFecha {
	public static void main(String[] args) {
	LocalDate fechaNacimiento = LocalDate.of(2004, 5, 4);
	Locale idioma = Locale.forLanguageTag("es");
	
	System.out.println("Dia:" + fechaNacimiento.getDayOfMonth());
	System.out.println("Mes:" + fechaNacimiento.getMonth().getDisplayName(TextStyle.FULL, idioma).toUpperCase());
	System.out.println("Año:" + fechaNacimiento.getYear());
	System.out.println("Dia de la semana: " + fechaNacimiento.getDayOfWeek().getDisplayName(TextStyle.FULL, idioma));
	}
}
