package com.krakedev;

public class Rectangulo {
	private int base;
	private int altura;
	
	public int calcularArea() {
		int area;
		area =  base * altura;
		return area;
	}
	public double calcularPerimetro() {
		double perimetro;
		perimetro = (base * 2) + (altura * 2);
		return perimetro;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
}
