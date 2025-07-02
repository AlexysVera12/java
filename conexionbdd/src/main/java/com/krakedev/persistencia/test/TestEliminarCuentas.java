package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Cuentas;
import com.krakedev.persistencia.servicio.AdminCuentas;

public class TestEliminarCuentas {

	public static void main(String[] args) {
		Cuentas c = new Cuentas();
		c.setNumeroCuenta("50021");
		try {
			AdminCuentas.eliminar(c.getNumeroCuenta());
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}
	}

}
