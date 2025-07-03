package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Compras {
	private int idCompra;
	private String cedula;
	private Date FechaCompra;
	private BigDecimal monto;
	public Compras() {
	}
	public Compras(int idCompra, String cedula, Date fechaCompra, BigDecimal monto) {
		super();
		this.idCompra = idCompra;
		this.cedula = cedula;
		FechaCompra = fechaCompra;
		this.monto = monto;
	}
	public int getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public Date getFechaCompra() {
		return FechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		FechaCompra = fechaCompra;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	@Override
	public String toString() {
		return "Compras [idCompra=" + idCompra + ", cedula=" + cedula + ", FechaCompra=" + FechaCompra + ", monto="
				+ monto + "]";
	}
	
}
