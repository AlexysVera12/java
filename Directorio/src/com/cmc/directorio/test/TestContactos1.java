package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "098745878", 20);
		Telefono telf2 = new Telefono("claro", "098765782", 12);
		Contacto contacto1 = new Contacto("Maria", "Paz", telf1, 0.1);
		Contacto contacto2 = new Contacto("Antony", "Gamarra", telf2, 0.3);
		AdminContactos ac = new AdminContactos();

		Contacto contactoPesado = ac.buscarMasPesado(contacto1, contacto2);
		boolean operadoraIgual = ac.compararOperadoras(contacto1, contacto2);
		
		
		System.out.println("Contacto más pesado: " + contactoPesado.getNombre() + " " + contactoPesado.getApellido()
				+ ", operadora " + contactoPesado.getTelefono().getOperadora() + ", numero "
				+ contactoPesado.getTelefono().getNumero() + ", codigo " + contactoPesado.getTelefono().getCodigo()
				+ ", peso " + contactoPesado.getPeso());
		System.out.println("La igualdad de las operadoras de los contactos: "+operadoraIgual);
	}

}
