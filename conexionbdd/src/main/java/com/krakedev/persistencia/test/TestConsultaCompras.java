package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Compras;
import com.krakedev.persistencia.servicio.AdminCompras;

public class TestConsultaCompras {

	public static void main(String[] args) {
		Compras compra = AdminCompras.buscarPorPK(27);
		System.out.println(compra);
	}

}
