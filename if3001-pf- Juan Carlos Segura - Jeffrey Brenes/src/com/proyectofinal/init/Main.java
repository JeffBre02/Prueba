package com.proyectofinal.init;

import com.proyectofinal.mvc.controllers.ControllerGeneral;
import com.proyectofinal.mvc.controllers.ControllerSistemaMatricula;

public class Main {

	public static void main(String[] args) {
		
		new ControllerSistemaMatricula().init();
		new ControllerGeneral().init();
	}
	//cambio para commit
}
