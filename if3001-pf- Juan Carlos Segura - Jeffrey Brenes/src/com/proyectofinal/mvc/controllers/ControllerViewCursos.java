package com.proyectofinal.mvc.controllers;

import javax.swing.JPanel;

import com.proyectofinal.mvc.views.ViewModuloCursos;

public class ControllerViewCursos {

ViewModuloCursos vmc;
	
	public ControllerViewCursos() {
		this.vmc = new ViewModuloCursos();
	}
	
	public void init() {
		agregarEstudiante();
		eliminarEstudiante();
	}

	public JPanel cambiarVentanaC() {
		return vmc;
	}
	
	public void agregarEstudiante() {
		vmc.btnGuardar.addActionListener(e ->{
			System.err.println("guardar curso");
		});
	}
	
	public void eliminarEstudiante() {
		vmc.btnEliminar.addActionListener(e -> {
			System.err.println("eliminar curso");
		});
	}
}
