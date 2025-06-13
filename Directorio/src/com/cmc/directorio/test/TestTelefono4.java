package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro","098745675",24);
		Telefono telf2 = new Telefono("movi","09321547",33);
		Telefono telf3 = new Telefono("movi","09456841",26);
		Telefono telf4 = new Telefono("claro","09845127",28);
		
		TestTelefono3 cc = new TestTelefono3();
		int telfClaro = cc.contarClaro(telf1,telf2,telf3,telf4);
		System.out.println("Telefonos con operadora claro: "+telfClaro);
	}

}
