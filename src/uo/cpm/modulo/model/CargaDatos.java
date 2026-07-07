package uo.cpm.modulo.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import uo.cpm.modulo.model.Alojamiento.Tipo;
import uo.cpm.modulo.util.FileUtil;

/**
 * Clase CargaDatos encargada de realizar toda la carga de ficheros siguiendo la
 * máxima cohesión posible, y almacenar los datos de cada modelo en las dos
 * listas de parques y alojamientos respectivamente. presentara el metodo de
 * filtrar -> requisito de la aplicación
 */
public class CargaDatos {

	private static final String FICHERO_PARQUES = "files/parques.dat";
	private static final String FICHERO_ALOJAMIENTOS = "files/alojamientos.dat";
	private List<ParqueTematico> parquesDisponibles = null;
	private List<Alojamiento> alojamientosDisponibles = null;

	public CargaDatos() {
		parquesDisponibles = new ArrayList<ParqueTematico>();
		alojamientosDisponibles = new ArrayList<Alojamiento>();
		cargarDatos();
	}

//--------------------------------------------------------------------------------------------------------------------//

//Getters de la clase

	public List<ParqueTematico> getParquesDisponibles() {
		return parquesDisponibles;
	}

	public List<Alojamiento> getAlojamientosDisponibles() {
		return alojamientosDisponibles;
	}

//--------------------------------------------------------------------------------------------------------------------//

//metodo para cargar la lista de parques en el combo de la ventana principal.

	public ParqueTematico[] getParquesDisponiblesCombo() {
		ordenarComboBox();
		return parquesDisponibles.toArray(new ParqueTematico[parquesDisponibles.size()]);

	}

//metodo que carga de fichero los parques y alojamientos

	private void cargarDatos() {
		FileUtil.loadFileParques(FICHERO_PARQUES, parquesDisponibles);
		FileUtil.loadFileAlojamientos(FICHERO_ALOJAMIENTOS, alojamientosDisponibles);

	}

	/**
	 * Método que aplica la metodologia para comparar los elementos del comboBox
	 */
	private void ordenarComboBox() {
		Collections.sort(parquesDisponibles, new Comparator<ParqueTematico>() {

			@Override
			public int compare(ParqueTematico o1, ParqueTematico o2) {
				return o1.getDenominacion().compareToIgnoreCase(o2.getDenominacion());
			}
		});
	}

	/**
	 * Metodo que realiza el filtro por alojamientos. si el tipo de alojamiento y el
	 * codigo del parque y alojamiento coinciden, filtramos.
	 * 
	 * @param tipo
	 * @param p
	 * @return alojamientos filtrados
	 */
	public List<Alojamiento> filtrarAlojamientos(Tipo tipo, ParqueTematico p) {
		List<Alojamiento> alojamientos = new ArrayList<Alojamiento>();
		if (tipo == null || p == null) {
			return alojamientos;
		}
		for (Alojamiento a : alojamientosDisponibles) {
			if (a.getTipo().equals(tipo) && a.getCodigoParqueTematico().equals(p.getCodigoParque())) {
				alojamientos.add(a);
			}

		}
		return alojamientos;

	}

}
