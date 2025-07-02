package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Cuentas;
import com.krakedev.persistencia.servicio.AdminCuentas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestInsertarCuentas {

	public static void main(String[] args) {
		try {
			Date fechaCreacion = Convertidor.convertirFecha("2021/03/11");
			Cuentas c = new Cuentas("50021","12079",fechaCreacion,new BigDecimal(7210));
			AdminCuentas.insertar(c);
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}
	}

}
