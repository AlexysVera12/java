package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;
import com.cmc.evaluacion.entidades.Utilitario;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		double valorCuota;
		double interesPeriodo = (prestamo.getInteres() / 100) / 12;
		valorCuota = (prestamo.getMonto() * interesPeriodo) / (1 - Math.pow(1 + interesPeriodo, -prestamo.getPlazo()));
		return valorCuota;
	}

	public static void generarTabla(Prestamo prestamo) {
		double valorCuota = calcularCuota(prestamo);
		double interes = prestamo.getInteres();
		int plazo = prestamo.getPlazo();

		for (int i = 1; i <= prestamo.getPlazo(); i++) {
			Cuota cuota = new Cuota(i);
			cuota.setCuota(valorCuota);
			prestamo.getCuotas().add(cuota);
		}

		prestamo.getCuotas().get(0).setInicio(prestamo.getMonto());

		for (int i = 0; i < plazo; i++) {
			Cuota cuotaActual = prestamo.getCuotas().get(i);
			if (i > 0) {
				Cuota cuotaAnterior = prestamo.getCuotas().get(i - 1);
				cuotaActual.setInicio(cuotaAnterior.getSaldo());
			}
			calcularValoresCuota(interes, valorCuota, cuotaActual);

		}

		Cuota ultimaCuota = prestamo.getCuotas().get(plazo - 1);
		double saldoPendiente = ultimaCuota.getSaldo();

		if (saldoPendiente != 0) {
			double nuevoAbonoCapital = ultimaCuota.getAbonoCapital() + saldoPendiente;
			ultimaCuota.setAbonoCapital(nuevoAbonoCapital);
			ultimaCuota.setSaldo(0);
		}
	}

	public static void calcularValoresCuota(double interes, double valorCuota, Cuota cuotaActual) {
		double interesMensual = (interes / 100) / 12;
		double valorInteres = cuotaActual.getInicio() * interesMensual;
		double abonoCapital = valorCuota - valorInteres;
		double saldoFinal = cuotaActual.getInicio() - abonoCapital;

		cuotaActual.setInteres(valorInteres);
		cuotaActual.setAbonoCapital(abonoCapital);
		cuotaActual.setSaldo(saldoFinal);
	}

	public static void mostrarTabla(Prestamo prestamo) { 
		System.out.println(" Número |   Cuota   |   Inicio   |  Interes  |   Abono   |   Saldo   |" );
		int numero = 1;
		for(int i = 0; i < prestamo.getPlazo(); i++) {
			Cuota valoresCuota = prestamo.getCuotas().get(i);
			double cuota = Utilitario.redondear(valoresCuota.getCuota());
			double inicio = Utilitario.redondear(valoresCuota.getInicio());
			double interes = Utilitario.redondear(valoresCuota.getInteres());
			double abono = Utilitario.redondear(valoresCuota.getAbonoCapital());
			double saldo = Utilitario.redondear(valoresCuota.getSaldo());

			System.out.println(
				" " + numero + "     |   " + cuota + "   |   " + inicio + "   |  " + interes +
				"  |   " + abono + "   |   " + saldo + "   |");
			numero++;
		}

	}
}
