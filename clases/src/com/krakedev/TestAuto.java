package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		auto1.marca = "Dodge";
		auto1.anio = 2010;
		auto1.precio = 20000.00;
		auto2.marca = "Mitsubishi";
		auto2.anio = 2015;
		auto2.precio = 15000.00;
		System.out.println("----------Auto 1----------");
		System.out.println("Marca: " + auto1.marca);
		System.out.println("Año: " + auto1.anio);
		System.out.println("precio: " + auto1.precio);
		System.out.println("----------Auto 2----------");
		System.out.println("Marca: " + auto2.marca);
		System.out.println("Año: " + auto2.anio);
		System.out.println("Precio: " + auto2.precio);
	}

}
