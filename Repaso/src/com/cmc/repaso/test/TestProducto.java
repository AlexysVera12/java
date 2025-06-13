package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto = new Producto("tarjetero",20);
		producto.setPrecio(-7);
		System.out.println(producto.getNombre());
		System.out.println(producto.getPrecio());
		producto.calcularPrecioPromo(25);
		System.out.println("precio con descuento: "+producto.getPrecio());
	}

}
