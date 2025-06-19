package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas = new ArrayList<>();
	private double saldo;

	public void agregarCelda(Celda codigoCelda) {
		Celda celda = new Celda(codigoCelda.getCodigo());
		celdas.add(celda);
	}

	public void mostrarConfiguracion() {
		int x = 1;
		for (int i = 0; i < celdas.size(); i++) {
			Celda celda = celdas.get(i);
			System.out.println("Celda" + x + ": " + celda.getCodigo());
			x++;
		}
	}

	public Celda buscarCelda(String codigoCelda) {
		for (int i = 0; i < celdas.size(); i++) {
			Celda celda = celdas.get(i);
			if (celda.getCodigo() == codigoCelda) {
				return celda;
			}
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int items) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, items);
	}

	public void mostrarProductos() {
		for (int i = 0; i < celdas.size(); i++) {
			Celda celda = celdas.get(i);
			if (celda.getProducto() != null) {
				System.out.println("Celda:" + celda.getCodigo() + " Stock:" + celda.getStock() + " Producto: "
						+ celda.getProducto().getCodigo() + " Precio:" + celda.getProducto().getPrecio());
			} else {
				System.out.println(
						"Celda:" + celda.getCodigo() + " Stock:" + celda.getStock() + " Sin Producto asignado");
			}
		}
		System.out.println("Saldo: " + saldo);
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		for (int i = 0; i < celdas.size(); i++) {
			Celda celda = celdas.get(i);
			if (celda.getCodigo() == codigoCelda) {
				return celda.getProducto();
			}
		}
		return null;
	}

	public Double consultarPrecio(String codigoCelda) {
		for (int i = 0; i < celdas.size(); i++) {
			Celda celda = celdas.get(i);
			if (celda.getCodigo() == codigoCelda) {
				return celda.getProducto().getPrecio();
			}
		}
		return null;
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		for (int i = 0; i < celdas.size(); i++) {
			Celda celda = celdas.get(i);
			if (celda.getProducto() != null) {
				if (celda.getProducto().getCodigo() == codigoProducto) {
					return celda;
				}
			}
		}
		return null;
	}

	public void incrementarProductos(String codigoProducto, int items) {
		for (int i = 0; i < celdas.size(); i++) {
			Celda celda = celdas.get(i);
			if (celda.getProducto() != null) {
				if (celda.getProducto().getCodigo() == codigoProducto) {
					Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
					celdaEncontrada.setStock(items);
				}
			}
		}
	}

	public void vender(String codigoCelda) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		saldo += consultarPrecio(codigoCelda);
		mostrarProductos();
	}

	public double venderConCambio(String codigoCelda, double valorIngresado) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		saldo = celdaEncontrada.getProducto().getPrecio();
		return valorIngresado - celdaEncontrada.getProducto().getPrecio();
	}

	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> menores = new ArrayList<Producto>();
		for (int i = 0; i < celdas.size(); i++) {
			Celda celda = celdas.get(i);
			Producto producto = celda.getProducto();
			if (producto != null) {
				if (producto.getPrecio() <= limite) {
					menores.add(producto);
				}
			}
		}
		return menores;
	}
}
