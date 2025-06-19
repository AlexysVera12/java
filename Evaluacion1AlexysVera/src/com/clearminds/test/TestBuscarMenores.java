package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A"));
		maquina.agregarCelda(new Celda("B"));
		maquina.agregarCelda(new Celda("C"));
		maquina.agregarCelda(new Celda("D"));
		maquina.agregarCelda(new Celda("E"));
		maquina.agregarCelda(new Celda("F"));
		
		Producto productoA = new Producto("PRD001", "Papitas", 0.85);
		Producto productoB = new Producto("PRD002", "Doritos", 0.5);
		Producto productoC = new Producto("PRD003", "Jet", 0.25);
		Producto productoD = new Producto("PRD004", "DeTodito", 0.6);
		Producto productoE = new Producto("PRD005", "Camisa", 22.90);
		Producto productoF = new Producto("PRD006", "Jarra", 7.25);
		
		maquina.cargarProducto(productoA, "A", 2);
		maquina.cargarProducto(productoB, "B", 7);
		maquina.cargarProducto(productoC, "C", 2);
		maquina.cargarProducto(productoD, "D", 1);
		maquina.cargarProducto(productoE, "E", 9);
		maquina.cargarProducto(productoF, "F", 2);
		
		ArrayList<Producto> menores = maquina.buscarMenores(0.85);
		
		System.out.println("Productos Menores: "+menores.size());
		for(int i = 0; i < menores.size(); i++) {
			Producto producto = menores.get(i);
			System.out.println("Nombre: "+producto.getNombre()+" Precio:"+producto.getPrecio());
		}
	}
}
