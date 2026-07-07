package uo.cpm.modulo.model;

/**
 * Clase Alojamiento, encargada de modelar todas las características oportunas
 * de la relación de alojamientos. En ella, se encuentran todas las propiedades
 * que representan al alojamiento, asi como las reflejadas en el fichero
 * alojamientos.dat. Un alojamiento estara compuesto al menos de las sigueintes
 * propiedades:
 * 
 * 1.codigoAlojamiento - el cuál, identifica de manera unívoca cada alojamiento
 * 2.tipo - que podra ser de tres tipos, modelado mediante un enumerado(AP
 * (Apartamento), HO (Hotel), AH (Apartahotel)) 3.categoria - Estrellas del
 * establecimiento 4.denominacion - Nombre del alojamiento
 * 5.codigoParqueTematico - Identificación del parque temático asociado al
 * alojamiento 6.precioAlojamiento - que cambiara en funcion de hotel o
 * apartamento o apartahotel
 */

public class Alojamiento {

	public enum Tipo {AP, HO, AH}
	private String codigoAlojamiento;
	private Tipo tipo;
	private int categoria;
	private String denominacion;
	private String codigoParqueTematico;
	private double precioAlojamiento;

	public Alojamiento(String codigoAlojamiento, Tipo tipo, int categoria, String denominacion,
			String codigoParqueTematico, double precioAlojamiento) {

		this.codigoAlojamiento = codigoAlojamiento;
		this.tipo = tipo;
		this.categoria = categoria;
		this.denominacion = denominacion;
		this.codigoParqueTematico = codigoParqueTematico;
		this.precioAlojamiento = precioAlojamiento;
	}

	public Alojamiento(Alojamiento otro) {
		this(otro.codigoAlojamiento, otro.tipo, otro.categoria, otro.denominacion, otro.codigoParqueTematico,
				otro.precioAlojamiento);
	}

	public String getCodigoAlojamiento() {
		return codigoAlojamiento;
	}

	public void setCodigoAlojamiento(String codigoAlojamiento) {
		this.codigoAlojamiento = codigoAlojamiento;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public String getCodigoParqueTematico() {
		return codigoParqueTematico;
	}

	public void setCodigoParqueTematico(String codigoParqueTematico) {
		this.codigoParqueTematico = codigoParqueTematico;
	}

	public double getPrecioAlojamiento() {
		return precioAlojamiento;
	}

	public void setPrecioAlojamiento(double precioAlojamiento) {
		this.precioAlojamiento = precioAlojamiento;
	}

	public String toString() {
		return this.denominacion;
	}

}
