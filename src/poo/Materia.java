package poo;

import java.util.ArrayList;

public class Materia {
	private String nombre;
	private int codigoMateria;
	private  ArrayList<Estudiante> estudiantes;
	
	private static String facultad="UVA";
	private static int numeroMatricula=0;
	private static int genCodigoMateria=301;
	
	public Materia(String nombre, int maxPlazas) {
		this.nombre=nombre;
		this.codigoMateria = codigoMateria;
		this.estudiantes = new ArrayList<>();
		genCodigoMateria++;
	}
	
	public void matricularEstudiante(Estudiante estu) {
		estudiantes.add(estu);
		//Independiente
		numeroMatricula++;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getCodigoMateria() {
		return codigoMateria;
	}
	
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	
	public static int getNumeroMatriculas() {
		return numeroMatricula;
	}
	
	public static String getFacultad() {
		return Materia.facultad;
	}

	public static void setFacultad(String facultad) {
		Materia.facultad = facultad;
	}
}
