package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Cuentas;
import com.krakedev.persistencia.servicio.AdminCuentas;

public class TestConsultaCuentas {

	public static void main(String[] args) {
		try {
			ArrayList<Cuentas> cuentas = AdminCuentas.buscarPorIndiceCedula("17");
			System.out.println(cuentas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
