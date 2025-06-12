package com.clearminds.cuentas.test;

import com.clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		//Creo el objeto Cuenta y lo referencio con cuenta 1
		Cuenta cuenta1 = new Cuenta("03476");
		
		//Coloco un valor de saldo en la cuenta1
		cuenta1.setSaldo(675);
		
		//Creo el objeto Cuenta y lo referencio con cuenta2
		Cuenta cuenta2 = new Cuenta("03476","C",98);
		
		//Creo el objeto Cuenta y lo referencio con cuenta3
		Cuenta cuenta3 = new Cuenta("03476");
		
		//Modifico el tipo de cuenta
		cuenta3.setTipo("C");
		
		//Imprimo cuenta1, cuenta2 y cuenta3
		System.out.println("-------Valores Iniciales-------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		System.out.println("-------Valores modificados-------");
		//Modificar el saldo de la cuenta1 a 444
		cuenta1.setSaldo(444);
		
		//Modificar el saldo de la cuenta3 a 567
		cuenta3.setSaldo(567);
		
		//Modificar el tipo de la cuenta2 a D
		cuenta2.setTipo("D");
		
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		Cuenta cuenta4 = new Cuenta("0987");
		cuenta4.setSaldo(10);
		
		Cuenta cuenta5 = new Cuenta("0557","C",10);
		
		Cuenta cuenta6 = new Cuenta("0666");
		
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
		
	}

}
