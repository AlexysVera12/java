package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Dodge",2010,20000.00);
		Auto auto2 = new Auto("Mitsubishi",2015,15000.00);
		/*auto1.setMarca("Dodge");
		auto1.setAnio(2010);
		auto1.setPrecio(20000.00);
		auto2.setMarca("Mitsubishi");
		auto2.setAnio(2015);
		auto2.setPrecio(15000.00);*/
		System.out.println("----------Auto 1----------");
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("precio: " + auto1.getPrecio());
		System.out.println("----------Auto 2----------");
		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());
	}

}
