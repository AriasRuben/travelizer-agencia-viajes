package uo.cpm.modulo.model;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import uo.cpm.modulo.model.Alojamiento.Tipo;
import uo.cpm.modulo.service.Agencia;

public class Reserva {

	// Variables del parque temático
	private ParqueTematico parqueTematico;
	private Date fechaEntradas;
	private int numeroEntradasAdultos;
	private int numeroEntradasNiños;
	private int numeroDias;

	// Variables del Alojamiento
	private Alojamiento alojamiento;
	private Date fechaAlojamientos;
	private int numeroNoches;
	private int numeroPersonas;

	// Variables adicionales
	private String nombreCliente;
	private String comentarios;
	private String documentoIdentificativo;

	private boolean hayBonoRegalo;
	private boolean hayParque;
	private boolean hayAlojamiento;

	public Reserva() {
		inicializarReserva();
	}

	public void inicializarReserva() {
		this.parqueTematico = null;
		this.alojamiento = null;
		this.fechaEntradas = null;
		this.fechaAlojamientos = null;
		this.numeroEntradasAdultos = 0;
		this.numeroEntradasNiños = 0;
		this.numeroDias = 0;
		this.numeroNoches = 0;
		this.numeroPersonas = 0;
		this.nombreCliente = null;
		this.comentarios = null;
		this.documentoIdentificativo = null;
		this.hayParque = false;
		this.hayAlojamiento = false;
		this.hayBonoRegalo = false;

	}

//--------------------------------------------------------------------------------------------------------------------//

//Getters y setters de la clase 

	public ParqueTematico getParqueTematico() {
		return parqueTematico;
	}

	public void setParqueTematico(ParqueTematico parqueTematico) {
		this.parqueTematico = parqueTematico;
	}

	public Date getFechaEntradas() {
		return fechaEntradas;
	}

	public void setFechaEntradas(Date fechaEntradas) {
		this.fechaEntradas = fechaEntradas;
	}

	public int getNumeroEntradasAdultos() {
		return numeroEntradasAdultos;
	}

	public void setNumeroEntradasAdultos(int numeroEntradasAdultos) {
		this.numeroEntradasAdultos = numeroEntradasAdultos;
	}

	public int getNumeroEntradasNiños() {
		return numeroEntradasNiños;
	}

	public void setNumeroEntradasNiños(int numeroEntradasNiños) {
		this.numeroEntradasNiños = numeroEntradasNiños;
	}

	public int getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}

	public Alojamiento getAlojamiento() {
		return alojamiento;
	}

	public void setAlojamiento(Alojamiento alojamiento) {
		this.alojamiento = alojamiento;
	}

	public Date getFechaAlojamientos() {
		return fechaAlojamientos;
	}

	public void setFechaAlojamientos(Date fechaAlojamientos) {
		this.fechaAlojamientos = fechaAlojamientos;
	}

	public int getNumeroNoches() {
		return numeroNoches;
	}

	public void setNumeroNoches(int numeroNoches) {
		this.numeroNoches = numeroNoches;
	}

	public int getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getDocumentoIdentificativo() {
		return documentoIdentificativo;
	}

	public void setDocumentoIdentificativo(String documentoIdentificativo) {
		this.documentoIdentificativo = documentoIdentificativo;
	}

	public String getNombreFicheroJustificante() {
		SimpleDateFormat sdfNombre = new SimpleDateFormat("dd-MM-yyyy_HH-mm");
		String fechaHoraNombre = sdfNombre.format(new Date());
		return this.documentoIdentificativo + "_" + fechaHoraNombre + ".txt";
	}

	public void setHayParque(boolean b) {
		this.hayParque = b;
	}

	public void setHayAlojamiento(boolean b) {
		this.hayAlojamiento = b;
	}

	public void setHayBono(boolean b) {
		this.hayBonoRegalo = b;
	}

	private ParqueTematico getParqueEnOferta() {
		return Agencia.getParqueEnOferta();
	}

//--------------------------------------------------------------------------------------------------------------------//

