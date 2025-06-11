package com.proyectofinal.mvc.controllers;

import javax.swing.JPanel;

import com.proyectofinal.mvc.views.ViewModuloCursos;
import com.proyectofinal.mvc.views.ViewModuloMatriculas;

public class ControllerViewMatricula {

	ViewModuloMatriculas vmm;
	
	public ControllerViewMatricula() {
		this.vmm = new ViewModuloMatriculas();
	}
	
	public void init() {
		agregarProfesor();
		eliminarProfesor();
	}
	
	public JPanel cambiarVentanaM() {
		return vmm;
	}
	
	public void agregarProfesor() {
		vmm.btnGuardar.addActionListener(e ->{
			System.err.println("guardar matricula");
		});
	}
	
	public void eliminarProfesor() {
		vmm.btnEliminar.addActionListener(e -> {
			System.err.println("eliminar matricula");
		});
	}
}
