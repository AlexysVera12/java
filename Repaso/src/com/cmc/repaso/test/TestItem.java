package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item1 = new Item();
		Item item2 = new Item();
		item1.setNombre("cargador");
		item1.setProductosActuales(20);
		item1.imprimir();
		System.out.println("------Todo los metodos------");
		item1.vender(12);
		item1.devolver(2);
		item1.imprimir();
		System.out.println("------Otro producto------");
		item2.setNombre("correa");
		item2.setProductosActuales(9);
		item2.imprimir();
		System.out.println("------Todo los metodos------");
		item2.vender(7);
		item2.devolver(3);
		item2.imprimir();

	}

}
