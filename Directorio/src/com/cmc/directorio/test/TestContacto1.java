package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movi","098456877",12);
		Contacto c = new Contacto("Sofia","Andrade",telef,1.5);
		
		System.out.println("nombre: "+c.getNombre());
		System.out.println("apellido: "+c.getApellido());
		System.out.println("operadora: "+telef.getOperadora());
		System.out.println("telefono: "+telef.getNumero());
		System.out.println("peso: "+c.getPeso());
	}

}
