package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicio.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPersonas {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U","Union Libre");
		Persona p = new Persona("1204578743","Mario","Perez",ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("2006/07/12");
			Date horaNac = Convertidor.convertirHora("09:27");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(4700));
			p.setNumeroHijos(7);
			AdminPersonas.insertar(p);
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}

	}

}
