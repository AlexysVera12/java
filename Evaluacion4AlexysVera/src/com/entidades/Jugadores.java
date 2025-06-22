package com.entidades;

import java.util.ArrayList;

import com.servicios.Juego;

public class Jugadores {
	private ArrayList<String> jugadores = new ArrayList<>();

	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void agregarJugador(String nombre) {
		jugadores.add(nombre);
	}
	public void jugar() {
		Juego juego = new Juego(jugadores);
		juego.entregarCartas(5);
		int maxPuntos = -1;
		int indiceGanador = -1;
		for(int i = 0; i < jugadores.size(); i++) {
			int total = 0;
			ArrayList<Carta> cartasJugador = juego.getCartasJugadores().get(i);
			for (int x = 0; x < cartasJugador.size(); x++) {
				total += cartasJugador.get(x).getValor();
			}
			System.out.println("Jugador "+ (i+1)+": "+jugadores.get(i)+" - Total puntos: "+total);
			if(total > maxPuntos) {
				maxPuntos = total;
				indiceGanador = i;
			}
		}
		String ganador = jugadores.get(indiceGanador);
		System.out.println("El ganador es: "+ganador);
	}
}
