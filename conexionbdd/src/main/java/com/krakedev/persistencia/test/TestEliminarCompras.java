package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Compras;
import com.krakedev.persistencia.servicio.AdminCompras;

public class TestEliminarCompras {

	public static void main(String[] args) {
		Compras c = new Compras();
		c.setIdCompra(27);
		try {
			AdminCompras.eliminar(c.getIdCompra());
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}
	}

}
