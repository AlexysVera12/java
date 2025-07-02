package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Compras;
import com.krakedev.persistencia.servicio.AdminCompras;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizarCompras {

	public static void main(String[] args) {
			try {
				Date fechaCompra = Convertidor.convertirFecha("2023/05/03");
				Compras c = new Compras(27,"1795212109",fechaCompra,new BigDecimal(218));
				AdminCompras.actualizar(c);
			} catch (Exception e) {
				System.out.println("error en el sistema: "+e.getMessage());
			}
	}

}
