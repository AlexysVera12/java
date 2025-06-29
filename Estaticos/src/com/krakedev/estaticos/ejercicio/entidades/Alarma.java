package com.krakedev.estaticos.ejercicio.entidades;

import com.krakedev.estaticos.ejercicio.utils.Util;

public class Alarma {
	private int dia;
	private int hora;
	private int minuto;
	
	public Alarma(int dia, int hora, int minuto) {
		this.dia = dia;
		this.hora = hora;
		this.minuto = minuto;
	}

	@Override
	public String toString() {
		return "Alarma ["+Util.formatearDia(dia) + "," + Util.formatearHora(hora) + ":" + Util.formatearHora(minuto) + "]";
	}
	
	
}
