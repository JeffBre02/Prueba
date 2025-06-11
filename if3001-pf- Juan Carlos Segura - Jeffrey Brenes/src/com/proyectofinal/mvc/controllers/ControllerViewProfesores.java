package com.proyectofinal.mvc.controllers;

import javax.swing.JPanel;

import com.proyectofinal.mvc.views.ViewModuloProfesores;

public class ControllerViewProfesores {

	ViewModuloProfesores vmp;
	
	public ControllerViewProfesores() {
		this.vmp = new ViewModuloProfesores();
	}
	
	public void init() {
		cambiarVentanaP();
		agregarProfesor();
		eliminarProfesor();
	}
	
	//Cambiar ventana
	public JPanel cambiarVentanaP() {
			return vmp;
	}
	
	public void agregarProfesor() {
		vmp.btnGuardar.addActionListener(e ->{
			System.err.println("guardar profesor");
		});
	}
	
	public void eliminarProfesor() {
		vmp.btnEliminar.addActionListener(e -> {
			System.err.println("eliminar profesor");
		});
	}
}
