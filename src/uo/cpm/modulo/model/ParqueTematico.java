package uo.cpm.modulo.model;

/**
 * Clase ParqueTematico, encargada de modelar todas las características
 * oportunas de la relación de parques temáticos. En ella, se encuentran todas
 * las propiedades que representan al parque temático, asi como las reflejadas
 * en el fichero parques.dat. Un parque temático estara compuesto al menos de
 * las sigueintes propiedades:
 * 
 * 1.codigoParque - el cuál, identifica de manera unívoca cada parque
 * 2.denominacion - Texto que identifica al parque 3.pais - País en el que se
 * ubica el parque temático 4.localidad - Localidad en la que se ubica el parque
 * temático 5.descripcion - Detalles del parque temático 6.precioAdulto - Precio
 * día de la entrada para un adulto 7.precioNiño - Precio día de la entrada para
 * un niño.
 */

public class ParqueTematico {

	private String codigoParque;
	private String denominacion;
	private String pais;
	private String localidad;
	private String descripcion;
	private double precioAdulto;
	private double precioNiño;

	public ParqueTematico(String codigo, String denominacion, String pais, String localidad, String descripcion,
			double precioAdulto, double precioNiño) {

		this.codigoParque = codigo;
		this.denominacion = denominacion;
		this.pais = pais;
		this.localidad = localidad;
		this.descripcion = descripcion;
		this.precioAdulto = precioAdulto;
		this.precioNiño = precioNiño;
	}

	public ParqueTematico(ParqueTematico parque) {
		this(parque.codigoParque, parque.denominacion, parque.pais, parque.localidad, parque.descripcion,
				parque.precioAdulto, parque.precioNiño);

	}

	public String getCodigoParque() {
		return codigoParque;
	}

	public void setCodigoParque(String codigo) {
		this.codigoParque = codigo;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioAdulto() {
		return precioAdulto;
	}

	public void setPrecioAdulto(double precioAdulto) {
		this.precioAdulto = precioAdulto;
	}

	public double getPrecioNiño() {
		return precioNiño;
	}

	public void setPrecioNiño(double precioNiño) {
		this.precioNiño = precioNiño;
	}

	@Override
	public String toString() {
		return denominacion;
	}

}
