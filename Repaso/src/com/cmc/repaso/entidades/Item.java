package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public void imprimir() {
		System.out.println("nombre del producto: " + nombre);
		System.out.println("producto actuales: " + productosActuales);
		System.out.println("productos devueltos: " + productosDevueltos);
		System.out.println("productos vendidos: " + productosVendidos);
	}

	public void vender(int productosVendidos) {
		this.productosActuales -= productosVendidos;
		this.productosVendidos += productosVendidos;
	}

	public void devolver(int productosDevueltos) {
		this.productosActuales += productosDevueltos;
		this.productosVendidos -= productosDevueltos;
		this.productosDevueltos += productosDevueltos;
	}
}