//Métodos usados para saber si podemos pasar a la pagina de reservas, hay descuento ...

	public boolean isHayBonoRegalo() {
		return hayBonoRegalo;
	}

	public boolean isHayParque() {
		return hayParque;
	}

	public boolean isHayAlojamiento() {
		return hayAlojamiento;
	}

	public boolean hayEntradasParque(int adultos, int dias) {
		return adultos > 0 && dias > 0;
	}

	public boolean noHayninios(int ninios) {
		return ninios == 0;
	}

	public boolean estaEnOferta(ParqueTematico p) {
		return p.getCodigoParque().equals(getParqueEnOferta().getCodigoParque());
	}

	public boolean parqueYAlojamientoEnOferta(ParqueTematico p) {
		return estaEnOferta(p) && p.getCodigoParque().equals(alojamiento.getCodigoParqueTematico());
	}

	public boolean sobrepasarCapacidadAlojamiento(int personas, Alojamiento a) {
		if (a != null) {
			if (a.getTipo().equals(Tipo.HO)) {
				return personas > 2;
			}

		}
		return personas > 4;
	}

//--------------------------------------------------------------------------------------------------------------------//
	/*
	 * Métodos donde calculamos los precios de cada cosa
	 */

	/**
	 * Calcula el número de unidades necesarias basándose en la capacidad máxima de
	 * cada tipo - Hotel: Máx 2 personas. Resto: Máx 4 personas.
	 */
	public int calcularUnidadesNecesarias() {
		if (alojamiento == null)
			return 0;

		int totalPersonas = getNumeroPersonas();
		double capacidadPorUnidad;

		// Determinamos la capacidad según el tipo
		if (alojamiento.getTipo().equals(Tipo.HO)) {
			capacidadPorUnidad = 2.0; // Hoteles: caben 2
		} else {
			capacidadPorUnidad = 4.0; // Apartamentos: caben 4
		}

		// 5 personas / 4 = 1.25 -> Math.ceil lo convierte en 2
		return (int) Math.ceil(totalPersonas / capacidadPorUnidad);
	}

	public double precioEntradas() {
		if (!hayParque || parqueTematico == null) {
			return 0.0;
		}

		double total = (parqueTematico.getPrecioAdulto() * numeroEntradasAdultos)
				+ (parqueTematico.getPrecioNiño() * numeroEntradasNiños);
		return total * numeroDias;
	}

	public double precioAlojamiento() {
		if (!hayAlojamiento || alojamiento == null) {
			return 0.0;
		}

		double precioFinal = 0.0;

		if (alojamiento.getTipo().equals(Tipo.HO)) {
			precioFinal = alojamiento.getPrecioAlojamiento() * getNumeroPersonas() * getNumeroNoches();
		} else {
			int numApartamentos = calcularUnidadesNecesarias();
			precioFinal = alojamiento.getPrecioAlojamiento() * numApartamentos * getNumeroNoches();
		}

		return precioFinal;
	}

	public double precioDescuento() {
		double descuento = 0.0;
		double tEntradas = precioEntradas();
		double tAlojamiento = precioAlojamiento();

		// Descuento en entradas
		if (hayParque && parqueTematico != null && estaEnOferta(parqueTematico)) {
			descuento += tEntradas * 0.15;
		}

		// Descuento en alojamiento
		if (hayAlojamiento && alojamiento != null && parqueTematico != null
				&& parqueYAlojamientoEnOferta(parqueTematico)) {
			descuento += tAlojamiento * 0.15;
		}

		return descuento;
	}

	public double precioTotal() {
		return (precioEntradas() + precioAlojamiento()) - precioDescuento();
	}

//--------------------------------------------------------------------------------------------------------------------//

	// Métodos que presentan en pantalla la reserva , y el otro que graba en disco
	// la reserva

	/**
	 * presenta antes de la reserva, el estado de la misma al cliente
	 * 
	 * @param textos
	 * @return
	 */

	public String presentarReservarPantalla(ResourceBundle textos) {
		return imprimirReserva(textos);
	}

	/**
	 * Guarda en disco el estado de la reserva, segun el formato del módulo
	 * 
	 * @param textos El diccionario de idiomas
	 */
	public String enseñarEnDisco(ResourceBundle textos) {
		return imprimirReserva(textos);
	}

//--------------------------------------------------------------------------------------------------------------------//

