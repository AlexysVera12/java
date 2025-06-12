package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto(12797,"audifonos inalambricos");
		producto1.setDescripcion("audifonos de bateria con duracion de 5 horas, una distancia de 10 metros");
		producto1.setPeso(0.8);
		
		System.out.println("codigo: "+producto1.getCodigo());
		System.out.println("nombre: "+producto1.getNombre());
		System.out.println("descripcion: "+producto1.getDescripcion());
		System.out.println("peso: "+producto1.getPeso());
	}

}
