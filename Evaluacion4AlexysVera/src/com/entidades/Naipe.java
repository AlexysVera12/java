package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles = new ArrayList<>();
	private ArrayList<Carta> cartas = new ArrayList<>();

	public Naipe() {
		numerosPosibles.add(new Numero("A", 11));
		numerosPosibles.add(new Numero("2", 2));
		numerosPosibles.add(new Numero("3", 3));
		numerosPosibles.add(new Numero("4", 4));
		numerosPosibles.add(new Numero("5", 5));
		numerosPosibles.add(new Numero("6", 6));
		numerosPosibles.add(new Numero("7", 7));
		numerosPosibles.add(new Numero("8", 8));
		numerosPosibles.add(new Numero("9", 9));
		numerosPosibles.add(new Numero("10", 10));
		numerosPosibles.add(new Numero("J", 10));
		numerosPosibles.add(new Numero("Q", 10));
		numerosPosibles.add(new Numero("K", 10));

		Palos palo = new Palos();

		for (int i = 0; i < numerosPosibles.size(); i++) {
			Numero numero = numerosPosibles.get(i);

			cartas.add(new Carta(numero, palo.getCorazonNegro()));
			cartas.add(new Carta(numero, palo.getCorazonRojo()));
			cartas.add(new Carta(numero, palo.getDiamante()));
			cartas.add(new Carta(numero, palo.getTrebol()));
		}
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public ArrayList<Carta> barajar() {
		ArrayList<Carta> auxiliar = new ArrayList<>();
		for (int i = 1; i < 100; i++) {
			Random random = null;
			int posicion = random.obtenerPosicion();
			Carta carta = cartas.get(posicion);
			if (carta.getEstado().equals("N")) {
				auxiliar.add(carta);
				carta.setEstado("C");
			}
		}

		for (int i = 0; i < cartas.size(); i++) {
			Carta carta = cartas.get(i);
			if (carta.getEstado().equals("N")) {
				auxiliar.add(carta);
			}
		}
		return auxiliar;
	}

}
