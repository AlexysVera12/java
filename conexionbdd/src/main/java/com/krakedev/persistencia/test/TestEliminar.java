package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicio.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		Persona p = new Persona();
		p.setCedula("1204578743");
		try {
			AdminPersonas.eliminar(p.getCedula());
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}
	}

}
