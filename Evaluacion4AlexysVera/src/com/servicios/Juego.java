package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<Carta> naipeBarajado;
	private ArrayList<ArrayList<Carta>> cartasJugadores = new ArrayList<>();

	public Juego(ArrayList<String> idsJugadores) {
		this.naipe = new Naipe();
		this.naipe = new Naipe();
		this.naipeBarajado = naipe.barajar();
		this.cartasJugadores = new ArrayList<>();
		for (int i = 0; i < idsJugadores.size(); i++) {
			ArrayList<Carta> cartasJugador = new ArrayList<>();
			cartasJugadores.add(cartasJugador);
		}
	}

	public Juego() {
		this.naipe = new Naipe();
		this.naipeBarajado = naipe.barajar();
		this.cartasJugadores = new ArrayList<>();
	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	public void entregarCartas(int cartasPorJugador) {
		int totalJugadores = cartasJugadores.size();
		int indiceCarta = 0;
		for (int i = 0; i < cartasPorJugador; i++) {
			for (int x = 0; x < totalJugadores; x++) {
				if (indiceCarta < naipeBarajado.size()) {
					Carta carta = naipeBarajado.get(indiceCarta);
					cartasJugadores.get(x).add(carta);
					indiceCarta++;
				}
			}
		}
	}

	public int devolverTotal(int idJugador) {
        int total = 0;
        ArrayList<Carta> cartasJugador = cartasJugadores.get(idJugador);
        for (int i = 0; i < cartasJugador.size(); i++) {
            total += cartasJugador.get(i).getValor();
        }

        return total;
	}
	public String determinarGanador() {
	    int idGanador = 0;
	    int SumaGanador = devolverTotal(0);

	    for (int i = 1; i < cartasJugadores.size(); i++) {
	        int totalActual = devolverTotal(i);
	        if (totalActual > SumaGanador) {
	            SumaGanador = totalActual;
	            idGanador = i;
	        }
	    }

	    return "jugador " + (idGanador + 1);
	}

}
