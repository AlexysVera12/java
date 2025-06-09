package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double productoMultiplicacion;
		double cocienteDivision;
		double resultadoPromedio;
		calcu = new Calculadora();
		resultadoSuma = calcu.sumar(5, 8);
		resultadoResta = calcu.restar(8, 5);
		productoMultiplicacion = calcu.multiplicar(10, 5);
		cocienteDivision = calcu.dividir(10, 2);
		resultadoPromedio = calcu.promediar(10, 8, 9);
		System.out.println("Resultado suma: "+resultadoSuma);
		System.out.println("Resultado resta: "+resultadoResta);
		System.out.println("Resultado mutiplicacion: "+productoMultiplicacion);
		System.out.println("Resultado division: "+cocienteDivision);
		System.out.println("Resultado promedio: "+resultadoPromedio);
	}

}
