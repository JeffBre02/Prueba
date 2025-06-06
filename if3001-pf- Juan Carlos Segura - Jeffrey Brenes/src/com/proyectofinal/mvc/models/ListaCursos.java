package com.proyectofinal.mvc.models;

import java.util.HashMap;

public class ListaCursos {

	private HashMap<String, Curso> cursos;

	public ListaCursos() {
		this.cursos = new HashMap<>();
	}
	
	public void store(Curso item) {
		String llaveCurso = item.getSigla();
		cursos.put(llaveCurso, item);
	}
	
	public String getListaCursos() {
		
		String data = "";
		
		for (Curso c : cursos.values()) {
			data+= c.toString()+"\n";
		}
		
		return data;
	}
	
	public void delete(String sigla) {
		cursos.remove(sigla);
	}
	
	public Curso getCurso(String sigla) {
		return cursos.get(sigla);
	}
	
	public String getCursosProfesor(Profesor item) {
		String data = "";
		
		for (Curso c : cursos.values()) {
			if (c.getProfesor().getCodigo().equals(item.getCodigo())) {
				data = c.getProfesor().toString()+"\n"+
			"Estudiantes del curso: "+c.getListaEstudiantes().getLista();		
			}
		}
		
		return data;
	}
	
}
