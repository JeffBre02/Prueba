package com.proyectofinal.mvc.models;

public class Profesor {

	private String nombre;
	private String codigo;
	private int id;
	
	public Profesor(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.id = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Profesor: " + nombre + " codigo: " + codigo + " id: " + id;
	}
	
	
	
}
