package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicio.AdminPersonas;

public class TestActualizar {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("C","Casado");
		Persona p = new Persona("1204578743","Mario","Perez",ec);
			try {
				AdminPersonas.actualizar(p);
			} catch (Exception e) {
				System.out.println("error en el sistema: "+e.getMessage());
			}
	}

}
