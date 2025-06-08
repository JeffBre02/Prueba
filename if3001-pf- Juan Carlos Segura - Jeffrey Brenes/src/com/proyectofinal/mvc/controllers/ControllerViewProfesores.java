package com.proyectofinal.mvc.controllers;

import javax.swing.JPanel;

import com.proyectofinal.mvc.views.ViewModuloProfesores;

public class ControllerViewProfesores {

	ViewModuloProfesores vmp;
	
	public ControllerViewProfesores() {
		this.vmp = new ViewModuloProfesores();
		
		cambiarVentanaP();
	}
	
	//Cambiar ventana
	public JPanel cambiarVentanaP() {
			return vmp;
	}
}
