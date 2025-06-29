package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearHora(int hora) {
		String valor ;
		if(hora<10) {
			valor = "0"+hora;
		}else {
			valor = hora + "";
		}
		return valor;
	}
	
	public static String formatearDia(int dia) {
		if(dia == DiasSemana.LUNES) {
			return "Lunes";
		}else if(dia == DiasSemana.MARTES) {
			return "Martes";
		}else if(dia == DiasSemana.MIERCOLES) {
			return "Miercoles";
		}else if(dia == DiasSemana.JUEVES) {
			return "Jueves";
		}else if(dia == DiasSemana.VIERNES) {
			return "Viernes";
		}else if(dia == DiasSemana.SABADO) {
			return "Sabado";
		}else if(dia == DiasSemana.DOMINGO) {
			return "Domingo";
		}
		return "Día no existente";
	}
}
