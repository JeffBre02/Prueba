package com.proyectofinal.mvc.controllers;

import javax.swing.JPanel;

import com.proyectofinal.mvc.views.ViewModuloEstudiantes;

public class ControllerViewEstudiantes {

	ViewModuloEstudiantes vme;
	
	public ControllerViewEstudiantes() {
		this.vme = new ViewModuloEstudiantes();
	}
	
	public JPanel cambiarVentanaE() {
			return vme;
	}
	//cambio para commit
}
