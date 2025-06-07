package com.proyectofinal.mvc.controllers;

import javax.swing.JPanel;

import com.proyectofinal.mvc.views.ViewModuloCursos;
import com.proyectofinal.mvc.views.ViewModuloMatriculas;

public class ControllerViewMatricula {

	ViewModuloMatriculas vmm;
	
	public ControllerViewMatricula() {
		this.vmm = new ViewModuloMatriculas();
	}
	
	public JPanel cambiarVentanaM() {
		return vmm;
	}
}
