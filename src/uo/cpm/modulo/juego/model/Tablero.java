package uo.cpm.modulo.juego.model;

/**
 * Tablero del minijuego, que usa un array de casillas para ser modelado.
 * tenemos 5 casillas, y de manera aleatoria colocamos un bono en una de ellas.
 */
public class Tablero {
	private Casilla[] casillas;
	private static final int DIMENSION = 5;
	private int posicionBono;

	public Tablero() {
		casillas = new Casilla[DIMENSION];
		for (int i = 0; i < DIMENSION; i++) {
			casillas[i] = new Casilla();
		}
		colocaBono();
	}

	private void colocaBono() {
		posicionBono = (int) (Math.random() * DIMENSION);
		casillas[posicionBono] = new Casilla("/img/bono.png");
//		System.out.println("Posicion del Bono= " + posicionBono);

	}

	public Casilla[] getCasillas() {
		return casillas;
	}

	public void setCasillas(Casilla[] casillas) {
		this.casillas = casillas;
	}

	public int getPosicionBono() {
		return posicionBono;
	}

	public void setPosicionBono(int posicionBono) {
		this.posicionBono = posicionBono;
	}

}