//Método que imprime todo el mensaje en funcion de la situacion

	private String imprimirReserva(ResourceBundle textos) {
		StringBuilder sb = new StringBuilder();
		SimpleDateFormat sdfFecha = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		// VIAJES TRAVELIZER
		// --------------------------------------
		sb.append(textos.getString("recibo.empresa")).append("\n\n");
		sb.append(textos.getString("recibo.separador")).append("\n");

		// JUSTIFICANTE DE RESERVA
		String tituloParque = (this.parqueTematico != null) ? this.parqueTematico.getDenominacion() : "SOLO ESTANCIA";
		String lineaTitulo = MessageFormat.format(textos.getString("recibo.titulo"), sdfHora.format(new Date()),
				tituloParque);
		sb.append(lineaTitulo).append("\n");

		// Datos Cliente
		String doc = (this.documentoIdentificativo != null) ? this.documentoIdentificativo : "---";
		String nom = (this.nombreCliente != null) ? this.nombreCliente : "---";
		sb.append(doc + " - " + nom).append("\n");
		sb.append(textos.getString("recibo.separador")).append("\n\n");

		// DATOS DE LA RESERVA
		sb.append(textos.getString("recibo.seccion.datos")).append("\n\n");

		// ENTRADAS -> HAY PARQUE O NO(NO HAY ENTRADAS)
		sb.append(textos.getString("recibo.seccion.entradas")).append("\n");
		if (!this.hayParque || this.parqueTematico == null) {
			sb.append(textos.getString("recibo.no.entradas")).append("\n");
			sb.append(MessageFormat.format(textos.getString("recibo.linea.adultos_ninos"),
					textos.getString("recibo.ne"), textos.getString("recibo.ne"))).append("\n\n");
		} else {
			String fechaEnt = (this.fechaEntradas != null) ? sdfFecha.format(this.fechaEntradas) : "---";
			sb.append(MessageFormat.format(textos.getString("recibo.linea.entradas"), fechaEnt, this.numeroDias))
					.append("\n");
			sb.append(MessageFormat.format(textos.getString("recibo.linea.adultos_ninos"), this.numeroEntradasAdultos,
					this.numeroEntradasNiños)).append("\n\n");
		}

		// ALOJAMIENTO -> HAY ALOJAMIENTO O NO (SOLO ENTRADAS)
		sb.append(textos.getString("recibo.seccion.alojamiento")).append("\n");
		if (!this.hayAlojamiento || this.alojamiento == null) {
			sb.append(textos.getString("recibo.no.alojamiento")).append("\n");
			sb.append(MessageFormat.format(textos.getString("recibo.linea.noches"), textos.getString("recibo.ne"),
					textos.getString("recibo.ne"))).append("\n");
			sb.append(MessageFormat.format(textos.getString("recibo.linea.personas"), textos.getString("recibo.ne")))
					.append("\n\n");
		} else {
			sb.append(MessageFormat.format(textos.getString("recibo.linea.aloj_detalle"), this.alojamiento.getTipo(),
					this.alojamiento.getCategoria(), this.alojamiento.getDenominacion())).append("\n");

			String fechaAlo = (this.fechaAlojamientos != null) ? sdfFecha.format(this.fechaAlojamientos) : "---";
			sb.append(MessageFormat.format(textos.getString("recibo.linea.noches"), fechaAlo, this.numeroNoches))
					.append("\n");

			sb.append(MessageFormat.format(textos.getString("recibo.linea.personas"), this.numeroPersonas))
					.append("\n\n");
		}

		// IMPORTE RESERVA
		sb.append("\n").append(textos.getString("recibo.seccion.importe")).append("\n\n");

		sb.append(String.format("%-30s %10.2f €\n", textos.getString("recibo.item.entradas"), precioEntradas()));
		sb.append(String.format("%-30s %10.2f €\n", textos.getString("recibo.item.alojamiento"), precioAlojamiento()));

		double desc = precioDescuento();
		if (desc > 0) {
			sb.append(String.format("%-30s %10.2f €\n", textos.getString("recibo.item.descuento"), desc));
		}

		// SI GANAMOS EL BONO, LO METEMOS EN DISCO
		if (hayBonoRegalo) {
			sb.append(textos.getString("msg.bono.fichero")).append("\n");
		}

		sb.append("\n").append(textos.getString("recibo.item.total") + " " + String.format("%35.2f €", precioTotal()));

		return sb.toString();
	}

}
