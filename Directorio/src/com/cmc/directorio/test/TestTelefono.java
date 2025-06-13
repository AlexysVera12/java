package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi","09941234123",10);
		System.out.println("operadora: "+telf.getOperadora());
		System.out.println("numero: "+telf.getNumero());
		System.out.println("codigo: "+telf.getCodigo());
	}

}
