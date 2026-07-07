package uo.cpm.modulo.service;

import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

import uo.cpm.modulo.model.Alojamiento;
import uo.cpm.modulo.model.Alojamiento.Tipo;
import uo.cpm.modulo.model.CargaDatos;
import uo.cpm.modulo.model.ParqueTematico;
import uo.cpm.modulo.model.Reserva;
import uo.cpm.modulo.util.FileUtil;

/**
 * Clase servicio Agencia, que hará de puente entre lógica e interfaz para hacer
 * que la app funcione.
 */
public class Agencia {

	public static final int NOCHES = 31;
	private Reserva reserva = new Reserva();
	private CargaDatos carga = new CargaDatos();
	private static ParqueTematico parqueEnOferta;

	public Agencia() {
		inicializarApp();
	}

	public void inicializarApp() {
		reserva.inicializarReserva();
		generarParqueEnOferta();
	}

//--------------------------------------------------------------------------------------------------------------------//

// Getters y setters

	public List<ParqueTematico> getParquesDisponibles() {
		return carga.getParquesDisponibles();
	}

	public static ParqueTematico getParqueEnOferta() {
		return parqueEnOferta;
	}

	public Alojamiento getAlojamiento(int i) {
		return carga.getAlojamientosDisponibles().get(i);
	}

	public void setBono(boolean b) {
		reserva.setHayBono(b);

	}

	public void setHayParque(boolean b) {
		reserva.setHayParque(b);
	}

	public void setHayAlojamiento(boolean b) {
		reserva.setHayAlojamiento(b);
	}

	public ParqueTematico[] getParquesDisponiblesCombo() {
		return carga.getParquesDisponiblesCombo();
	}

//--------------------------------------------------------------------------------------------------------------------//

//Métodos importantes -> usados en interfaz

	/**
	 * Metodo que calcula de manera aleatoria un parque en oferta
	 */
	public void generarParqueEnOferta() {
		Random r = new Random();
		int numeroAleatorio = r.nextInt(carga.getParquesDisponibles().size());
		ParqueTematico p = carga.getParquesDisponibles().get(numeroAleatorio);
		parqueEnOferta = p;

	}

	/**
	 * Si hay al menos un adulto y un 1 dia de reserva -> puedo pasar a reservar
	 * 
	 * @param adultos
	 * @param dias
	 * @return si puedo reservar o no
	 */
	public boolean puedoReservar(int adultos, int dias) {
		return reserva.hayEntradasParque(adultos, dias);
	}

	/**
	 * Grabamos en disco la reserva
	 * 
	 * @param r
	 */
	public void grabarReserva(ResourceBundle r) {
		FileUtil.saveReserva(reserva, r);
	}

	/**
	 * Metodo que establece todos los atributos de logica en funcion de los valores
	 * de la interfaz
	 * 
	 * @param parque
	 * @param alojamiento
	 * @param fecha
	 * @param adultos
	 * @param ninos
	 * @param dias
	 * @param noches
	 * @param nombre
	 * @param dni
	 */
	public void setDatosReserva(ParqueTematico parque, Alojamiento alojamiento, java.util.Date fechaEntradas,
			java.util.Date fechaAlojamiento, int adultos, int ninos, int dias, int noches, String nombre, String dni) {
		this.reserva.setParqueTematico(parque);
		this.reserva.setAlojamiento(alojamiento);
		this.reserva.setFechaEntradas(fechaEntradas);
		this.reserva.setNumeroEntradasAdultos(adultos);
		this.reserva.setNumeroEntradasNiños(ninos);
		this.reserva.setNumeroDias(dias);
		this.reserva.setNombreCliente(nombre);
		this.reserva.setDocumentoIdentificativo(dni);

		if (alojamiento != null) {
			this.reserva.setFechaAlojamientos(fechaAlojamiento);
			this.reserva.setNumeroNoches(noches);
			this.reserva.setNumeroPersonas(adultos + ninos);

		}
	}

	/**
	 * Método que presenta en la pantalla la reserva
	 * 
	 * @param textos
	 * @return
	 */
	public String presentarReservarPantalla(ResourceBundle textos) {
		return reserva.presentarReservarPantalla(textos);
	}

	/**
	 * Metodo de los filtros
	 * 
	 * @param tipo
	 * @param p
	 * @return filtro
	 */
	public List<Alojamiento> filtrarAlojamientos(Tipo tipo, ParqueTematico p) {
		return carga.filtrarAlojamientos(tipo, p);

	}

	/**
	 * Devuelve un alojamiento que usaremos para crear en la pagina de reservas
	 * 
	 * @param a
	 * @return alojamiento
	 */
	public Alojamiento dameAlojamiento(Alojamiento a) {
		return a;
	}

	/**
	 * Obtiene el parque en oferta para reflejarlo en la página principal
	 * 
	 * @return
	 */
	public String imprimirParqueEnOferta() {
		return parqueEnOferta.getDenominacion();
	}

	/**
	 * comprueba que no se sobrepasa la capacidad maxima de cada alojamiento
	 * 
	 * @param personas
	 * @return
	 */
	public boolean sobrepasarCapacidadAlojamiento(int personas, Alojamiento a) {
		return reserva.sobrepasarCapacidadAlojamiento(personas, a);
	}

	public List<Alojamiento> getAlojamientosDisponibles() {
		return carga.getAlojamientosDisponibles();
	}

	public boolean isHayParque() {
		return reserva.isHayParque();
	}

	public boolean isHayAlojamiento() {
		return reserva.isHayAlojamiento();
	}

}
