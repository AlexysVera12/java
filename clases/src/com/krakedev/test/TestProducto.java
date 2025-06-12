package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto("Casco Integral",180);
		/*productoA.setNombre("Cafetera Italiana");
		productoA.setDescripcion("Cafetera de aluminio para preparar café espresso al estilo tradicional italiano. Apta para cocinas a gas y eléctricas");
		productoA.setPrecio(24.90);
		productoA.setStockActual(33);*/
		Producto productoB = new Producto("Guantes Alpinestars",90);
		/*productoB.setNombre("Set de Pintura Acrílica");
		productoB.setDescripcion("Kit artístico con 24 tubos de pintura acrílica, 6 pinceles y paleta de mezcla. Ideal para principiantes y artistas");
		productoB.setPrecio(17.25);
		productoB.setStockActual(60);*/
		Producto productoC = new Producto("Llantas Michelin",300);
		/*productoC.setNombre("Colchón Inflable");
		productoC.setDescripcion("Colchón inflable tamaño matrimonial con superficie flocada y bomba integrada para inflado/desinflado rápido");
		productoC.setPrecio(49.95);
		productoC.setStockActual(22);*/
		System.out.println("--------Producto A--------");
		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripcion: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock: " + productoA.getStockActual());
		System.out.println("--------Producto B--------");
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripcion: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("Stock: " + productoB.getStockActual());
		System.out.println("--------Producto C--------");
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripcion: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock: " + productoC.getStockActual());
	}

}
