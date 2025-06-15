package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "B1", 4);

		// La linea 15 es en donde provoca el NullPointerException en esta clase
		// TestBuscarProductoNull, la variable prod produjo el error especificamente cuando se invoca el metodo .getNombre() 

		Producto prod = maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:" + prod.getNombre());

	}
}
