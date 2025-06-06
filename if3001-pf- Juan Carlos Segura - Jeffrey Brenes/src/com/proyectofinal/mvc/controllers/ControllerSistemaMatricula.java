package com.proyectofinal.mvc.controllers;

import com.proyectofinal.mvc.models.Curso;
import com.proyectofinal.mvc.models.Estudiante;
import com.proyectofinal.mvc.models.ListaCursos;
import com.proyectofinal.mvc.models.ListaEstudiantesGlobal;
import com.proyectofinal.mvc.models.ListaProfesores;
import com.proyectofinal.mvc.models.Profesor;
import com.proyectofinal.mvc.views.ViewModuloProfesores;
import com.proyectofinal.mvc.views.ViewPrincipal;

	public class ControllerSistemaMatricula {
		
		private ViewPrincipal viewPrincipal;
		private ViewModuloProfesores vmp;

		public ControllerSistemaMatricula() {
			viewPrincipal = new ViewPrincipal();
			vmp = new ViewModuloProfesores();
		}
		
		public void metodoX() {
			System.out.println("Yanffrey Brenes");
			System.out.println("Yanffrey Brenes");
		}
		
		public void init() {
			
			//simulación vistas
			
			//modulo profes
			
			Profesor p1 = new Profesor("Olivier", "01");
			Profesor p2 = new Profesor("Itorino", "02");
			ListaProfesores listaProfesores = new ListaProfesores();
			listaProfesores.store(p1);
			listaProfesores.store(p2);
			
			//modulo estudiantes
			Estudiante e1 = new Estudiante("Juan", "B77246");
			Estudiante e2 = new Estudiante("Jeffrey", "CQTIMPRTA");
			
			ListaEstudiantesGlobal listaGlobal = new ListaEstudiantesGlobal();
			listaGlobal.store(e1);
			listaGlobal.store(e2);
			
			//modulo cursos
			// el profe se obtiene en la grafica de un jcombobox
			System.out.println("Elegir profesor: "+ listaProfesores.getListaProfesores());
			
			Curso c1 = new Curso("EF3001", "Algoritmos", p1);
			Curso c2 = new Curso("EF3020", "Progra II", p2);
			
			ListaCursos listaCursos = new ListaCursos();
			listaCursos.store(c1);
			listaCursos.store(c2);
			
			// modulo matriculas
			// en la interfaz se muestran las listas de cursos globales
			// y la lista de estudiantes globales
			
			System.out.println("Lista de cursos: "+listaCursos.getListaCursos());
			System.out.println("Lista de estudiantes: "+listaGlobal.getListaEstudiantes());
			
			c1.matricularEstudiante(e1);
			c2.matricularEstudiante(e1);
			c1.matricularEstudiante(e2);
			c2.matricularEstudiante(e2);
			
			//modulo reportes
			System.out.println("Lista de cursos que van en jcombo: "+listaCursos.getListaCursos());
			System.out.println("Se va a buscar la lista de estdiantes"+
					 " en el curso Algoritmos\n"+c1.getListaEstudiantes().getLista());
			
			System.out.println("Lista de profes que van en jcombo: "+listaProfesores.getListaProfesores());
			System.out.println("Se va a buscar al profesor Ito"+
					 " y los cursos que imparte\n"+listaCursos.getCursosProfesor(p2));
			viewPrincipal.init();
			viewPrincipal.setContenido(vmp);
			metodoX();
		}
}
