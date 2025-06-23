package com.cmc.evaluacion.entidades;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utilitario {
	public static double redondear(double numero) {
		BigDecimal numeroRedondeado = new BigDecimal(numero);
		numeroRedondeado = numeroRedondeado.setScale(2,RoundingMode.HALF_UP);
		return numeroRedondeado.doubleValue();
	}	
}
