package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos = new ArrayList<>();
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos = new ArrayList<>();
	private ArrayList<Contacto> incorrectos = new ArrayList<>();

	public Directorio() {
		for (int i = 0; i < contactos.size(); i++) {
			Contacto contactoEncontrado = contactos.get(i);
			if (buscarPorCedula(contactoEncontrado.getCedula()) == null) {
				agregarContacto(contactos.get(i));
			}
		}
	}
	
	

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}



	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}



	public Date getFechaModificacion() {
		return fechaModificacion;
	}



	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}



	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}



	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}



	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}



	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}



	public boolean agregarContacto(Contacto contacto) {
		if (buscarPorCedula(contacto.getCedula()) == null) {
			contactos.add(contacto);
			fechaModificacion = new Date();
			return true;
		} else {
			return false;
		}
	}

	public Contacto buscarPorCedula(String cedula) {
		for (int i = 0; i < contactos.size(); i++) {
			Contacto contactoEncontrado = contactos.get(i);
			if (cedula.equals(contactoEncontrado.getCedula())) {
				return contactoEncontrado;
			}
		}
		return null;
	}

	public String consultarUltimaModificacion() {
		if (fechaModificacion != null) {
			SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			return formato.format(fechaModificacion);
		}
		return "No se ha realizado ninguna modificacion";
	}

	public int contarPerdidos() {
		int perdidos = 0;
		for (int i = 0; i < contactos.size(); i++) {
			Contacto contacto = contactos.get(i);
			if (contacto.getDireccion() == null) {
				perdidos++;
			}
		}
		return perdidos;
	}

	public int contarFijos() {
		int fijos = 0;
		for (int i = 0; i < contactos.size(); i++) {
			Contacto contacto = contactos.get(i);
			ArrayList<Telefono> telefonos = contacto.getTelefonos();
			for (int x = 0; x < telefonos.size(); x++) {
				Telefono telefono = telefonos.get(x);
				if (telefono.getTipo().equals("Convencional") && telefono.getEstado().equals("C")) {
					fijos++;
				}
			}
		}
		return fijos;
	}
	public void depurar() {
		for(int i = 0; i < contactos.size(); i++) {
			Contacto contacto = contactos.get(i);
			if(contacto.getDireccion() != null) {
				correctos.add(contacto);
			}else {
				incorrectos.add(contacto);
			}
		}
		contactos.clear();
	}
}
