package uo.cpm.modulo.juego.service;

import uo.cpm.modulo.juego.model.Tablero;

/**
 * Juego de la app que consiste en encontrar un bono escondido en 5 casillas de
 * forma aleatoria. si se consigue, se refleja en la reserva.
 */

public class Juego {
	private Tablero tablero;
	private boolean finJuego;

	public Juego() {
		inicializar();
	}

	public void inicializar() {
		this.tablero = new Tablero();
		this.finJuego = false;

	}

	public boolean bonoEncontrado(int pos) {
		String imagen = "/img/bono.png";
		return imagen.equals(tablero.getCasillas()[pos].getImagen());

	}

	public void jugar(int i) {
		setFinJuego(bonoEncontrado(i));

	}

	public String getImagen(int i) {
		return tablero.getCasillas()[i].getImagen();
	}

	public int getPosicionBono() {
		return tablero.getPosicionBono();
	}

	public boolean isFinJuego() {
		return finJuego;
	}

	public void setFinJuego(boolean finJuego) {
		this.finJuego = finJuego;
	}

}
