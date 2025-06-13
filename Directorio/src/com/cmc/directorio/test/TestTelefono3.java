package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi","098745657",21);
		Telefono telf2 = new Telefono("claro","092135484",12);
		Telefono telf3 = new Telefono("claro","095412314",19);
		AdminTelefono at = new AdminTelefono();
		int telfMovi = at.contarMovi(telf1,telf2,telf3);
		System.out.println("Telefonos con operadora movi: "+telfMovi);
	}
	public int contarClaro(Telefono telf1, Telefono telf2, Telefono telf3, Telefono telf4) {
		int telfClaro = 0;
		if (telf1.getOperadora() == "claro") {
			telfClaro++;
		}
		if(telf2.getOperadora() == "claro") {
			telfClaro++;
		}
		if(telf3.getOperadora() == "claro") {
			telfClaro++;
		}
		if(telf4.getOperadora() == "claro") {
			telfClaro++;
		}
		return telfClaro;
	}

}
