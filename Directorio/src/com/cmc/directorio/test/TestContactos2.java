package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro", "094564887", 17);
		Telefono telf2 = new Telefono("claro", "092145231", 21);
		Contacto contacto1 = new Contacto("Pedro", "cedeño", telf1, 0.15);
		Contacto contacto2 = new Contacto("Cristian", "Pazmiño", telf2, 0.099);
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
