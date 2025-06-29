package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarma;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarma {

	public static void main(String[] args) {
		Alarma alarm1 = new Alarma(DiasSemana.MARTES,4,0);
		Alarma alarm2 = new Alarma(DiasSemana.MIERCOLES,4,0);
		Alarma alarm3 = new Alarma(DiasSemana.JUEVES,11,15);
		Alarma alarm4 = new Alarma(DiasSemana.SABADO,5,0);
		AdminAlarma admin = new AdminAlarma();
		
		admin.agregarAlarma(alarm1);
		admin.agregarAlarma(alarm2);
		admin.agregarAlarma(alarm3);
		admin.agregarAlarma(alarm4);
		
		ArrayList<Alarma> alarmasActuales = admin.getAlarmas();
		System.out.println(alarmasActuales);
	}

}
