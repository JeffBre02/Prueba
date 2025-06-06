package com.proyectofinal.mvc.models;

public class Curso {

	private String sigla;
	private String nombre;
	private Profesor profesor;
	private ListaEstudiantes listaEstudiantes;
	private int id;
	
	public Curso(String sigla, String nombre, Profesor profesor) {
		
		this.sigla = sigla;
		this.nombre = nombre;
		this.profesor = profesor;
		this.listaEstudiantes = new ListaEstudiantes();
		this.id = 0;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public ListaEstudiantes getListaEstudiantes() {
		return listaEstudiantes;
	}

	public void setListaEstudiantes(ListaEstudiantes listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void matricularEstudiante(Estudiante item) {

		listaEstudiantes.store(item);
	}
	
	public void desmatricular(Estudiante item) {
		
		listaEstudiantes.delete(item);
	}
	
	public void salida() {
		System.out.println("Salida");
	}
	

	@Override
	public String toString() {
		return "Curso [sigla=" + sigla + ", nombre=" + nombre + ", profesor=" + profesor + ", listaEstudiantes="
				+ listaEstudiantes.getLista() + ", id=" + id + "]";
	}
	
	
	
	
}
