package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telf1) {
		if (telf1.getOperadora() == "movi") {
			telf1.setTieneWhatsapp(true);;
		}
	}
	public int contarMovi(Telefono telf1, Telefono telf2, Telefono telf3) {
		int telfMovi = 0;
		if(telf1.getOperadora() == "movi") {
			telfMovi++;
		}
		if(telf2.getOperadora() == "movi") {
			telfMovi++;
		}
		if(telf3.getOperadora() == "movi") {
			telfMovi++;
		}
		return telfMovi;
	}
}
