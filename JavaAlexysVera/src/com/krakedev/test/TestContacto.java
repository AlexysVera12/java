package com.krakedev.test;

import com.krakedev.evaluacion.Contacto;
import com.krakedev.evaluacion.Direccion;

public class TestContacto {

	public static void main(String[] args) {
	    

        // Crear una instancia de Contacto
        Contacto contacto = new Contacto("1234567890", "Juan", "Pérez");

        // Settear la dirección
        Direccion Direccion = new Direccion("AV. siempre Viva", "Calle 4");
        contacto.setDireccion(Direccion);

        // Mostrar información 
        System.out.println("\nInformación del Contacto:");
        contacto.imprimir();
        
        //Se modifico la clase porque estaba incompleta
        
        //Crear una instancia de contacto actualizado
        Contacto contacto2 = new Contacto("9876543210", "Ana", "Gómez");
        
        //Settear la direccion
        Direccion Direccion2 = new Direccion("Cdl del ejercito", "Pasaje 2B");
        contacto2.setDireccion(Direccion2);
        
        // Mostrar información 
        System.out.println("\nInformación del Contacto (actualizada):");
        contacto2.imprimir();
    }
}

