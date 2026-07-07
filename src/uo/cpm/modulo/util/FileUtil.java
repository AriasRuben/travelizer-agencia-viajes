package uo.cpm.modulo.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ResourceBundle;

import uo.cpm.modulo.model.Alojamiento;
import uo.cpm.modulo.model.ParqueTematico;
import uo.cpm.modulo.model.Reserva;

public abstract class FileUtil {

	public static void loadFileParques(String nombreFicheroEntrada, List<ParqueTematico> parques) {

		String linea;
		String[] datosParque = null;

		try {
			BufferedReader fichero = new BufferedReader(new FileReader(nombreFicheroEntrada));
			while (fichero.ready()) {
				linea = fichero.readLine();
				datosParque = linea.split("@");
				parques.add(new ParqueTematico(datosParque[0], datosParque[1], datosParque[2], datosParque[3],
						datosParque[4], Double.parseDouble(datosParque[5]), Double.parseDouble(datosParque[6])));
			}
			fichero.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("El archivo no se ha encontrado.");
		} catch (IOException ioe) {
			new RuntimeException("Error de entrada/salida.");
		}
	}

	public static void loadFileAlojamientos(String nombreFicheroEntrada, List<Alojamiento> alojamientos) {

		String linea;
		String[] datosAlojamiento = null;

		try {
			BufferedReader fichero = new BufferedReader(new FileReader(nombreFicheroEntrada));
			while (fichero.ready()) {
				linea = fichero.readLine();
				datosAlojamiento = linea.split("@");
				alojamientos.add(new Alojamiento(datosAlojamiento[0], Alojamiento.Tipo.valueOf(datosAlojamiento[1]),
						Integer.parseInt(datosAlojamiento[2]), datosAlojamiento[3], datosAlojamiento[4],
						Double.parseDouble(datosAlojamiento[5])));
			}
			fichero.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("El archivo no se ha encontrado.");
		} catch (IOException ioe) {
			new RuntimeException("Error de entrada/salida.");
		}
	}

	public static void saveReserva(Reserva reserva, ResourceBundle r) {
		String nombreFichero = "files/" + reserva.getNombreFicheroJustificante();

		try (BufferedWriter fichero = new BufferedWriter(new FileWriter(nombreFichero))) {
			fichero.write(reserva.enseñarEnDisco(r));
			System.out.println("Reserva guardada correctamente en: " + nombreFichero);

		} catch (IOException ioe) {
			System.err.println("Error guardando la reserva: " + ioe.getMessage());
		}
	}

}
