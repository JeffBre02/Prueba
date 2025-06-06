package com.proyectofinal.mvc.models;

import java.util.HashMap;

public class ListaProfesores {

	private HashMap<String, Profesor> listaProfesores;
	
public ListaProfesores() {
		
		this.listaProfesores = new HashMap<>();
	}
	
	public void store(Profesor item) {
		String llaveProfesor = item.getCodigo();
		listaProfesores.put(llaveProfesor, item);
	}
	
	public String getListaProfesores() {
		String data = "";
		for (Profesor p : listaProfesores.values()) {
			
			data+=p.toString()+"\n";
		}
		
		return data;
	}
	
	public void delete(String codigo) {
		listaProfesores.remove(codigo);
	}
	
	public Profesor getProfesor(String codigo) {
		return listaProfesores.get(codigo);
	}
	
}
