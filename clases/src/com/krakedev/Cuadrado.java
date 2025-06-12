package com.krakedev;

public class Cuadrado {
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double calcularArea() {
		double area;
		area = Math.pow(lado, 2);
		return area;
	}
	public double calcularPerimetro() {
		double perimetro;
		perimetro = lado * 4;
		return perimetro;
	}
}
