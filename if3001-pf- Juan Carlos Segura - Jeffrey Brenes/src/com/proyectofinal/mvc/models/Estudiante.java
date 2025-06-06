package com.proyectofinal.mvc.models;

public class Estudiante {
	
	private String nombre;
	private int id;
	private String carnet;
	
	public Estudiante(String nombre, String carnet) {
		this.nombre = nombre;
		this.id = 0;
		this.carnet = carnet;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	@Override
	public String toString() {
		return nombre + " id: " + id + " carnet: " + carnet;
	}
	
	
}
