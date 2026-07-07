package uo.cpm.modulo.juego.model;

/**
 * Clase que representa las casillas del tablero del minijuego. solo tendremos
 * una imagen como propiedad, ya que se debe encontrar el bono
 */

public class Casilla {
	private String imagen;

	public Casilla() {

	}

	public Casilla(String img) {
		this.imagen = img;

	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

}
