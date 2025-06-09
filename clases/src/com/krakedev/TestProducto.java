package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		productoA.nombre = "Cafetera Italiana";
		productoA.descripcion = "Cafetera de aluminio para preparar café espresso al estilo tradicional italiano. Apta para cocinas a gas y eléctricas";
		productoA.precio = 24.90;
		productoA.stockActual = 33;
		Producto productoB = new Producto();
		productoB.nombre = "Set de Pintura Acrílica";
		productoB.descripcion = "Kit artístico con 24 tubos de pintura acrílica, 6 pinceles y paleta de mezcla. Ideal para principiantes y artistas";
		productoB.precio = 17.25;
		productoB.stockActual = 60;
		Producto productoC = new Producto();
		productoC.nombre = "Colchón Inflable";
		productoC.descripcion = "Colchón inflable tamaño matrimonial con superficie flocada y bomba integrada para inflado/desinflado rápido";
		productoC.precio = 49.95;
		productoC.stockActual = 22;
		System.out.println("--------Producto A--------");
		System.out.println("Nombre: " + productoA.nombre);
		System.out.println("Descripcion: " + productoA.descripcion);
		System.out.println("Precio: " + productoA.precio);
		System.out.println("Stock: " + productoA.stockActual);
		System.out.println("--------Producto B--------");
		System.out.println("Nombre: " + productoB.nombre);
		System.out.println("Descripcion: " + productoB.descripcion);
		System.out.println("Precio: " + productoB.precio);
		System.out.println("Stock: " + productoB.stockActual);
		System.out.println("--------Producto C--------");
		System.out.println("Nombre: " + productoC.nombre);
		System.out.println("Descripcion: " + productoC.descripcion);
		System.out.println("Precio: " + productoC.precio);
		System.out.println("Stock: " + productoC.stockActual);
	}

}
