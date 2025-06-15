package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
		this.celda1 = new Celda(codigo1);
		this.celda2 = new Celda(codigo2);
		this.celda3 = new Celda(codigo3);
		this.celda4 = new Celda(codigo4);
	}

	public void mostrarConfiguracion() {
		System.out.println("===========Configuracion de la maquina===========");
		System.out.println("Codigo de la celda 1: " + celda1.getCodigo());
		System.out.println("Codigo de la celda 2: " + celda2.getCodigo());
		System.out.println("Codigo de la celda 3: " + celda3.getCodigo());
		System.out.println("Codigo de la celda 4: " + celda4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1;
		} else if (celda2.getCodigo() == codigo) {
			return celda2;
		} else if (celda3.getCodigo() == codigo) {
			return celda3;
		} else if (celda4.getCodigo() == codigo) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidadItems) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, cantidadItems);
	}

	public void mostrarProductos() {

		System.out.println("***********CELDA " + celda1.getCodigo());
		System.out.println("Stock: " + celda1.getStock());
		if (celda1.getProducto() != null) {
			System.out.println("Saldo: "+celda1.getProducto().getPrecio());
			System.out.println("Nombre del producto: " + celda1.getProducto().getNombre());
			System.out.println("Precio del producto: " + celda1.getProducto().getPrecio());
			System.out.println("Codigo del producto: " + celda1.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("***********CELDA " + celda2.getCodigo());
		System.out.println("Stock: " + celda2.getStock());
		if (celda2.getProducto() != null) {
			System.out.println("Saldo: "+celda2.getProducto().getPrecio());
			System.out.println("Nombre del producto: " + celda2.getProducto().getNombre());
			System.out.println("Precio del producto: " + celda2.getProducto().getPrecio());
			System.out.println("Codigo del producto: " + celda2.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("***********Celda " + celda3.getCodigo());
		System.out.println("Stock: " + celda3.getStock());
		if (celda3.getProducto() != null) {
			System.out.println("Saldo: "+celda3.getProducto().getPrecio());
			System.out.println("Nombre del producto: " + celda3.getProducto().getNombre());
			System.out.println("Precio del producto: " + celda3.getProducto().getPrecio());
			System.out.println("Codigo del producto: " + celda3.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("***********CELDA " + celda4.getCodigo());
		System.out.println("Stock: " + celda4.getStock());
		if (celda4.getProducto() != null) {
			System.out.println("Saldo: "+celda4.getProducto().getPrecio());
			System.out.println("Nombre del producto: " + celda4.getProducto().getNombre());
			System.out.println("Precio del producto: " + celda4.getProducto().getPrecio());
			System.out.println("Codigo del producto: " + celda1.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}
		if (saldo == 0) {
			System.out.println("Saldo: " + saldo);
		}
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda == celda1) {
			return celda1.getProducto();
		} else if (celda == celda2) {
			return celda2.getProducto();
		} else if (celda == celda3) {
			return celda3.getProducto();
		} else if (celda == celda4) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}

	public Double consultarPrecio(String codigoCelda) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda == celda1) {
			return celda1.getProducto().getPrecio();
		} else if (celda == celda2) {
			return celda2.getProducto().getPrecio();
		} else if (celda == celda3) {
			return celda3.getProducto().getPrecio();
		} else if (celda == celda4) {
			return celda4.getProducto().getPrecio();
		} else {
			return null;
		}
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		if (celda1.getProducto() != null) {
			if (celda1.getProducto().getCodigo() == codigoProducto) {
				return celda1;
			}
		}
		if (celda2.getProducto() != null) {
			if (celda2.getProducto().getCodigo() == codigoProducto) {
				return celda2;
			}
		}
		if (celda3.getProducto() != null) {
			if (celda3.getProducto().getCodigo() == codigoProducto) {
				return celda3;
			}
		}
		if (celda4.getProducto() != null) {
			if (celda4.getProducto().getCodigo() == codigoProducto) {
				return celda4;
			}
		}
		return null;

	}

	public void incrementarProductos(String codigoProducto, int items) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(items);
	}

	public void vender(String codigoCelda) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		if (celdaEncontrada != null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
			this.saldo += celdaEncontrada.getProducto().getPrecio();
		}
	}

	public double venderConCambio(String codigoProducto, double valorIngresado) {
		Celda celdaEncontrada = buscarCelda(codigoProducto);
		if (celdaEncontrada != null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
			this.saldo = valorIngresado - saldo;
		}
		return saldo;
	}
}
