package com.proyectofinal.mvc.controllers;

import com.proyectofinal.mvc.views.ViewPrincipal;

public class ControllerGeneral {

	ViewPrincipal vp;
	ControllerViewProfesores cvp;
	ControllerViewEstudiantes cve;
	ControllerViewMatricula cvm;
	ControllerViewCursos cvc;
	
	public ControllerGeneral() {
		this.vp = new ViewPrincipal();
		this.cvp = new ControllerViewProfesores();
		this.cve = new ControllerViewEstudiantes();
		this.cvm = new ControllerViewMatricula();
		this.cvc = new ControllerViewCursos();
		
		cambiarVentanaE();
		cambiarVentanaP();
		cambiarVentanaM();
		cambiarVentanaC();
		vp.init();
	}

	public void cambiarVentanaE() {
		vp.btnEstudiantes.addActionListener(e -> {
			vp.setContenido(cve.cambiarVentanaE());
		});
	}
	
	public void cambiarVentanaP() {
		vp.btnProfesores.addActionListener(e -> {
			vp.setContenido(cvp.cambiarVentanaP());;
		});
	}
	
	public void cambiarVentanaM() {
		vp.btnMatriculas.addActionListener(e -> {
			vp.setContenido(cvm.cambiarVentanaM());
		});
	}
	
	public void cambiarVentanaC() {
		vp.btnCursos.addActionListener(e -> {
			vp.setContenido(cvc.cambiarVentanaC());
		});
	}
	//cambio para commit
}
