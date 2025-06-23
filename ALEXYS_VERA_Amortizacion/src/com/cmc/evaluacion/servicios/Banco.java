package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Cliente> clientesConPrestamo;

	public Banco() {
		this.prestamos = new ArrayList<>();
		this.clientes = new ArrayList<>();
		this.clientesConPrestamo = new ArrayList<>();
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente buscarCliente(String cedula) {
		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			if (cedula == cliente.getCedula()){
				return cliente;
			}
		}
		return null;
	}

	public void registrarCliente(Cliente cliente) {
		if (buscarCliente(cliente.getCedula()) == null) {
			clientes.add(cliente);
		}
	}
	public void asignarPrestamo(String cedula,Prestamo prestamo) {
		Cliente cliente = buscarCliente(cedula);
		
		if(cliente == null) {
			System.out.println("no es cliente del banco");
		}else {
			CalculadoraAmortizacion.generarTabla(prestamo);
			prestamos.add(prestamo);
			clientesConPrestamo.add(cliente);
		}
	}
	public ArrayList<Prestamo> buscarPrestamos(String cedula){
		ArrayList<Prestamo> resultado = new ArrayList<>();
		
		for (int i = 0; i < prestamos.size(); i++) {
			Cliente cliente = clientesConPrestamo.get(i);
			if(cedula.equals(cliente.getCedula())){
			resultado.add(prestamos.get(i));
			}
		}

		return resultado;
	}

}
