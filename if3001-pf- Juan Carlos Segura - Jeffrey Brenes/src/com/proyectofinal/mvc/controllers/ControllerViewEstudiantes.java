package com.proyectofinal.mvc.controllers;

import javax.swing.JPanel;

import com.proyectofinal.mvc.views.ViewModuloEstudiantes;

public class ControllerViewEstudiantes {

	ViewModuloEstudiantes vme;
	
	public ControllerViewEstudiantes() {
		this.vme = new ViewModuloEstudiantes();
	}
	
	public void init() {
		agregarEstudiante();
		eliminarEstudiante();
	}
	
	public JPanel cambiarVentanaE() {
			return vme;
	}
	
	public void agregarEstudiante() {
		vme.btnGuardar.addActionListener(e ->{
			System.err.println("guardar estudiante");
		});
	}
	
	public void eliminarEstudiante() {
		vme.btnEliminar.addActionListener(e -> {
			System.err.println("eliminar estudiante");
		});
	}
}
