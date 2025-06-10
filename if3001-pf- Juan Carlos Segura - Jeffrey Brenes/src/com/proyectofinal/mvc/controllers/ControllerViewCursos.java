package com.proyectofinal.mvc.controllers;

import javax.swing.JPanel;

import com.proyectofinal.mvc.views.ViewModuloCursos;

public class ControllerViewCursos {

ViewModuloCursos vmc;
	
	public ControllerViewCursos() {
		this.vmc = new ViewModuloCursos();
	}

	public JPanel cambiarVentanaC() {
		return vmc;
	}
	//cambio para commit
}
