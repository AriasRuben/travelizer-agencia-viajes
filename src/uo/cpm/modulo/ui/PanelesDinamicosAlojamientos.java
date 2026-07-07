package uo.cpm.modulo.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import uo.cpm.modulo.model.Alojamiento;

public class PanelesDinamicosAlojamientos extends JPanel {

	private static final long serialVersionUID = 1L;
	private VentanaPrincipal vP;
	private Alojamiento alojamiento;
	private JRadioButton rdbtnSeleccion;
	private JLabel lblImagen;
	private JLabel lbDenominacion;
	private JLabel lblPrecio;

	/**
	 * Constructor
	 */
	public PanelesDinamicosAlojamientos(VentanaPrincipal v, Alojamiento a) {
		this.vP = v;
		this.alojamiento = a;

		setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
		setBackground(Color.WHITE);
		this.setPreferredSize(new Dimension(450, 130));
		setLayout(new GridLayout(1, 4, 0, 0));
		add(getLblImagen());
		add(getLbDenominacion());
		add(getLblPrecio());
		add(getRdbtnSeleccion());

	}

	private JLabel getLblImagen() {
		if (lblImagen == null) {
			lblImagen = new JLabel("");
			lblImagen.setBackground(Color.WHITE);
			lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
			adaptarImagenLabel();
		}
		return lblImagen;
	}

	private JLabel getLbDenominacion() {
		if (lbDenominacion == null) {
			lbDenominacion = new JLabel();
			lbDenominacion.setText("<html><div style='text-align: center;'>" + "<font size='4'><b>"
					+ alojamiento.getDenominacion() + "</b></font>" + "<br/>" + "<font size='4'>"
					+ alojamiento.getTipo() + " - " + alojamiento.getCategoria() + "</font>" + "</div></html>");
			lbDenominacion.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lbDenominacion;
	}

	public JRadioButton getRdbtnSeleccion() {
		if (rdbtnSeleccion == null) {
			rdbtnSeleccion = new JRadioButton("");
			rdbtnSeleccion.setBackground(Color.WHITE);
			rdbtnSeleccion.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnSeleccion.setFocusable(false);
		}
		return rdbtnSeleccion;
	}

	private JLabel getLblPrecio() {
		if (lblPrecio == null) {
			lblPrecio = new JLabel();
			lblPrecio.setFont(new Font("Arial Black", Font.BOLD, 20));
			lblPrecio.setHorizontalAlignment(SwingConstants.CENTER);
			lblPrecio.setText(alojamiento.getPrecioAlojamiento() + " €");
		}
		return lblPrecio;
	}

	private void adaptarImagenLabel() {
		String ruta = "/img/" + alojamiento.getCodigoAlojamiento() + ".png";
		if (PanelesDinamicosAlojamientos.class.getResource(ruta) != null) {
			Image imgOriginal = new ImageIcon(PanelesDinamicosAlojamientos.class.getResource(ruta)).getImage();
			Image imgEscalada = imgOriginal.getScaledInstance(150, 120, Image.SCALE_SMOOTH);
			getLblImagen().setIcon(new ImageIcon(imgEscalada));
		} else {
			getLblImagen().setText("Sin Foto");
		}
	}

	public boolean estaSeleccionado() {
		return getRdbtnSeleccion().isSelected();
	}

	public Alojamiento getAlojamiento() {
		return this.alojamiento;
	}

	public VentanaPrincipal getvP() {
		return vP;
	}

}