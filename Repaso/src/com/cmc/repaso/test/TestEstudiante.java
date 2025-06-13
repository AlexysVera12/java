package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante("Harvey");
		estudiante.calificar(7);
		System.out.println("nombre: "+estudiante.getNombre());
		System.out.println("nota: "+estudiante.getNota());
		System.out.println("resultado: "+estudiante.getResultado());
	}

}
