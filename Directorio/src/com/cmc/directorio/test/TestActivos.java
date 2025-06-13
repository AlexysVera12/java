package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
//import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi","0921271912",19);
		Contacto contacto = new Contacto("Pablo", "Cedeño",telf,0.2);
		AdminContactos ac = new AdminContactos();
		//AdminTelefono at = new AdminTelefono();
		
		System.out.println("nombre: "+contacto.getNombre());
		System.out.println("apellido: "+contacto.getApellido());
		System.out.println("operadora: "+contacto.getTelefono().getOperadora());
		System.out.println("numero: "+contacto.getTelefono().getNumero());
		System.out.println("codigo: "+contacto.getTelefono().getCodigo());
		System.out.println("peso: "+contacto.getPeso());
		System.out.println("Whatsapp: "+contacto.getTelefono().isTieneWhatsapp());
		System.out.println("------------------");
		//at.activarMensajeria(telf);
		ac.activarUsuario(contacto);
		System.out.println("nombre: "+contacto.getNombre());
		System.out.println("apellido: "+contacto.getApellido());
		System.out.println("operadora: "+contacto.getTelefono().getOperadora());
		System.out.println("numero: "+contacto.getTelefono().getNumero());
		System.out.println("codigo: "+contacto.getTelefono().getCodigo());
		System.out.println("peso: "+contacto.getPeso());
		System.out.println("Whatsapp: "+contacto.getTelefono().isTieneWhatsapp());
		System.out.println("Activo: "+contacto.isActivo());
	}

}
