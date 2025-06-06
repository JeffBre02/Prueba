package com.proyectofinal.mvc.models;

import java.util.HashMap;

public class ListaEstudiantes {

	private HashMap<String, Estudiante> estudiantes;

	public ListaEstudiantes() {
		
		this.estudiantes = new HashMap<>();
	}
	
	public void store(Estudiante item) {
		String llaveEstudiante = item.getCarnet();
		estudiantes.put(llaveEstudiante, item);
	}
	
	public String getLista() {
		String data = "";
		for (Estudiante e : estudiantes.values()) {
			
			data+=e.toString()+"\n";
		}
		
		return data;
	}
	
	public void delete(Estudiante item) {
		String llaveEstudiante = item.getCarnet();
		estudiantes.remove(llaveEstudiante);
	}
	
	public Estudiante getEstudiante(String carnet) {
		return estudiantes.get(carnet);
	}
}
