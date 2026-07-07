package uo.cpm.modulo.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import uo.cpm.modulo.juego.service.Juego;
import uo.cpm.modulo.model.Alojamiento;
import uo.cpm.modulo.model.Alojamiento.Tipo;
import uo.cpm.modulo.model.ParqueTematico;
import uo.cpm.modulo.service.Agencia;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JCalendar;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;

import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.text.MessageFormat;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.WindowAdapter;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel pnNorte;
	private JPanel pnCentro;
	private JButton btParquesAsociados;
	private ResourceBundle textos;
	private JButton btServicios;
	private JButton btQuienesSomos;
	private JButton btAyuda;
	private Agencia agencia;
	private JPanel pnInicio;
	private JPanel pnInicioIzquierda;
	private JButton btReservasSimple;
	private JComboBox<ParqueTematico> cbParques;
	private JLabel lbImagenesCombo;
	private JPanel pnInicioDerecha;
	private JCalendar calendar;
	private JButton btrReservasGrupos;
	private JPanel pnServicios;
	private JPanel pnParquesAsociados;
	private JButton btLogo;
	private JPanel pnServiciosOfrecidos;
	private JPanel pnServiciosImagenes;
	private JScrollPane scrollServicios;
	private JTextArea textAreaServicios;
	private JPanel pnServiciosImagenesArriba;
	private JLabel lbImg1;
	private JLabel lbImg2;
	private JLabel lbImg3;
	private JLabel lbImg4;
	private JLabel lbImg5;
	private JPanel pnServiciosImagenesAbajo;
	private JLabel lbImg6;
	private JLabel lbImg7;
	private JLabel lbImg8;
	private JLabel lbImg9;
	private JButton btVolverPaginaPrincipal;
	private JPanel pnQuienesSomos;
	private JPanel pnQuienesSomosFoto;
	private JLabel lbQuienesSomosFoto;
	private JButton btQuienesSomosAyuda;
	private JScrollPane scrollQuienesSomos;
	private JTextArea textAreaQuienesSomos;
	private JPanel pnParquesAsociadosNorte;
	private JLabel lbPreguntaParquesAsociados;
	private JPanel pnParquesAsociadosCentro;
	private JPanel pnParquesAsociadosCentroOeste;
	private JPanel pnParquesAsociadosCentroCentro;
	private JPanel pnParquesAsociadosCentroEste;
	private JLabel lbParquesAsociadosOeste;
	private JButton btES;
	private JButton btEN;
	private JLabel lbParquesAsociadosCentro;
	private JLabel lbParquesAsociadosEste;
	private JButton btParquesAsociadosOeste;
	private JButton btParquesAsociadosCentro;
	private JButton btParquesAsociadosEste;
	private JPanel pnParquesAsociadosSur;
	private JButton btParquesAsociadosServicios;
	private JSpinner spAdultos;
	private JSpinner spNinos;
	private JLabel lbAdultos;
	private JLabel lbNinos;
	private JPanel pnReservaEntradasSimple;
	private JPanel pnReservaSimpleIzquierda;
	private JPanel pnReservaSimpleCheckBoxes;
	private JCheckBox checkHotelSimple;
	private JCheckBox checkApartamentoSimple;
	private JCheckBox checkApartaHotelSimple;
	private JCheckBox checkEntradasSimple;
	private JPanel pnReservaSimpleDerechaParque;
	private JLabel lbReservaSimpleParque;
	private JScrollPane scrollPaneReservaSimple;
	private JTextArea textAreaReservaSimple;
	private JPanel pnPago;
	private JPanel pnPagoResumen;
	private JTextField txPagoResumen;
	private JPanel pnPagoCamposTexto;
	private JLabel lbNombreTitular;
	private JTextField txNombreTitular;
	private JLabel lbDocumentoIdentificativo;
	private JTextField txDocumentoIdentificativo;
	private JLabel lbFechaCaducidad;
	private JTextField txFechaCaducidad;
	private JLabel lbCvv;
	private JTextField txCvv;
	private JButton btPagoModificar;
	private JButton btnProcederPago;
	private JPanel pnFinalizarReserva;
	private JLabel lbDias;
	private JSpinner spDias;
	private JPanel pnFinalizarReservaBoton;
	private JButton btFinalizarReserva;
	private JPanel pnFinalizarReservaCentro;
	private JScrollPane scrollPaneFinalizarReserva;
	private JTextArea textAreaFinalizarReserva;
	private JPanel pnMiniJuego;
	private DescubreCasilla casilla = new DescubreCasilla();
	private Juego juego = new Juego();
	private JPanel pnJuegoTablero;
	private JButton btJuego4;
	private JButton btJuego3;
	private JButton btJuego0;
	private JButton btJuego2;
	private JButton btJuego1;
	private final ButtonGroup checkExclusivo = new ButtonGroup();
	private final ButtonGroup checkExclusivoAmbos = new ButtonGroup();
	private JLabel lbNumeroTarjeta;
	private JTextField textFieldNumeroTarjeta;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private ProcesaFiltrosAlojamientos filtro = new ProcesaFiltrosAlojamientos();
	private Alojamiento alojamiento;
	private JTextArea textAreaParqueOferta;
	private List<PanelesDinamicosAlojamientos> panelesDinamicos = new ArrayList<PanelesDinamicosAlojamientos>();
	private JLabel lbNumeroNoches;
	private JComboBox<String> cbNumeroNoches;
	private JLabel lbComentarios;
	private JTextField txComentarios;
	private JPanel pnReservaAmbos;
	private JPanel pnReservaAmbosIzquierda;
	private JPanel pnReservaAmbosCheckBoxes;
	private JCheckBox checkHotelAmbos;
	private JCheckBox checkApartamentoAmbos;
	private JCheckBox checkApartaHotelAmbos;
	private JCheckBox checkEntradasAmbos;
	private JLabel lbNumeroNochesAmbos;
	private JComboBox<String> cbNumeroNochesAmbos;
	private JScrollPane scrollPaneAmbosReserva;
	private JTextArea textAreaAmbosReserva;
	private boolean esReservaAmbos = false;
	private JPanel pnReservaDerecha;
	private JPanel pnBotonReserva;
	private JButton btReservaEntradas;
	private JPanel pnReservaDerechaCentral;
	private JPanel pnReservaDerechaOpciones;
	private JTextArea textAreaOpciones;
	private JPanel pnReservaDerechaEntradas;
	private JLabel lbImgReservaEntradas;
	private JPanel pnReservaDerechaAlojamientos;
	private JScrollPane scrollPaneAlojamientos;
	private JPanel pnContenedorFichas;
	private JPanel pnReservaAmbosDerecha;
	private JPanel pnBotonReservaAmbos;
	private JButton btReservaAmbos;
	private JPanel pnReservaAmbosDerechaCentral;
	private JPanel pnReservaAmbosDerechaOpciones;
	private JTextArea textAreaAmbosOpciones;
	private JPanel pnReservaAmbosEntradasAlojamiento;
	private JScrollPane scrollPaneAmbos;
	private JPanel pnContenedorFichasAmbos;
	private JDateChooser dateChooserEntradas;
	private JDateChooser dateChooserEntradasAmbos;
	private JLabel lbFechaAlojamiento;
	private JLabel lbFechaAlojamientoAmbos;

	private void cargaAyuda() {
		try {
			File fichero = new File("help/Ayuda.hs");
			URL hsURL = fichero.toURI().toURL();

			HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
			HelpBroker hb = helpset.createHelpBroker();

			// activamos la ayuda sobre el boton ayuda del panel norte
			hb.enableHelpOnButton(btAyuda, "intro", helpset);

			// metemos la ayuda al boton de quienes somos
			hb.enableHelpOnButton(btQuienesSomosAyuda, "intro", helpset);

			// activamos F1
			hb.enableHelpKey(this.getContentPane(), "intro", helpset);

		} catch (Exception e) {
			System.out.println("Error ayuda: " + e.getMessage());
		}
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public VentanaPrincipal(Agencia agen) {
		Locale localizacion = Locale.getDefault();
		try {
			textos = ResourceBundle.getBundle("textos", localizacion);
		} catch (Exception e) {
			System.err.println("Idioma del sistema no soportado, cargando español.");
			textos = ResourceBundle.getBundle("textos", new Locale("es"));

		}
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				pnCentro.setFocusable(true);
				pnCentro.requestFocusInWindow();
			}
		});

		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				adaptarImagenesParquesCombo();
				adaptarBotonPaginaPrincipalServicios();
				adaptarPanelNorteImgs();
				adaptarParquesAsociadosImgs();
				adaptarPaginaQuienesSomosImgs();
				adaptarPaginaServiciosImgs();
				adaptarBotonesJuego();
				actualizarPaginaReserva();
			}
		});
		this.agencia = agen;
		setTitle(textos.getString("ventana.titulo"));
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/img/logo1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPnNorte(), BorderLayout.NORTH);
		contentPane.add(getPnCentro(), BorderLayout.CENTER);
		setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(900, 700));
		cargaAyuda();

	}

	protected void adaptarBotonesJuego() {
		if (btJuego0.isEnabled()) {
			adaptarImagenesEnBotones(btJuego0, "/img/casillas.png");
			adaptarImagenesEnBotones(btJuego1, "/img/casillas.png");
			adaptarImagenesEnBotones(btJuego2, "/img/casillas.png");
			adaptarImagenesEnBotones(btJuego3, "/img/casillas.png");
			adaptarImagenesEnBotones(btJuego4, "/img/casillas.png");
		}
	}

	protected void actualizarPaginaReserva() {
		ParqueTematico parque = (ParqueTematico) getCbParques().getSelectedItem();
		adaptarImagenEnLabels(lbImgReservaEntradas, "/img/" + parque.getCodigoParque() + ".png");

	}

	private boolean reservaEntradasSimple() {
		// compruebo que el check entradas esta seleccionado
		return getCheckEntradasSimple().isSelected();
	}

	protected void mostrarParqueReservado() {
		// muestra la foto del parque reservado, en la pestaña de reserva de entradas
		ParqueTematico parque = (ParqueTematico) getCbParques().getSelectedItem();
		adaptarImagenEnLabels(lbReservaSimpleParque, "/img/" + parque.getCodigoParque() + ".png");
	}

	protected void adaptarImagenesParquesCombo() {
		// este metodo muestra las imagenes del combo. se redimensionan gracias al
		// metodo adpatar, y que lo llamamos en el componentResized
		ParqueTematico parque = (ParqueTematico) getCbParques().getSelectedItem();
		adaptarImagenEnLabels(lbImagenesCombo, "/img/" + parque.getCodigoParque() + ".png");
	}

	protected void adaptarBotonPaginaPrincipalServicios() {
		adaptarImagenesEnBotones(btVolverPaginaPrincipal, "/img/logo1.png");
	}

	protected void adaptarPanelNorteImgs() {
		adaptarImagenesEnBotonesPanelNorteLogo(btLogo, "/img/logo1.png");
		adaptarImagenesEnBotonesPanelNorte(btParquesAsociados, "/img/pA.png");
		adaptarImagenesEnBotonesPanelNorte(btServicios, "/img/serviciosWeb.png");
		adaptarImagenesEnBotonesPanelNorte(btQuienesSomos, "/img/quienesSomos.png");
		adaptarImagenesEnBotonesPanelNorte(btAyuda, "/img/ayudaFoto.png");

	}

	private void adaptarImagenesEnBotonesPanelNorteLogo(JButton boton, String rutaImagen) {
		// este metodo adapta la imagen del boton del logo
		if (boton.getWidth() > 0 && boton.getHeight() > 0) {
			Image imgOriginal = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
			Image imgEscalada = imgOriginal.getScaledInstance(200, 180, Image.SCALE_SMOOTH);
			boton.setIcon(new ImageIcon(imgEscalada));

		}
	}

	protected void adaptarParquesAsociadosImgs() {
		adaptarImagenEnLabels(lbParquesAsociadosOeste, "/img/PT004.png");
		adaptarImagenEnLabels(lbParquesAsociadosCentro, "/img/PT006.png");
		adaptarImagenEnLabels(lbParquesAsociadosEste, "/img/PT008.png");

	}

	protected void adaptarPaginaQuienesSomosImgs() {
		adaptarImagenEnLabels(lbQuienesSomosFoto, "/img/fotoTuristica.png");
		adaptarImagenesEnBotones(btQuienesSomosAyuda, "/img/ayuda2.png");

	}

	protected void adaptarPaginaServiciosImgs() {
		adaptarImagenEnLabels(lbImg1, "/img/PT001.png");
		adaptarImagenEnLabels(lbImg2, "/img/PT002.png");
		adaptarImagenEnLabels(lbImg3, "/img/PT003.png");
		adaptarImagenEnLabels(lbImg4, "/img/PT004.png");
		adaptarImagenEnLabels(lbImg5, "/img/PT005.png");
		adaptarImagenEnLabels(lbImg5, "/img/PT005.png");
		adaptarImagenEnLabels(lbImg6, "/img/PT006.png");
		adaptarImagenEnLabels(lbImg7, "/img/PT007.png");
		adaptarImagenEnLabels(lbImg8, "/img/PT008.png");
		adaptarImagenEnLabels(lbImg9, "/img/PT009.png");

	}

	private void adaptarImagenesEnBotonesPanelNorte(JButton boton, String rutaImagen) {
		// este metodo adapta la imagen de los botones del panel norte
		if (boton.getWidth() > 0 && boton.getHeight() > 0) {
			Image imgOriginal = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
			Image imgEscalada = imgOriginal.getScaledInstance(250, 200, Image.SCALE_SMOOTH);
			boton.setIcon(new ImageIcon(imgEscalada));
		}

	}

	private void adaptarImagenesEnBotones(JButton boton, String rutaImagen) {
		// adaptamos las imagenes de los botones de la aplicacion
		if (boton.getWidth() > 0 && boton.getHeight() > 0) {
			Image imgOriginal = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
			Image imgEscalada = imgOriginal.getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH);
			boton.setIcon(new ImageIcon(imgEscalada));
			boton.setDisabledIcon(new ImageIcon(imgEscalada));
		}

	}

	private void adaptarImagenEnLabels(JLabel etiqueta, String rutaImagen) {
		// adaptamaos las imagenes de las labels
		if (etiqueta.getWidth() > 0 && etiqueta.getHeight() > 0) {
			Image imgOriginal = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
			Image imgEscalada = imgOriginal.getScaledInstance(etiqueta.getWidth(), etiqueta.getHeight(),
					Image.SCALE_SMOOTH);
			etiqueta.setIcon(new ImageIcon(imgEscalada));
		}

	}

	// panel norte, donde tenemos los botones que nos dejan movernos a diferentes
	// pestañas de la aplicacion (quines somos, servicios, ayuda...)
	private JPanel getPnNorte() {
		if (pnNorte == null) {
			pnNorte = new JPanel();
			pnNorte.setLayout(new GridLayout(0, 5, 0, 0));
			pnNorte.add(getBtLogo());
			pnNorte.add(getBtParquesAsociados());
			pnNorte.add(getBtServicios());
			pnNorte.add(getBtQuienesSomos());
			pnNorte.add(getBtAyuda());
		}
		return pnNorte;
	}

	// panel que dirige la aplicacion de manera dinamica. tiene todos los paneles y
	// sus alias
	private JPanel getPnCentro() {
		if (pnCentro == null) {
			pnCentro = new JPanel();
			pnCentro.setLayout(new CardLayout(0, 0));
			pnCentro.add(getPnInicio(), "inicio");
			pnCentro.add(getPnServicios(), "servicios");
			pnCentro.add(getPnParquesAsociados(), "parques asociados");
			pnCentro.add(getPnQuienesSomos(), "quienes somos");
			pnCentro.add(getPnReservaEntradasSimple(), "reserva entradas");
			pnCentro.add(getPnPago(), "pago");
			pnCentro.add(getPnFinalizarReserva(), "finalizar");
			pnCentro.add(getPnMiniJuego(), "minijuego");
			pnCentro.add(getPnReservaAmbos(), "ambos");
		}
		return pnCentro;
	}

	private JButton getBtParquesAsociados() {
		if (btParquesAsociados == null) {
			btParquesAsociados = new JButton(textos.getString("btn.parques"));
			btParquesAsociados.setMnemonic(textos.getString("btn.parques.nemo").charAt(0));
			btParquesAsociados.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			btParquesAsociados.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarParquesAsociados();
				}
			});
			btParquesAsociados.setVerticalTextPosition(SwingConstants.BOTTOM);
			btParquesAsociados.setHorizontalTextPosition(SwingConstants.CENTER);
			btParquesAsociados.setFocusable(false);
		}
		return btParquesAsociados;
	}

	protected void mostrarParquesAsociados() {
		((CardLayout) getPnCentro().getLayout()).show(getPnCentro(), "parques asociados");
	}

	private JButton getBtServicios() {
		if (btServicios == null) {
			btServicios = new JButton(textos.getString("btn.servicios"));
			btServicios.setMnemonic(textos.getString("btn.servicios.nemo").charAt(0));
			btServicios.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			btServicios.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarServiciosWeb();
				}
			});
			btServicios.setVerticalTextPosition(SwingConstants.BOTTOM);
			btServicios.setHorizontalTextPosition(SwingConstants.CENTER);
			btServicios.setFocusable(false);

		}
		return btServicios;
	}

	private JButton getBtQuienesSomos() {
		if (btQuienesSomos == null) {
			btQuienesSomos = new JButton(textos.getString("btn.quienes"));
			btQuienesSomos.setMnemonic(textos.getString("btn.quienes.nemo").charAt(0));
			btQuienesSomos.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			btQuienesSomos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarQuienesSomos();
				}
			});
			btQuienesSomos.setVerticalTextPosition(SwingConstants.BOTTOM);
			btQuienesSomos.setHorizontalTextPosition(SwingConstants.CENTER);
			btQuienesSomos.setFocusable(false);

		}
		return btQuienesSomos;
	}

	protected void mostrarQuienesSomos() {
		((CardLayout) getPnCentro().getLayout()).show(getPnCentro(), "quienes somos");

	}

	private JButton getBtAyuda() {
		if (btAyuda == null) {
			btAyuda = new JButton(textos.getString("btn.ayuda"));
			btAyuda.setMnemonic(textos.getString("btn.ayuda.nemo").charAt(0));
			btAyuda.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			btAyuda.setVerticalTextPosition(SwingConstants.BOTTOM);
			btAyuda.setHorizontalTextPosition(SwingConstants.CENTER);
			btAyuda.setFocusable(false);

		}
		return btAyuda;
	}

	// panel de la pestaña de inicio -> se divide en izquierda(botones de reserva y
	// parque en oferta) y derecha(calendario, spinners...)
	private JPanel getPnInicio() {
		if (pnInicio == null) {
			pnInicio = new JPanel();
			pnInicio.setLayout(new GridLayout(0, 2, 0, 0));
			pnInicio.add(getPnInicioIzquierda());
			pnInicio.add(getPnInicioDerecha());
		}
		return pnInicio;
	}

	private JPanel getPnInicioIzquierda() {
		if (pnInicioIzquierda == null) {
			pnInicioIzquierda = new JPanel();
			pnInicioIzquierda.setLayout(new BorderLayout(20, 0));
			pnInicioIzquierda.setBorder(new EmptyBorder(20, 20, 20, 20));

			// PANEL DE BOTONES (Izquierda)
			JPanel pnBotones = new JPanel();
			pnBotones.setLayout(new GridLayout(3, 1, 0, 20));
			pnBotones.add(getBtReservasSimple());
			pnBotones.add(getBtrReservasGrupos());
			pnBotones.add(getTextAreaParqueOferta());

			pnBotones.setPreferredSize(new Dimension(200, 0));
			pnInicioIzquierda.add(pnBotones, BorderLayout.WEST);

			// PANEL CENTRAL (Combo + Foto)
			JPanel pnComboFotos = new JPanel();
			pnComboFotos.setLayout(new BorderLayout(0, 30));
			pnComboFotos.add(getCbParques(), BorderLayout.NORTH);
			pnComboFotos.add(getLbImagenesCombo(), BorderLayout.CENTER);

			pnInicioIzquierda.add(pnComboFotos, BorderLayout.CENTER);
		}
		return pnInicioIzquierda;
	}

	// boton que permite reservar entradas o alojamientos
	private JButton getBtReservasSimple() {
		if (btReservasSimple == null) {
			btReservasSimple = new JButton(textos.getString("btn.reserva.entradas"));
			btReservasSimple.setMnemonic(textos.getString("btn.reservas.nemo").charAt(0));
			btReservasSimple.setEnabled(false);
			btReservasSimple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					reservaDeEntradas();

				}

			});
			btReservasSimple.setFont(new Font("Segoe UI", Font.PLAIN, 13));
			btReservasSimple.setFocusable(false);

		}
		return btReservasSimple;
	}

	private void reservaDeEntradas() {
		// decimos que la reserva es solo de entradas(esReservaAmbos=false), mostramos
		// la pagina de reserva de entradas y la actualizamos. todo esto cada vez que
		// toquemos el boton.
		esReservaAmbos = false;
		mostrarPaginaReservasSimple();
		actualizarPaginaReserva();
	}

	/**
	 * Método que nos permite habilitar los botones de reserva
	 * 
	 * si no hay al menos 1 adulto y 1 dia -> no dejamos reservar
	 */
	protected void habilitarReservaEntradas() {
		int adultos = (int) spAdultos.getValue();
		int dias = (int) spDias.getValue();
		if (agencia.puedoReservar(adultos, dias)) {
			btReservasSimple.setEnabled(true);
			btrReservasGrupos.setEnabled(true);

		} else {
			btReservasSimple.setEnabled(false);
			btrReservasGrupos.setEnabled(false);
		}

	}

	private void mostrarPaginaReservasSimple() {
		((CardLayout) getPnCentro().getLayout()).show(getPnCentro(), "reserva entradas");

	}

	// aqui tenemos el combo de parques
	private JComboBox<ParqueTematico> getCbParques() {
		if (cbParques == null) {
			cbParques = new JComboBox<ParqueTematico>();
			cbParques.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
			cbParques.setFocusable(false);
			cbParques.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					adaptarImagenesParquesCombo();

				}
			});
			// le metemos la lista de parques ordenada.
			cbParques.setModel(new DefaultComboBoxModel<ParqueTematico>(agencia.getParquesDisponiblesCombo()));

		}
		return cbParques;
	}

	// estas son las imagenes del combo de parques
	private JLabel getLbImagenesCombo() {
		if (lbImagenesCombo == null) {
			lbImagenesCombo = new JLabel("");
			lbImagenesCombo.setFocusable(false);
			lbImagenesCombo.setPreferredSize(new Dimension(350, 250));

		}
		return lbImagenesCombo;
	}

	// panel de la derecha, que contendra spinners y calendario...
	private JPanel getPnInicioDerecha() {
		if (pnInicioDerecha == null) {
			pnInicioDerecha = new JPanel();
			pnInicioDerecha.setLayout(new BorderLayout(0, 10));
			pnInicioDerecha.setBorder(new EmptyBorder(20, 20, 20, 20));

			JPanel pnSpinners = new JPanel(new GridLayout(1, 3, 20, 0));

			JPanel pnAdultos = new JPanel(new BorderLayout(10, 0));
			pnAdultos.add(getLbAdultos(), BorderLayout.WEST);
			pnAdultos.add(getSpAdultos(), BorderLayout.CENTER);
			pnSpinners.add(pnAdultos);

			JPanel pnNinos = new JPanel(new BorderLayout(10, 0));
			pnNinos.add(getLbNinos(), BorderLayout.WEST);
			pnNinos.add(getSpNinos(), BorderLayout.CENTER);
			pnSpinners.add(pnNinos);

			JPanel pnDias = new JPanel(new BorderLayout(10, 0));
			pnDias.add(getLbDias(), BorderLayout.WEST);
			pnDias.add(getSpDias(), BorderLayout.CENTER);
			pnSpinners.add(pnDias);

			pnInicioDerecha.add(pnSpinners, BorderLayout.NORTH);

			pnInicioDerecha.add(getCalendar(), BorderLayout.CENTER);

			JPanel pnIdiomas = new JPanel(new FlowLayout(FlowLayout.RIGHT));
			getBtEs().setPreferredSize(new Dimension(55, 30));
			getBtEN().setPreferredSize(new Dimension(55, 30));
			pnIdiomas.add(getBtEs());
			pnIdiomas.add(getBtEN());
			pnInicioDerecha.add(pnIdiomas, BorderLayout.SOUTH);
		}
		return pnInicioDerecha;
	}

	private JLabel getLbDias() {
		if (lbDias == null) {
			lbDias = new JLabel(textos.getString("lbl.dias"));
			lbDias.setFont(new Font("Segoe UI", Font.BOLD, 14));
		}
		return lbDias;
	}

	// spinner de dias
	private JSpinner getSpDias() {
		if (spDias == null) {
			spDias = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
			spDias.setFocusTraversalKeysEnabled(false);
			spDias.setFont(new Font("Segoe UI", Font.PLAIN, 15));
			spDias.setFocusable(false);
			((JSpinner.DefaultEditor) spDias.getEditor()).getTextField().setEditable(false);
			spDias.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					habilitarReservaEntradas();
				}
			});
		}
		return spDias;
	}

	private JLabel getLbAdultos() {
		if (lbAdultos == null) {
			lbAdultos = new JLabel(textos.getString("lbl.adultos"));
			lbAdultos.setFont(new Font("Segoe UI", Font.BOLD, 14));
		}
		return lbAdultos;
	}

	// spinner de los adultos
	private JSpinner getSpAdultos() {
		if (spAdultos == null) {
			spAdultos = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
			spAdultos.setFocusTraversalKeysEnabled(false);
			spAdultos.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					habilitarReservaEntradas();
				}
			});
			spAdultos.setFocusable(false);
			spAdultos.setFont(new Font("Segoe UI", Font.PLAIN, 15));
			((JSpinner.DefaultEditor) spAdultos.getEditor()).getTextField().setEditable(false);

		}
		return spAdultos;
	}

	private JLabel getLbNinos() {
		if (lbNinos == null) {
			lbNinos = new JLabel(textos.getString("lbl.ninos"));
			lbNinos.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		}
		return lbNinos;
	}

	// spinner de los niños
	private JSpinner getSpNinos() {
		if (spNinos == null) {
			spNinos = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
			spNinos.setFocusTraversalKeysEnabled(false);
			spNinos.setFocusable(false);
			spNinos.setFont(new Font("Segoe UI", Font.PLAIN, 15));
			((JSpinner.DefaultEditor) spNinos.getEditor()).getTextField().setEditable(false);
		}
		return spNinos;
	}

	// calendario
	private JCalendar getCalendar() {
		if (calendar == null) {
			calendar = new JCalendar();
			calendar.getYearChooser().getSpinner().setFont(new Font("Segoe UI", Font.PLAIN, 14));
			calendar.getMonthChooser().getComboBox().setFont(new Font("Segoe UI", Font.PLAIN, 14));
			calendar.setFont(new Font("Arial", Font.PLAIN, 16));
			fechaValida();
			fechaNoEditable();
		}
		return calendar;
	}

	private void fechaNoEditable() {
		JSpinner spinnerAno = (JSpinner) calendar.getYearChooser().getSpinner();
		JComponent editor = spinnerAno.getEditor();
		// Comprobamos qué tipo de editor es antes de tocarlo
		if (editor instanceof JSpinner.DefaultEditor) {
			((JSpinner.DefaultEditor) editor).getTextField().setEditable(false);
		} else if (editor instanceof JTextField) {
			((JTextField) editor).setEditable(false);
		}

	}

	// con este metodo bloquemaos las fechas anteriories al dia de hoy
	private void fechaValida() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);

		Date hoy = cal.getTime();
		calendar.setMinSelectableDate(hoy);
	}

	// boton que nos deja reservar entradas Y alojamientos
	private JButton getBtrReservasGrupos() {
		if (btrReservasGrupos == null) {
			btrReservasGrupos = new JButton(textos.getString("btn.reserva.pack"));
			btrReservasGrupos.setMnemonic(textos.getString("btn.reserva.ambos.nemo").charAt(0));
			btrReservasGrupos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					esReservaAmbos = true;
					actualizarPaginaReservaAmbos();
					mostrarPaginaReservaAmbos();
				}
			});
			btrReservasGrupos.setEnabled(false);
			btrReservasGrupos.setFont(new Font("Segoe UI", Font.PLAIN, 13));
			btrReservasGrupos.setFocusable(false);

		}
		return btrReservasGrupos;
	}

	private void actualizarPaginaReservaAmbos() {
		// simplemente modificamos el text area de la pagina que te dice el parque que
		// has seleccionado y te obliga a seleccionar alojamiento
		ParqueTematico parque = (ParqueTematico) getCbParques().getSelectedItem();
		String msg = MessageFormat.format(textos.getString("msg.instruccion.ambos"), parque.getDenominacion());
		getTextAreaAmbosReserva().setText(msg);

	}

	private void mostrarPaginaReservaAmbos() {
		((CardLayout) getPnCentro().getLayout()).show(getPnCentro(), "ambos");
	}

	private JPanel getPnServicios() {
		if (pnServicios == null) {
			pnServicios = new JPanel();
			pnServicios.setLayout(new GridLayout(0, 2, 0, 0));
			pnServicios.add(getPnServiciosOfrecidos());
			pnServicios.add(getPnServiciosImagenes());
		}
		return pnServicios;
	}

	private JPanel getPnParquesAsociados() {
		if (pnParquesAsociados == null) {
			pnParquesAsociados = new JPanel();
			pnParquesAsociados.setLayout(new BorderLayout(0, 0));
			pnParquesAsociados.add(getPnParquesAsociadosNorte(), BorderLayout.NORTH);
			pnParquesAsociados.add(getPnParquesAsociadosCentro(), BorderLayout.CENTER);
			pnParquesAsociados.add(getPnParquesAsociadosSur(), BorderLayout.SOUTH);
		}
		return pnParquesAsociados;
	}

	private JButton getBtLogo() {
		if (btLogo == null) {
			btLogo = new JButton(textos.getString("btn.inicio"));

			btLogo.setMnemonic(textos.getString("btn.inicio.nemo").charAt(0));
			btLogo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			btLogo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarInicio();
					resetearPaginaReservasSimple();
					resetearPaginaReservasAmbos();
					resetearPaginaPago();
				}
			});
			btLogo.setVerticalTextPosition(SwingConstants.BOTTOM);
			btLogo.setHorizontalTextPosition(SwingConstants.CENTER);
			btLogo.setFocusable(false);
		}
		return btLogo;
	}

	protected void resetearPaginaReservasAmbos() {
		resetearCheckBoxesAmbos();
		resetearPanelOfertasAmbos();
		resetearFechaAlojamientos();
		resetearBotonReservaAmbos();

	}

	private void resetearBotonReservaAmbos() {
		getBtReservaAmbos().setEnabled(false);

	}

	private void resetearPanelOfertasAmbos() {
		// Resetear el panel derecho de reservas para que muestre las opciones iniciales
		((CardLayout) getPnReservaAmbosDerechaCentral().getLayout()).show(getPnReservaAmbosDerechaCentral(),
				"opciones ambos");

	}

	private void resetearCheckBoxesAmbos() {
		checkExclusivoAmbos.clearSelection(); // reseteamos los checks de alojamientos
		getCheckEntradasAmbos().setSelected(true); // volvemos a seleccionar las entradas

		getCbNumeroNochesAmbos().setSelectedIndex(0);
		getCbNumeroNochesAmbos().setEnabled(false);

	}

	protected void resetearCheckBoxes() {
		checkExclusivo.clearSelection(); // Limpia los radio buttons/checks del grupo
		getCbNumeroNoches().setSelectedIndex(0);
		getCbNumeroNoches().setEnabled(false);

	}

	protected void mostrarInicio() {
		((CardLayout) getPnCentro().getLayout()).show(getPnCentro(), "inicio");

	}

	private JPanel getPnServiciosOfrecidos() {
		if (pnServiciosOfrecidos == null) {
			pnServiciosOfrecidos = new JPanel();
			pnServiciosOfrecidos.setLayout(new GridLayout(0, 1, 0, 0));
			pnServiciosOfrecidos.add(getScrollServicios());
		}
		return pnServiciosOfrecidos;
	}

	private JPanel getPnServiciosImagenes() {
		if (pnServiciosImagenes == null) {
			pnServiciosImagenes = new JPanel();
			pnServiciosImagenes.setLayout(new GridLayout(2, 2, 0, 0));
			pnServiciosImagenes.add(getPnServiciosImagenesArriba());
			pnServiciosImagenes.add(getPnServiciosImagenesAbajo());
		}
		return pnServiciosImagenes;
	}

	private JScrollPane getScrollServicios() {
		if (scrollServicios == null) {
			scrollServicios = new JScrollPane();
			scrollServicios.setViewportView(getTextAreaServicios());
		}
		return scrollServicios;
	}

	private JTextArea getTextAreaServicios() {
		if (textAreaServicios == null) {
			textAreaServicios = new JTextArea();
			textAreaServicios.setFont(new Font("Segoe UI", Font.PLAIN, 25));
			textAreaServicios.setEditable(false);
			textAreaServicios.setFocusable(false);
			textAreaServicios.setWrapStyleWord(true);
			textAreaServicios.setLineWrap(true);
			textAreaServicios.setText(textos.getString("msg.servicios"));
		}
		return textAreaServicios;
	}

	// este panel contiene las fotos de los parques mostrados con label1 label2...
	private JPanel getPnServiciosImagenesArriba() {
		if (pnServiciosImagenesArriba == null) {
			pnServiciosImagenesArriba = new JPanel();
			pnServiciosImagenesArriba.setLayout(new GridLayout(0, 5, 0, 0));
			pnServiciosImagenesArriba.add(getLabel1());
			pnServiciosImagenesArriba.add(getLabel2());
			pnServiciosImagenesArriba.add(getLabel3());
			pnServiciosImagenesArriba.add(getLabel4());
			pnServiciosImagenesArriba.add(getLabel5());
		}
		return pnServiciosImagenesArriba;
	}

	// aqui tenemos las labels que muestran las fotos de los parques que hay
	private JLabel getLabel1() {
		if (lbImg1 == null) {
			lbImg1 = new JLabel("");

		}
		return lbImg1;
	}

	private JLabel getLabel2() {
		if (lbImg2 == null) {
			lbImg2 = new JLabel("");
		}
		return lbImg2;
	}

	private JLabel getLabel3() {
		if (lbImg3 == null) {
			lbImg3 = new JLabel("");
		}
		return lbImg3;
	}

	private JLabel getLabel4() {
		if (lbImg4 == null) {
			lbImg4 = new JLabel("");
		}
		return lbImg4;
	}

	private JLabel getLabel5() {
		if (lbImg5 == null) {
			lbImg5 = new JLabel("");
		}
		return lbImg5;
	}

	private JPanel getPnServiciosImagenesAbajo() {
		if (pnServiciosImagenesAbajo == null) {
			pnServiciosImagenesAbajo = new JPanel();
			pnServiciosImagenesAbajo.setLayout(new GridLayout(0, 5, 0, 0));
			pnServiciosImagenesAbajo.add(getLbImg6());
			pnServiciosImagenesAbajo.add(getLbImg7());
			pnServiciosImagenesAbajo.add(getLbImg8());
			pnServiciosImagenesAbajo.add(getLbImg9());
			pnServiciosImagenesAbajo.add(getBtVolverPaginaPrincipal());
		}
		return pnServiciosImagenesAbajo;
	}

	private JLabel getLbImg6() {
		if (lbImg6 == null) {
			lbImg6 = new JLabel("");
		}
		return lbImg6;
	}

	private JLabel getLbImg7() {
		if (lbImg7 == null) {
			lbImg7 = new JLabel("");
		}
		return lbImg7;
	}

	private JLabel getLbImg8() {
		if (lbImg8 == null) {
			lbImg8 = new JLabel("");
		}
		return lbImg8;
	}

	private JLabel getLbImg9() {
		if (lbImg9 == null) {
			lbImg9 = new JLabel("");
		}
		return lbImg9;
	}

	private JButton getBtVolverPaginaPrincipal() {
		if (btVolverPaginaPrincipal == null) {
			btVolverPaginaPrincipal = new JButton("");
			btVolverPaginaPrincipal.setFocusable(false);
			btVolverPaginaPrincipal.setToolTipText(textos.getString("msg.tooltip.inicio"));
			btVolverPaginaPrincipal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarInicio();

				}
			});
			btVolverPaginaPrincipal.setFont(new Font("Source Serif Pro Light", Font.PLAIN, 15));
		}
		return btVolverPaginaPrincipal;
	}

	private JPanel getPnQuienesSomos() {
		if (pnQuienesSomos == null) {
			pnQuienesSomos = new JPanel();
			pnQuienesSomos.setLayout(new GridLayout(0, 2, 0, 0));
			pnQuienesSomos.add(getPnQuienesSomosFoto());
			pnQuienesSomos.add(getScrollPaneQuienesSomos());
		}
		return pnQuienesSomos;
	}

	private JPanel getPnQuienesSomosFoto() {
		if (pnQuienesSomosFoto == null) {
			pnQuienesSomosFoto = new JPanel();
			pnQuienesSomosFoto.setLayout(new GridLayout(2, 0, 0, 0));
			pnQuienesSomosFoto.add(getLbQuienesSomosFoto());
			pnQuienesSomosFoto.add(getBtQuienesSomosAyuda());
		}
		return pnQuienesSomosFoto;
	}

	private JLabel getLbQuienesSomosFoto() {
		if (lbQuienesSomosFoto == null) {
			lbQuienesSomosFoto = new JLabel("");
		}
		return lbQuienesSomosFoto;
	}

	private JButton getBtQuienesSomosAyuda() {
		if (btQuienesSomosAyuda == null) {
			btQuienesSomosAyuda = new JButton("");
			btQuienesSomosAyuda.setFocusable(false);
			btQuienesSomosAyuda.setToolTipText(textos.getString("msg.tooltip.ayuda"));
		}
		return btQuienesSomosAyuda;
	}

	private JScrollPane getScrollPaneQuienesSomos() {
		if (scrollQuienesSomos == null) {
			scrollQuienesSomos = new JScrollPane();
			scrollQuienesSomos.setViewportView(getTextAreaQuienesSomos());
		}
		return scrollQuienesSomos;
	}

	private JTextArea getTextAreaQuienesSomos() {
		if (textAreaQuienesSomos == null) {
			textAreaQuienesSomos = new JTextArea();
			textAreaQuienesSomos.setFont(new Font("Segoe UI", Font.PLAIN, 25));
			textAreaQuienesSomos.setWrapStyleWord(true);
			textAreaQuienesSomos.setLineWrap(true);
			textAreaQuienesSomos.setFocusable(false);
			textAreaQuienesSomos.setEditable(false);
			textAreaQuienesSomos.setText(textos.getString("msg.quienes.explicacion"));
		}
		return textAreaQuienesSomos;
	}

	private JPanel getPnParquesAsociadosNorte() {
		if (pnParquesAsociadosNorte == null) {
			pnParquesAsociadosNorte = new JPanel();
			pnParquesAsociadosNorte.add(getLbPreguntaParquesAsociados());
		}
		return pnParquesAsociadosNorte;
	}

	private JLabel getLbPreguntaParquesAsociados() {
		if (lbPreguntaParquesAsociados == null) {
			lbPreguntaParquesAsociados = new JLabel(textos.getString("lbl.titulo.asociados"));
			lbPreguntaParquesAsociados.setFont(new Font("Segoe UI", Font.BOLD, 30));
		}
		return lbPreguntaParquesAsociados;
	}

	private JPanel getPnParquesAsociadosCentro() {
		if (pnParquesAsociadosCentro == null) {
			pnParquesAsociadosCentro = new JPanel();
			pnParquesAsociadosCentro.setLayout(new GridLayout(0, 3, 0, 0));
			pnParquesAsociadosCentro.add(getPnParquesAsociadosCentroOeste());
			pnParquesAsociadosCentro.add(getPnParquesAsociadosCentroCentro());
			pnParquesAsociadosCentro.add(getPnParquesAsociadosCentroEste());
		}
		return pnParquesAsociadosCentro;
	}

	private JPanel getPnParquesAsociadosCentroOeste() {
		if (pnParquesAsociadosCentroOeste == null) {
			pnParquesAsociadosCentroOeste = new JPanel();
			pnParquesAsociadosCentroOeste.setLayout(new GridLayout(2, 0, 0, 0));
			pnParquesAsociadosCentroOeste.add(getLbParquesAsociadosOeste());
			pnParquesAsociadosCentroOeste.add(getBtParquesAsociadosOeste());
		}
		return pnParquesAsociadosCentroOeste;
	}

	private JPanel getPnParquesAsociadosCentroCentro() {
		if (pnParquesAsociadosCentroCentro == null) {
			pnParquesAsociadosCentroCentro = new JPanel();
			pnParquesAsociadosCentroCentro.setLayout(new GridLayout(2, 0, 0, 0));
			pnParquesAsociadosCentroCentro.add(getLbParquesAsociadosCentro());
			pnParquesAsociadosCentroCentro.add(getBtParquesAsociadosCentro());
		}
		return pnParquesAsociadosCentroCentro;
	}

	private JPanel getPnParquesAsociadosCentroEste() {
		if (pnParquesAsociadosCentroEste == null) {
			pnParquesAsociadosCentroEste = new JPanel();
			pnParquesAsociadosCentroEste.setLayout(new GridLayout(2, 0, 0, 0));
			pnParquesAsociadosCentroEste.add(getLbParquesAsociadosEste());
			pnParquesAsociadosCentroEste.add(getBtParquesAsociadosEste());
		}
		return pnParquesAsociadosCentroEste;
	}

	private JLabel getLbParquesAsociadosOeste() {
		if (lbParquesAsociadosOeste == null) {
			lbParquesAsociadosOeste = new JLabel("");
		}
		return lbParquesAsociadosOeste;
	}

	private JLabel getLbParquesAsociadosCentro() {
		if (lbParquesAsociadosCentro == null) {
			lbParquesAsociadosCentro = new JLabel("");
		}
		return lbParquesAsociadosCentro;
	}

	private JLabel getLbParquesAsociadosEste() {
		if (lbParquesAsociadosEste == null) {
			lbParquesAsociadosEste = new JLabel("");
		}
		return lbParquesAsociadosEste;
	}

	private JButton getBtParquesAsociadosOeste() {
		if (btParquesAsociadosOeste == null) {
			btParquesAsociadosOeste = new JButton(textos.getString("btn.info.parque"));
			btParquesAsociadosOeste.setMnemonic(textos.getString("btn.info.parque.nemo1").charAt(0));
			btParquesAsociadosOeste.setFocusable(false);
			btParquesAsociadosOeste.setBackground(new Color(128, 128, 192));
			btParquesAsociadosOeste.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarInformacionOeste();
				}
			});
			btParquesAsociadosOeste.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		}
		return btParquesAsociadosOeste;
	}

	protected void mostrarInformacionOeste() {
		JOptionPane.showMessageDialog(null, textos.getString("msg.info.oeste"));

	}

	private JButton getBtParquesAsociadosCentro() {
		if (btParquesAsociadosCentro == null) {
			btParquesAsociadosCentro = new JButton(textos.getString("btn.info.parque"));
			btParquesAsociadosCentro.setMnemonic(textos.getString("btn.info.parque.nemo2").charAt(0));
			btParquesAsociadosCentro.setFocusable(false);
			btParquesAsociadosCentro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarInformacionCentro();
				}
			});
			btParquesAsociadosCentro.setBackground(new Color(255, 255, 0));
			btParquesAsociadosCentro.setForeground(new Color(0, 0, 0));
			btParquesAsociadosCentro.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		}
		return btParquesAsociadosCentro;
	}

	protected void mostrarInformacionCentro() {
		JOptionPane.showMessageDialog(null, textos.getString("msg.info.centro"));
	}

	private JButton getBtParquesAsociadosEste() {
		if (btParquesAsociadosEste == null) {
			btParquesAsociadosEste = new JButton(textos.getString("btn.info.parque"));
			btParquesAsociadosEste.setMnemonic(textos.getString("btn.info.parque.nemo3").charAt(0));
			btParquesAsociadosEste.setFocusable(false);
			btParquesAsociadosEste.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarInformacionEste();
				}
			});
			btParquesAsociadosEste.setBackground(new Color(255, 128, 64));
			btParquesAsociadosEste.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		}
		return btParquesAsociadosEste;
	}

	protected void mostrarInformacionEste() {
		JOptionPane.showMessageDialog(null, textos.getString("msg.info.este"));

	}

	private JPanel getPnParquesAsociadosSur() {
		if (pnParquesAsociadosSur == null) {
			pnParquesAsociadosSur = new JPanel();
			pnParquesAsociadosSur.add(getBtParquesAsociadosServicios());
		}
		return pnParquesAsociadosSur;
	}

	private JButton getBtParquesAsociadosServicios() {
		if (btParquesAsociadosServicios == null) {
			btParquesAsociadosServicios = new JButton(textos.getString("btn.analizar.servicios"));
			btParquesAsociadosServicios.setMnemonic('D');
			btParquesAsociadosServicios.setFocusable(false);
			btParquesAsociadosServicios.setForeground(new Color(0, 0, 64));
			btParquesAsociadosServicios.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarServiciosWeb();
				}
			});
			btParquesAsociadosServicios.setFont(new Font("Segoe UI", Font.BOLD, 30));
		}
		return btParquesAsociadosServicios;
	}

	protected void mostrarServiciosWeb() {
		((CardLayout) getPnCentro().getLayout()).show(getPnCentro(), "servicios");

	}

	private JPanel getPnReservaEntradasSimple() {
		if (pnReservaEntradasSimple == null) {
			pnReservaEntradasSimple = new JPanel();
			pnReservaEntradasSimple.setLayout(new GridLayout(0, 2, 0, 0));
			pnReservaEntradasSimple.add(getPnReservaSimpleIzquierda());
			pnReservaEntradasSimple.add(getPnReservaDerecha());
		}
		return pnReservaEntradasSimple;
	}

	private JPanel getPnReservaSimpleIzquierda() {
		if (pnReservaSimpleIzquierda == null) {
			pnReservaSimpleIzquierda = new JPanel();
			pnReservaSimpleIzquierda.setLayout(new GridLayout(2, 1, 0, 0));
			pnReservaSimpleIzquierda.add(getPnReservaSimpleCheckBoxes());
			pnReservaSimpleIzquierda.add(getScrollPaneReservaSimple());
		}
		return pnReservaSimpleIzquierda;
	}

	private JPanel getPnReservaSimpleCheckBoxes() {
		if (pnReservaSimpleCheckBoxes == null) {
			pnReservaSimpleCheckBoxes = new JPanel();
			pnReservaSimpleCheckBoxes.setLayout(null);
			pnReservaSimpleCheckBoxes
					.setBorder(new TitledBorder(null, "Filtros", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			pnReservaSimpleCheckBoxes.add(getCheckHotelSimple());
			pnReservaSimpleCheckBoxes.add(getCheckApartamentoSimple());
			pnReservaSimpleCheckBoxes.add(getCheckApartaHotelSimple());
			pnReservaSimpleCheckBoxes.add(getCheckEntradasSimple());
			pnReservaSimpleCheckBoxes.add(getLbNumeroNoches());
			pnReservaSimpleCheckBoxes.add(getCbNumeroNoches());
			lbFechaAlojamiento = new JLabel(textos.getString("lbl.fecha.alojamiento"));
			lbFechaAlojamiento.setFont(new Font("Segoe UI", Font.BOLD, 13));
			lbFechaAlojamiento.setBounds(74, 159, 140, 25);
			pnReservaSimpleCheckBoxes.add(lbFechaAlojamiento);

			pnReservaSimpleCheckBoxes.add(getDateChooserEntradas());
		}
		return pnReservaSimpleCheckBoxes;
	}

	private JCheckBox getCheckHotelSimple() {
		if (checkHotelSimple == null) {
			checkHotelSimple = new JCheckBox(textos.getString("lbl.hotel"));
			checkHotelSimple.setMnemonic(textos.getString("lbl.hotel.nemo").charAt(0));
			checkHotelSimple.setActionCommand("HO");
			checkExclusivo.add(checkHotelSimple);
			checkHotelSimple.addActionListener(filtro);
			checkHotelSimple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tipoReserva();
					habilitarFechaAlojamientos();

				}
			});
			checkHotelSimple.setBorder(new TitledBorder(

					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),

					"Filtros", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			checkHotelSimple.setBounds(20, 30, 120, 25);
		}
		return checkHotelSimple;
	}

	private JCheckBox getCheckApartamentoSimple() {
		if (checkApartamentoSimple == null) {
			checkApartamentoSimple = new JCheckBox(textos.getString("lbl.apartamento"));
			checkApartamentoSimple.setMnemonic(textos.getString("lbl.apartamento.nemo").charAt(0));
			checkApartamentoSimple.setActionCommand("AP");
			checkExclusivo.add(checkApartamentoSimple);
			checkApartamentoSimple.addActionListener(filtro);
			checkApartamentoSimple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tipoReserva();
					habilitarFechaAlojamientos();

				}
			});
			checkApartamentoSimple.setBorder(new TitledBorder(

					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),

					"Filtros", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			checkApartamentoSimple.setBounds(20, 60, 120, 25);
		}
		return checkApartamentoSimple;
	}

	private JCheckBox getCheckApartaHotelSimple() {
		if (checkApartaHotelSimple == null) {
			checkApartaHotelSimple = new JCheckBox(textos.getString("lbl.apartahotel"));
			checkApartaHotelSimple.setActionCommand("AH");
			checkApartaHotelSimple.setMnemonic(textos.getString("lbl.apartahotel.nemo").charAt(0));
			checkExclusivo.add(checkApartaHotelSimple);
			checkApartaHotelSimple.addActionListener(filtro);
			checkApartaHotelSimple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tipoReserva();
					habilitarFechaAlojamientos();

				}
			});
			checkApartaHotelSimple.setBorder(new TitledBorder(

					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),

					"Filtros", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			checkApartaHotelSimple.setBounds(20, 90, 120, 25);
		}
		return checkApartaHotelSimple;
	}

	private JCheckBox getCheckEntradasSimple() {
		if (checkEntradasSimple == null) {
			checkEntradasSimple = new JCheckBox(textos.getString("lbl.entradas"));
			checkEntradasSimple.setMnemonic(textos.getString("lbl.entradas.nemo").charAt(0));
			checkExclusivo.add(checkEntradasSimple);
			checkEntradasSimple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tipoReserva();
					habilitarBotonReservaEntradasSolo();
					habilitarFechaAlojamientos();

				}
			});
			checkEntradasSimple.setFont(new Font("Tahoma", Font.PLAIN, 11));
			checkEntradasSimple.setBorder(new TitledBorder(

					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),

					"Filtros", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			checkEntradasSimple.setBounds(20, 120, 120, 25);
		}
		return checkEntradasSimple;
	}

	protected void tipoReserva() {
		// habilitamos el combo de numero de noches si y solo si hay alojamiento
		// seleccionado
		cbNumeroNoches.setEnabled(reservaAlojamientosSimple());

		ParqueTematico parque = (ParqueTematico) getCbParques().getSelectedItem();
		if (reservaEntradasSimple()) { // si el checkBox de entradas esta seleccionado, mostramos entradas(parques)
			mostrarSoloParques();
			String msg = MessageFormat.format(textos.getString("msg.instruccion.solo.parque"),
					parque.getDenominacion());
			textAreaReservaSimple.setText(msg);
		} else if (reservaAlojamientosSimple()) { // si algun check de alojamientos esta seleccionado, mostramos
													// alojamientos
			mostrarSoloAlojamientos();
			textAreaReservaSimple.setText(textos.getString("msg.instruccion.solo.alojamiento"));
		} else {
			textAreaReservaSimple.setText("");
		}

	}

	/**
	 * Método que inidca si se reserva alojamiento, es decir, si algun checkBox de
	 * alojamiento esta seleccionado
	 * 
	 * @return true en caso afirmativo.
	 */
	private boolean reservaAlojamientosSimple() {
		return getCheckHotelSimple().isSelected() || getCheckApartamentoSimple().isSelected()
				|| getCheckApartaHotelSimple().isSelected();
	}

	private void mostrarSoloAlojamientos() {
		((CardLayout) getPnReservaDerechaCentral().getLayout()).show(getPnReservaDerechaCentral(), "alojamientos");

	}

	private void mostrarSoloParques() {
		((CardLayout) getPnReservaDerechaCentral().getLayout()).show(getPnReservaDerechaCentral(), "entradas");

	}

	@SuppressWarnings("unused")
	private JPanel getPnReservaSimpleDerechaParque() {
		if (pnReservaSimpleDerechaParque == null) {
			pnReservaSimpleDerechaParque = new JPanel();
			pnReservaSimpleDerechaParque.setLayout(new GridLayout(0, 1, 0, 0));
			pnReservaSimpleDerechaParque.add(getLbReservaSimpleParque());
		}
		return pnReservaSimpleDerechaParque;
	}

	protected void mostrarPaginaPago() {
		((CardLayout) getPnCentro().getLayout()).show(getPnCentro(), "pago");
		if (reservaEntradasSimple()) { // si se reserva parque, mostramos cual y los dias
			String msg = MessageFormat.format(textos.getString("msg.resumen.pago"),
					((ParqueTematico) cbParques.getSelectedItem()).getDenominacion(), spDias.getValue());
			txPagoResumen.setText(msg);
		} else { // sino mostramos que alojamiento es:
			resumenSoloAlojamientos();
		}

	}

	private JLabel getLbReservaSimpleParque() {
		if (lbReservaSimpleParque == null) {
			lbReservaSimpleParque = new JLabel("");
		}
		return lbReservaSimpleParque;
	}

	private JScrollPane getScrollPaneReservaSimple() {
		if (scrollPaneReservaSimple == null) {
			scrollPaneReservaSimple = new JScrollPane();
			scrollPaneReservaSimple.setViewportView(getTextAreaReservaSimple());
		}
		return scrollPaneReservaSimple;
	}

	private JTextArea getTextAreaReservaSimple() {
		if (textAreaReservaSimple == null) {
			textAreaReservaSimple = new JTextArea();
			textAreaReservaSimple.setFont(new Font("Segoe UI", Font.PLAIN, 18));
			textAreaReservaSimple.setFocusable(false);
			textAreaReservaSimple.setLineWrap(true);
			textAreaReservaSimple.setWrapStyleWord(true);
			textAreaReservaSimple.setEditable(false);

		}

		return textAreaReservaSimple;
	}

	// panel que contiene los campos de pago
	private JPanel getPnPago() {
		if (pnPago == null) {
			pnPago = new JPanel();
			pnPago.setLayout(new BorderLayout(0, 0));
			pnPago.add(getPnPagoResumen(), BorderLayout.NORTH);
			pnPago.add(getPnPagoCamposTexto(), BorderLayout.CENTER);
		}
		return pnPago;
	}

	private JPanel getPnPagoResumen() {
		if (pnPagoResumen == null) {
			pnPagoResumen = new JPanel();
			pnPagoResumen.setLayout(new GridLayout(0, 1, 0, 0));
			pnPagoResumen.add(getTxPagoResumen());
		}
		return pnPagoResumen;
	}

	private JTextField getTxPagoResumen() {
		if (txPagoResumen == null) {
			txPagoResumen = new JTextField();
			txPagoResumen.setFocusable(false);
			txPagoResumen.setEditable(false);
			txPagoResumen.setFont(new Font("Segoe UI", Font.PLAIN, 20));
			txPagoResumen.setColumns(10);

		}
		return txPagoResumen;
	}

	private JPanel getPnPagoCamposTexto() {
		if (pnPagoCamposTexto == null) {
			pnPagoCamposTexto = new JPanel();
			GridBagLayout gbl_pnPagoCamposTexto = new GridBagLayout();
			gbl_pnPagoCamposTexto.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0 };
			gbl_pnPagoCamposTexto.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0 };
			pnPagoCamposTexto.setLayout(gbl_pnPagoCamposTexto);

			Font fuenteLabels = new Font("Segoe UI", Font.BOLD, 16);
			Font fuenteCampos = new Font("Segoe UI", Font.PLAIN, 16);
			Dimension alturaCampo = new Dimension(0, 45);

			GridBagConstraints gbc_lbNombre = new GridBagConstraints();
			gbc_lbNombre.anchor = GridBagConstraints.WEST;
			gbc_lbNombre.insets = new Insets(15, 15, 5, 5);
			gbc_lbNombre.gridx = 0;
			gbc_lbNombre.gridy = 0;
			getLbNombreTitular().setFont(fuenteLabels);
			pnPagoCamposTexto.add(getLbNombreTitular(), gbc_lbNombre);

			GridBagConstraints gbc_txNombre = new GridBagConstraints();
			gbc_txNombre.fill = GridBagConstraints.HORIZONTAL;
			gbc_txNombre.gridwidth = 3;
			gbc_txNombre.weightx = 1.0;
			gbc_txNombre.insets = new Insets(15, 5, 5, 15);
			gbc_txNombre.gridx = 1;
			gbc_txNombre.gridy = 0;
			getTxNombreTitular().setFont(fuenteCampos);
			getTxNombreTitular().setPreferredSize(alturaCampo);
			pnPagoCamposTexto.add(getTxNombreTitular(), gbc_txNombre);

			GridBagConstraints gbc_lbDni = new GridBagConstraints();
			gbc_lbDni.anchor = GridBagConstraints.WEST;
			gbc_lbDni.insets = new Insets(15, 15, 5, 5);
			gbc_lbDni.gridx = 0;
			gbc_lbDni.gridy = 1;
			getLbDocumentoIdentificativo().setFont(fuenteLabels);
			pnPagoCamposTexto.add(getLbDocumentoIdentificativo(), gbc_lbDni);

			GridBagConstraints gbc_txDni = new GridBagConstraints();
			gbc_txDni.fill = GridBagConstraints.HORIZONTAL;
			gbc_txDni.gridwidth = 3;
			gbc_txDni.weightx = 1.0;
			gbc_txDni.insets = new Insets(15, 5, 5, 15);
			gbc_txDni.gridx = 1;
			gbc_txDni.gridy = 1;
			getTxDocumentoIdentificativo().setFont(fuenteCampos);
			getTxDocumentoIdentificativo().setPreferredSize(alturaCampo);
			pnPagoCamposTexto.add(getTxDocumentoIdentificativo(), gbc_txDni);

			GridBagConstraints gbc_lbCard = new GridBagConstraints();
			gbc_lbCard.anchor = GridBagConstraints.WEST;
			gbc_lbCard.insets = new Insets(15, 15, 5, 5);
			gbc_lbCard.gridx = 0;
			gbc_lbCard.gridy = 2;
			getLbNumeroTarjeta().setFont(fuenteLabels);
			pnPagoCamposTexto.add(getLbNumeroTarjeta(), gbc_lbCard);

			GridBagConstraints gbc_textFieldNumeroTarjeta = new GridBagConstraints();
			gbc_textFieldNumeroTarjeta.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldNumeroTarjeta.gridwidth = 3;
			gbc_textFieldNumeroTarjeta.weightx = 1.0;
			gbc_textFieldNumeroTarjeta.insets = new Insets(15, 5, 5, 15);
			gbc_textFieldNumeroTarjeta.gridx = 1;
			gbc_textFieldNumeroTarjeta.gridy = 2;
			getTextFieldNumeroTarjeta().setFont(fuenteCampos);
			getTextFieldNumeroTarjeta().setPreferredSize(alturaCampo);
			pnPagoCamposTexto.add(getTextFieldNumeroTarjeta(), gbc_textFieldNumeroTarjeta);

			GridBagConstraints gbc_lbFecha = new GridBagConstraints();
			gbc_lbFecha.anchor = GridBagConstraints.WEST;
			gbc_lbFecha.insets = new Insets(15, 15, 5, 5);
			gbc_lbFecha.gridx = 0;
			gbc_lbFecha.gridy = 3;
			getLbFechaCaducidad().setFont(fuenteLabels);
			pnPagoCamposTexto.add(getLbFechaCaducidad(), gbc_lbFecha);

			GridBagConstraints gbc_txFecha = new GridBagConstraints();
			gbc_txFecha.fill = GridBagConstraints.HORIZONTAL;
			gbc_txFecha.weightx = 0.5;
			gbc_txFecha.insets = new Insets(15, 5, 5, 5);
			gbc_txFecha.gridx = 1;
			gbc_txFecha.gridy = 3;
			getTxFechaCaducidad().setFont(fuenteCampos);
			getTxFechaCaducidad().setPreferredSize(alturaCampo);
			pnPagoCamposTexto.add(getTxFechaCaducidad(), gbc_txFecha);

			GridBagConstraints gbc_lbCvv = new GridBagConstraints();
			gbc_lbCvv.anchor = GridBagConstraints.EAST;
			gbc_lbCvv.insets = new Insets(15, 15, 5, 5);
			gbc_lbCvv.gridx = 2;
			gbc_lbCvv.gridy = 3;
			getLbCvv().setFont(fuenteLabels);
			pnPagoCamposTexto.add(getLbCvv(), gbc_lbCvv);

			GridBagConstraints gbc_txCvv = new GridBagConstraints();
			gbc_txCvv.fill = GridBagConstraints.HORIZONTAL;
			gbc_txCvv.weightx = 0.5;
			gbc_txCvv.insets = new Insets(15, 5, 5, 15);
			gbc_txCvv.gridx = 3;
			gbc_txCvv.gridy = 3;
			getTxCvv().setFont(fuenteCampos);
			getTxCvv().setPreferredSize(alturaCampo);
			pnPagoCamposTexto.add(getTxCvv(), gbc_txCvv);

			GridBagConstraints gbc_lbCom = new GridBagConstraints();
			gbc_lbCom.anchor = GridBagConstraints.NORTHWEST;
			gbc_lbCom.insets = new Insets(15, 15, 5, 5);
			gbc_lbCom.gridx = 0;
			gbc_lbCom.gridy = 4;
			pnPagoCamposTexto.add(getLbComentarios(), gbc_lbCom);

			JScrollPane scrollComentarios = new JScrollPane(getTxComentarios());
			scrollComentarios.setPreferredSize(new Dimension(0, 80));

			GridBagConstraints gbc_txCom = new GridBagConstraints();
			gbc_txCom.fill = GridBagConstraints.BOTH;
			gbc_txCom.gridwidth = 3;
			gbc_txCom.insets = new Insets(15, 5, 5, 15);
			gbc_txCom.gridx = 1;
			gbc_txCom.gridy = 4;
			pnPagoCamposTexto.add(scrollComentarios, gbc_txCom);

			JPanel pnBotones = new JPanel(new GridLayout(1, 2, 20, 0));

			getBtPagoModificar().setPreferredSize(new Dimension(180, 50));
			getBtPagoModificar().setFont(new Font("Segoe UI", Font.PLAIN, 14));
			getBtnProcederPago().setPreferredSize(new Dimension(180, 50));
			getBtnProcederPago().setFont(new Font("Segoe UI", Font.BOLD, 14));

			pnBotones.add(getBtPagoModificar());
			pnBotones.add(getBtnProcederPago());

			GridBagConstraints gbc_botones = new GridBagConstraints();
			gbc_botones.gridwidth = 4;
			gbc_botones.insets = new Insets(30, 15, 15, 15);
			gbc_botones.fill = GridBagConstraints.HORIZONTAL;
			gbc_botones.gridx = 0;
			gbc_botones.gridy = 5;

			pnPagoCamposTexto.add(pnBotones, gbc_botones);
		}
		return pnPagoCamposTexto;
	}

	private JLabel getLbNombreTitular() {
		if (lbNombreTitular == null) {
			lbNombreTitular = new JLabel(textos.getString("lbl.titular"));
		}
		return lbNombreTitular;
	}

	private JTextField getTxNombreTitular() {
		if (txNombreTitular == null) {
			txNombreTitular = new JTextField();
			txNombreTitular.setColumns(10);
		}
		return txNombreTitular;
	}

	private JLabel getLbDocumentoIdentificativo() {
		if (lbDocumentoIdentificativo == null) {
			lbDocumentoIdentificativo = new JLabel(textos.getString("lbl.dni"));
		}
		return lbDocumentoIdentificativo;
	}

	private JTextField getTxDocumentoIdentificativo() {
		if (txDocumentoIdentificativo == null) {
			txDocumentoIdentificativo = new JTextField();
			txDocumentoIdentificativo.setColumns(10);
		}
		return txDocumentoIdentificativo;
	}

	private JLabel getLbFechaCaducidad() {
		if (lbFechaCaducidad == null) {
			lbFechaCaducidad = new JLabel(textos.getString("lbl.caducidad"));
		}
		return lbFechaCaducidad;
	}

	private JTextField getTxFechaCaducidad() {
		if (txFechaCaducidad == null) {
			txFechaCaducidad = new JTextField();
			txFechaCaducidad.setColumns(10);
		}
		return txFechaCaducidad;
	}

	private JLabel getLbCvv() {
		if (lbCvv == null) {
			lbCvv = new JLabel(textos.getString("lbl.cvv"));
			lbCvv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lbCvv;
	}

	private JTextField getTxCvv() {
		if (txCvv == null) {
			txCvv = new JTextField();
			txCvv.setColumns(10);
		}
		return txCvv;
	}

	private JButton getBtPagoModificar() {
		if (btPagoModificar == null) {
			btPagoModificar = new JButton(textos.getString("btn.modificar"));
			btPagoModificar.setMnemonic(textos.getString("btn.modificar.nemo").charAt(0));
			btPagoModificar.setFocusable(false);
			buttonGroup.add(btPagoModificar);
			btPagoModificar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostrarReservasSegunPanel();
					resetearPaginaPago();

				}
			});
		}
		return btPagoModificar;
	}

	protected void mostrarReservasSegunPanel() {
		if (esReservaAmbos) { // si el usuario ha calcado el boton de entradas + alojamiento, le mostramos la
								// pagina
			mostrarPaginaReservaAmbos();
		} else {
			mostrarPaginaReservasSimple(); // si no, mostramos la de entradas simple

		}

	}

	private boolean validarCamposTexto() {
		// validamos que al menos los 4 primeros campos no esten vacios
		return (getTxNombreTitular().getText().isBlank()) || (getTxFechaCaducidad().getText().isBlank())
				|| (getTxCvv().getText().isBlank()) || (getTxDocumentoIdentificativo().getText().isBlank());

	}

	private void validarPago() {
		if (!validarCamposTexto()) { // si se rellenan los 4 campos obligatorios, llevamos al final.
			mostrarPaginaFinal();

		} else {
			JOptionPane.showMessageDialog(null, textos.getString("msg.error.validar"));
		}
	}

	/**
	 * Metodo con el que pasamos todos los datos de interfaz a la agencia, y asi
	 * poder mostrar el recibo en pantalla y disco
	 */
	private void pasarDatosAgencia() {
		ParqueTematico parqueSeleccionado = (ParqueTematico) getCbParques().getSelectedItem();

		// VARIABLES QUE VAMOS A CALCULAR DEPENDIENDO DEL PANEL
		boolean hayEntradas = false;
		boolean hayAlojamiento = false;
		int nNoches = 0;

		if (esReservaAmbos) { // si es entradas + alojamiento

			// Leemos del checkbox de entradas del panel ambos
			hayEntradas = getCheckEntradasAmbos().isSelected();

			// Leemos de los checkboxes de alojamiento del panel ambos
			hayAlojamiento = getCheckHotelAmbos().isSelected() || getCheckApartamentoAmbos().isSelected()
					|| getCheckApartaHotelAmbos().isSelected();

			// Leemos el número de noches del combo nuevo(hay que sumarle 1 por el metodo)
			if (getCbNumeroNochesAmbos().isEnabled()) {
				nNoches = getCbNumeroNochesAmbos().getSelectedIndex() + 1;
			}

		} else {
			// estamos en reserva simple de entradas o alojamiento

			// Usamos los metodos ya creados
			hayEntradas = reservaEntradasSimple();
			hayAlojamiento = reservaAlojamientosSimple();

			// Leemos el número de noches del combo simple
			if (getCbNumeroNoches().isEnabled()) {
				nNoches = getCbNumeroNoches().getSelectedIndex() + 1;
			}
		}

		// pasamos a la agencia si hay parque o si hay alojamiento con la comprobacion
		// anterior
		agencia.setHayParque(hayEntradas);
		agencia.setHayAlojamiento(hayAlojamiento);

		// si hemos seleccionado alojamiento en en panel de checkBoxes que estemos,
		// debemos notificarlo
		Alojamiento alojamientoSeleccionado = null;
		if (hayAlojamiento) {
			alojamientoSeleccionado = this.alojamiento;
		}

		// cogemos los avlores comunes de la reserva, spinners, fecha del calendario,
		// fecha de entrada al alojamiento(si la hay)
		int numAdultos = (int) getSpAdultos().getValue();
		int numNinos = (int) getSpNinos().getValue();
		int numDias = (int) getSpDias().getValue();
		Date fechaEntradas = getCalendar().getDate();
		Date fechaAlojamiento;
		if (esReservaAmbos) {
			fechaAlojamiento = getDateChooserEntradasAmbos().getDate();
		} else {
			fechaAlojamiento = getDateChooserEntradas().getDate();
		}

		// Datos del Cliente
		String nombreCliente = getTxNombreTitular().getText();
		String dniCliente = getTxDocumentoIdentificativo().getText();

		// se lo pasamos todo a la agencia para que lo almacene
		agencia.setDatosReserva(parqueSeleccionado, alojamientoSeleccionado, fechaEntradas, fechaAlojamiento,
				numAdultos, numNinos, numDias, nNoches, nombreCliente, dniCliente);
	}

	private JButton getBtnProcederPago() {
		if (btnProcederPago == null) {
			btnProcederPago = new JButton(textos.getString("btn.proceder"));
			btnProcederPago.setMnemonic(textos.getString("btn.proceder.nemo").charAt(0));
			btnProcederPago.setFocusable(false);
			buttonGroup.add(btnProcederPago);
			btnProcederPago.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					validarPago();
					pasarDatosAgencia();
					presentarReservaEnPantalla();

				}

			});
		}
		return btnProcederPago;
	}

	private void presentarReservaEnPantalla() {
		// ponemos el recibo de reserva con todos los datos que hay
		textAreaFinalizarReserva.setText(agencia.presentarReservarPantalla(textos));
	}

	protected void mostrarPaginaFinal() {
		((CardLayout) getPnCentro().getLayout()).show(getPnCentro(), "finalizar");
	}

	private JPanel getPnFinalizarReserva() {
		if (pnFinalizarReserva == null) {
			pnFinalizarReserva = new JPanel();
			pnFinalizarReserva.setLayout(new BorderLayout(0, 0));
			pnFinalizarReserva.add(getPnFinalizarReservaCentro(), BorderLayout.CENTER);
			pnFinalizarReserva.add(getPnFinalizarReservaBoton(), BorderLayout.SOUTH);
		}
		return pnFinalizarReserva;
	}

	private JPanel getPnFinalizarReservaBoton() {
		if (pnFinalizarReservaBoton == null) {
			pnFinalizarReservaBoton = new JPanel();
			pnFinalizarReservaBoton.add(getBtFinalizarReserva());
		}
		return pnFinalizarReservaBoton;
	}

	private JButton getBtFinalizarReserva() {
		if (btFinalizarReserva == null) {
			btFinalizarReserva = new JButton(textos.getString("btn.finalizar"));
			btFinalizarReserva.setMnemonic(textos.getString("btn.finalizar.nemo").charAt(0));
			btFinalizarReserva.setFont(new Font("Segoe UI", Font.PLAIN, 20));
			btFinalizarReserva.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					estasSeguroDeFinalizarReserva();

				}
			});
		}
		return btFinalizarReserva;
	}

	protected void estasSeguroDeFinalizarReserva() {
		// si le damos al ok -> se hace la reserva, y se presenta el minijuego
		// en caso contrario, se vuelve a la pestaña de datos, por si se quieren
		// modificar.
		int respuesta = JOptionPane.showConfirmDialog(contentPane, textos.getString("dialog.msg.confirmacion"),
				textos.getString("dialog.titulo.confirmacion"), JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (respuesta == JOptionPane.OK_OPTION) {
			mostrarMiniJuego();

		} else {
			mostrarPaginaPago();
		}

	}

	protected void mostrarMiniJuego() {
		((CardLayout) getPnCentro().getLayout()).show(getPnCentro(), "minijuego");

	}

	private JPanel getPnFinalizarReservaCentro() {
		if (pnFinalizarReservaCentro == null) {
			pnFinalizarReservaCentro = new JPanel();
			pnFinalizarReservaCentro.setLayout(new GridLayout(0, 1, 0, 0));
			pnFinalizarReservaCentro.add(getScrollPaneFinalizarReserva());
		}
		return pnFinalizarReservaCentro;
	}

	private JScrollPane getScrollPaneFinalizarReserva() {
		if (scrollPaneFinalizarReserva == null) {
			scrollPaneFinalizarReserva = new JScrollPane();
			scrollPaneFinalizarReserva.setViewportView(getTextAreaFinalizarReserva());
		}
		return scrollPaneFinalizarReserva;
	}

	private JTextArea getTextAreaFinalizarReserva() {
		if (textAreaFinalizarReserva == null) {
			textAreaFinalizarReserva = new JTextArea();
			textAreaFinalizarReserva.setWrapStyleWord(true);
			textAreaFinalizarReserva.setLineWrap(true);
			textAreaFinalizarReserva.setFont(new Font("Monospaced", Font.PLAIN, 15));
			textAreaFinalizarReserva.setFocusable(false);
			textAreaFinalizarReserva.setEditable(false);
		}
		return textAreaFinalizarReserva;
	}

	// aqui empieza todo lo relacionado al minijuego
	private JPanel getPnMiniJuego() {
		if (pnMiniJuego == null) {
			pnMiniJuego = new JPanel();
			pnMiniJuego.setLayout(new BorderLayout(0, 0));
			pnMiniJuego.add(getPnJuegoTablero(), BorderLayout.CENTER);
		}
		return pnMiniJuego;
	}

	class DescubreCasilla implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			verBono(Integer.parseInt(e.getActionCommand()));

		}

	}

	public void verBono(int i) {
		// logica
		juego.jugar(i);

		// interfaz
		borrarImagenes();
		pintarBono();
		habilitarBotones(false);
		if (juego.bonoEncontrado(i)) {
			JOptionPane.showMessageDialog(null, textos.getString("msg.bono.exito"));
			agencia.setBono(true); // esto es clave, pues si encuentras el bono, la agencia pone en fichero la
									// linea correspondiente

		} else {
			JOptionPane.showMessageDialog(null, textos.getString("msg.bono.fallo"));
		}
		finalizar();

	}

	private void habilitarBotones(boolean estado) {
		for (Component c : getPnJuegoTablero().getComponents()) {
			c.setEnabled(estado);
		}

	}

	private void pintarBono() {
		int pos = juego.getPosicionBono();
		for (int i = 0; i < getPnJuegoTablero().getComponentCount(); i++) {
			if (pos == i) {
				Component c = getPnJuegoTablero().getComponent(i);
				JButton bono = (JButton) c;
				adaptarImagenesEnBotones(bono, "/img/bonus.png");

			}
		}

	}

	private void borrarImagenes() {
		for (int i = 0; i < getPnJuegoTablero().getComponentCount(); i++) {
			Component componentesABorrar = getPnJuegoTablero().getComponent(i);
			JButton botonesDelTablero = (JButton) componentesABorrar;
			botonesDelTablero.setIcon(null);
			botonesDelTablero.setDisabledIcon(null);

		}

	}

	private JPanel getPnJuegoTablero() {
		if (pnJuegoTablero == null) {
			pnJuegoTablero = new JPanel();
			pnJuegoTablero.setBorder(new EmptyBorder(50, 50, 50, 50));
			pnJuegoTablero.setLayout(new GridLayout(1, 5, 20, 20));
			pnJuegoTablero.add(getBtJuego0());
			pnJuegoTablero.add(getBtJuego1());
			pnJuegoTablero.add(getBtJuego2());
			pnJuegoTablero.add(getBtJuego3());
			pnJuegoTablero.add(getBtJuego4());
		}
		return pnJuegoTablero;
	}

	private JButton getBtJuego4() {
		if (btJuego4 == null) {
			btJuego4 = new JButton("");
			btJuego4.setActionCommand("4");
			btJuego4.setFocusable(false);
			btJuego4.addActionListener(casilla);
		}
		return btJuego4;
	}

	private JButton getBtJuego3() {
		if (btJuego3 == null) {
			btJuego3 = new JButton("");
			btJuego3.setActionCommand("3");
			btJuego3.setFocusable(false);
			btJuego3.addActionListener(casilla);
		}
		return btJuego3;
	}

	private JButton getBtJuego0() {
		if (btJuego0 == null) {
			btJuego0 = new JButton("");
			btJuego0.setActionCommand("0");
			btJuego0.setFocusable(false);
			btJuego0.addActionListener(casilla);
		}
		return btJuego0;
	}

	private JButton getBtJuego2() {
		if (btJuego2 == null) {
			btJuego2 = new JButton("");
			btJuego2.setActionCommand("2");
			btJuego2.setFocusable(false);
			btJuego2.addActionListener(casilla);
		}
		return btJuego2;
	}

	private JButton getBtJuego1() {
		if (btJuego1 == null) {
			btJuego1 = new JButton("");
			btJuego1.setActionCommand("1");
			btJuego1.setFocusable(false);
			btJuego1.addActionListener(casilla);
		}
		return btJuego1;
	}

	// metodo que finaliza la reserva, graba en disco y resetea toda la aplicación
	private void finalizar() {
		agencia.grabarReserva(textos);
		inicializar();

	}

	private void inicializar() {
		// logica
		agencia.inicializarApp();
		this.alojamiento = null; // 1. CLAVE: Resetear variable de alojamiento

		// 2. RESETEAR PANTALLA INICIO.
		resetearInicio();

		// 3. RESETEAR PANTALLA RESERVAS ENTRADAS SIMPLE
		resetearPaginaReservasSimple();

		// 4. RESETEAR PANTALLA RESERVAS AMBOS
		resetearPaginaReservasAmbos();

		// 5. RESETEAR PANTALLA PAGO
		resetearPaginaPago();

		// 6. REINICIAR MINIJUEGO
		reiniciarJuego();

		// 7. NAVEGACIÓN: VOLVER AL INICIO
		mostrarInicio();

		// 8. GENERAMOS EL PARQUE EN OFERTA OTRA VEZ
		String nombre = agencia.imprimirParqueEnOferta();
		String msg = MessageFormat.format(textos.getString("msg.oferta"), nombre);
		textAreaParqueOferta.setText(msg);
	}

	private void resetearInicio() {
		// poner los spinners a cero:
		getSpAdultos().setValue(0);
		getSpNinos().setValue(0);
		getSpDias().setValue(0);

		// resetear la fecha del calendario:
		getCalendar().setDate(new Date());

		// resetear el combo
		cbParques.setSelectedIndex(0);

		// deshabilitar los botones de reservas:
		getBtReservasSimple().setEnabled(false);
		getBtrReservasGrupos().setEnabled(false);

	}

	private void resetearPaginaPago() {
		// campo de arriba con el resumen:
		txPagoResumen.setText("");

		// los demas campos a rellenar por el usuario:
		getTxNombreTitular().setText("");
		getTxDocumentoIdentificativo().setText("");
		getTxFechaCaducidad().setText("");
		getTxCvv().setText("");
		getTextFieldNumeroTarjeta().setText("");
		getTxComentarios().setText("");
	}

	private void resetearPaginaReservasSimple() {
		resetearCheckBoxes();
		resetearPanelOfertas();
		resetearTexto();
		resetearFechaAlojamientos();
		resetearBotonReservaEntradas();

	}

	private void resetearBotonReservaEntradas() {
		getBtReservaEntradas().setEnabled(false);

	}

	private void resetearFechaAlojamientos() {
		getDateChooserEntradas().setEnabled(false);
		getDateChooserEntradasAmbos().setEnabled(false);
		getDateChooserEntradas().setDate(null);
		getDateChooserEntradasAmbos().setDate(null);

	}

	private void resetearPanelOfertas() {
		// simplemente volvemos a poner el panel de opciones.
		((CardLayout) getPnReservaDerechaCentral().getLayout()).show(getPnReservaDerechaCentral(), "opciones");
	}

	private void resetearTexto() {
		// resetear el texto
		getTextAreaReservaSimple().setText("");

	}

	private void reiniciarJuego() {
		// 1. Reiniciar lógica interna del juego
		juego.inicializar();

		// 2. Reactivar botones
		habilitarBotones(true);

		// 3. volvemos a poner las fotos de las casillas
		adaptarBotonesJuego();

	}

	private JLabel getLbNumeroTarjeta() {
		if (lbNumeroTarjeta == null) {
			lbNumeroTarjeta = new JLabel(textos.getString("lbl.tarjeta"));
		}
		return lbNumeroTarjeta;
	}

	private JTextField getTextFieldNumeroTarjeta() {
		if (textFieldNumeroTarjeta == null) {
			textFieldNumeroTarjeta = new JTextField();
			textFieldNumeroTarjeta.setColumns(10);
		}
		return textFieldNumeroTarjeta;
	}

	class ProcesaFiltrosAlojamientos implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Tipo tipo = Tipo.valueOf(e.getActionCommand());
			filtrarAlojamientos(tipo);
		}

	}

	public void filtrarAlojamientos(Tipo tipo) {
		// logica
		List<Alojamiento> filtros = agencia.filtrarAlojamientos(tipo, (ParqueTematico) cbParques.getSelectedItem());
		crearAlojamientos(filtros);

	}

	public void reservarAlojamiento(Alojamiento a) {
		// establecemos el alojamiento que hemos creado y llevamos al pago
		this.alojamiento = a;
		mostrarPaginaPago();

	}

	public void resumenSoloAlojamientos() {
		if (this.alojamiento != null) {
			String msg = MessageFormat.format(textos.getString("msg.resumen.pago.solo.alojamiento"),
					alojamiento.getDenominacion());
			txPagoResumen.setText(msg);
		} else {
			txPagoResumen.setText(textos.getString("msg.resumen.pago.sin.alojamiento"));

		}
	}

	private JTextArea getTextAreaParqueOferta() {
		if (textAreaParqueOferta == null) {
			textAreaParqueOferta = new JTextArea();
			textAreaParqueOferta.setFont(new Font("Segoe UI", Font.BOLD, 20));
			textAreaParqueOferta.setLineWrap(true);
			textAreaParqueOferta.setWrapStyleWord(true);
			textAreaParqueOferta.setEditable(false);
			// lo que hacemos aqui es internacionalizarlo
			String nombre = agencia.imprimirParqueEnOferta();
			String msg = MessageFormat.format(textos.getString("msg.oferta"), nombre);
			textAreaParqueOferta.setText(msg);
		}
		return textAreaParqueOferta;
	}

	private JLabel getLbNumeroNoches() {
		if (lbNumeroNoches == null) {
			lbNumeroNoches = new JLabel(textos.getString("lbl.num_noches"));
			lbNumeroNoches.setFont(new Font("Segoe UI", Font.PLAIN, 13));
			lbNumeroNoches.setBounds(204, 34, 200, 25);
		}
		return lbNumeroNoches;
	}

	private JComboBox<String> getCbNumeroNoches() {
		if (cbNumeroNoches == null) {
			cbNumeroNoches = new JComboBox<String>();
			DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
			for (int i = 1; i < Agencia.NOCHES; i++) {
				model.addElement(String.valueOf(i));
			}
			cbNumeroNoches.setModel(model);
			cbNumeroNoches.setBounds(204, 70, 200, 35);
			cbNumeroNoches.setEnabled(false);
		}
		return cbNumeroNoches;
	}

	public Agencia getAgencia() {
		// por si tenemos que usarlo en la clase de paneles dinamicos
		return this.agencia;
	}

	public int getNumPersonas() {
		// numero de personas en la reserva -> valor del spinner de adultos y niños
		return (int) spAdultos.getValue() + (int) spNinos.getValue();
	}

	private JLabel getLbComentarios() {
		if (lbComentarios == null) {
			lbComentarios = new JLabel(textos.getString("lbl.comentarios"));
			lbComentarios.setFont(new Font("Segoe UI", Font.BOLD, 16));
		}
		return lbComentarios;
	}

	private JTextField getTxComentarios() {
		if (txComentarios == null) {
			txComentarios = new JTextField();
			txComentarios.setPreferredSize(new Dimension(0, 45));
			txComentarios.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			txComentarios.setColumns(10);
		}
		return txComentarios;
	}

	private JPanel getPnReservaAmbos() {
		if (pnReservaAmbos == null) {
			pnReservaAmbos = new JPanel();
			pnReservaAmbos.setLayout(new GridLayout(0, 2, 0, 0));
			pnReservaAmbos.add(getPnReservaAmbosIzquierda());
			pnReservaAmbos.add(getPnReservaAmbosDerecha());
		}
		return pnReservaAmbos;
	}

	private JPanel getPnReservaAmbosIzquierda() {
		if (pnReservaAmbosIzquierda == null) {
			pnReservaAmbosIzquierda = new JPanel();
			pnReservaAmbosIzquierda.setLayout(new GridLayout(2, 1, 0, 0));
			pnReservaAmbosIzquierda.add(getPnReservaAmbosCheckBoxes());
			pnReservaAmbosIzquierda.add(getScrollPaneAmbosReserva());
		}
		return pnReservaAmbosIzquierda;
	}

	private JPanel getPnReservaAmbosCheckBoxes() {
		if (pnReservaAmbosCheckBoxes == null) {
			pnReservaAmbosCheckBoxes = new JPanel();
			pnReservaAmbosCheckBoxes.setLayout(null);
			pnReservaAmbosCheckBoxes
					.setBorder(new TitledBorder(null, "Filtros", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			pnReservaAmbosCheckBoxes.add(getCheckHotelAmbos());
			pnReservaAmbosCheckBoxes.add(getCheckApartamentoAmbos());
			pnReservaAmbosCheckBoxes.add(getCheckApartaHotelAmbos());
			pnReservaAmbosCheckBoxes.add(getCheckEntradasAmbos());
			pnReservaAmbosCheckBoxes.add(getLbNumeroNochesAmbos());
			pnReservaAmbosCheckBoxes.add(getCbNumeroNochesAmbos());
			pnReservaAmbosCheckBoxes.add(getDateChooserEntradasAmbos());
			pnReservaAmbosCheckBoxes.add(getLbFechaAlojamientoAmbos());
		}
		return pnReservaAmbosCheckBoxes;
	}

	private JCheckBox getCheckHotelAmbos() {
		if (checkHotelAmbos == null) {
			checkHotelAmbos = new JCheckBox(textos.getString("lbl.hotel"));
			checkHotelAmbos.addActionListener(filtro);
			checkExclusivoAmbos.add(checkHotelAmbos);
			checkHotelAmbos.setMnemonic(textos.getString("lbl.hotel.nemo").charAt(0));
			checkHotelAmbos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					habilitarComboNumeroNoches();
					habilitarFechaAlojamientos();
				}
			});
			checkHotelAmbos.setBorder(new TitledBorder(

					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),

					"Filtros", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			checkHotelAmbos.setActionCommand("HO");
			checkHotelAmbos.setBounds(20, 30, 120, 25);
		}
		return checkHotelAmbos;
	}

	protected void habilitarFechaAlojamientos() {
		// si reservamos entradas y alojamiento y ademas hay un alojamiento
		// seleccionado, habilitamos escoger fecha entrada
		if (esReservaAmbos && reservaAlojamientosAmbos()) {
			getDateChooserEntradasAmbos().setEnabled(true);

			// si es reserva de entradas simple y hay algun alojamiento seleccionado ->
			// habilitamos la fecha de entrada
		} else if (!esReservaAmbos && reservaAlojamientosSimple()) {
			getDateChooserEntradas().setEnabled(true);
		} else {
			getDateChooserEntradasAmbos().setEnabled(false);
			getDateChooserEntradas().setEnabled(false);
		}

	}

	private boolean reservaAlojamientosAmbos() {
		// comprobamos si hay algun alojamiento del panel ambos seleccionado
		return getCheckHotelAmbos().isSelected() || getCheckApartamentoAmbos().isSelected()
				|| getCheckApartaHotelAmbos().isSelected();
	}

	private JCheckBox getCheckApartamentoAmbos() {
		if (checkApartamentoAmbos == null) {
			checkApartamentoAmbos = new JCheckBox(textos.getString("lbl.apartamento"));
			checkExclusivoAmbos.add(checkApartamentoAmbos);
			checkApartamentoAmbos.setMnemonic(textos.getString("lbl.apartamento.nemo").charAt(0));
			checkApartamentoAmbos.addActionListener(filtro);
			checkApartamentoAmbos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					habilitarComboNumeroNoches();
					habilitarFechaAlojamientos();
				}
			});
			checkApartamentoAmbos.setBorder(new TitledBorder(

					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),

					"Filtros", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			checkApartamentoAmbos.setActionCommand("AP");
			checkApartamentoAmbos.setBounds(20, 60, 120, 25);
		}
		return checkApartamentoAmbos;
	}

	private JCheckBox getCheckApartaHotelAmbos() {
		if (checkApartaHotelAmbos == null) {
			checkApartaHotelAmbos = new JCheckBox(textos.getString("lbl.apartahotel"));
			checkApartaHotelAmbos.setMnemonic(textos.getString("lbl.apartahotel.nemo").charAt(0));
			checkApartaHotelAmbos.addActionListener(filtro);
			checkApartaHotelAmbos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					habilitarComboNumeroNoches();
					habilitarFechaAlojamientos();
				}

			});
			checkExclusivoAmbos.add(checkApartaHotelAmbos);
			checkApartaHotelAmbos.setBorder(new TitledBorder(

					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),

					"Filtros", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			checkApartaHotelAmbos.setActionCommand("AH");
			checkApartaHotelAmbos.setBounds(20, 90, 120, 25);
		}
		return checkApartaHotelAmbos;
	}

	private void habilitarComboNumeroNoches() {
		// si seleccionamos un check de alojamientos - > habilitamos el combo numero
		// noches
		cbNumeroNochesAmbos.setEnabled(true);
	}

	private JCheckBox getCheckEntradasAmbos() {
		if (checkEntradasAmbos == null) {
			checkEntradasAmbos = new JCheckBox(textos.getString("lbl.entradas"));
			checkEntradasAmbos.setMnemonic(textos.getString("lbl.entradas.nemo").charAt(0));
			checkEntradasAmbos.setSelected(true);
			checkEntradasAmbos.setEnabled(false);
			checkEntradasAmbos.setFont(new Font("Tahoma", Font.PLAIN, 11));
			checkEntradasAmbos.setBorder(new TitledBorder(

					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),

					"Filtros", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			checkEntradasAmbos.setBounds(20, 120, 120, 25);
		}
		return checkEntradasAmbos;
	}

	private JLabel getLbNumeroNochesAmbos() {
		if (lbNumeroNochesAmbos == null) {
			lbNumeroNochesAmbos = new JLabel(textos.getString("lbl.num_noches"));
			lbNumeroNochesAmbos.setBounds(167, 40, 200, 25);
		}
		return lbNumeroNochesAmbos;
	}

	private JComboBox<String> getCbNumeroNochesAmbos() {
		if (cbNumeroNochesAmbos == null) {
			cbNumeroNochesAmbos = new JComboBox<String>();
			DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
			for (int i = 1; i < Agencia.NOCHES; i++) {
				model.addElement(String.valueOf(i));
			}
			cbNumeroNochesAmbos.setModel(model);
			cbNumeroNochesAmbos.setEnabled(false);
			cbNumeroNochesAmbos.setBounds(167, 80, 200, 35);
		}
		return cbNumeroNochesAmbos;
	}

	private JScrollPane getScrollPaneAmbosReserva() {
		if (scrollPaneAmbosReserva == null) {
			scrollPaneAmbosReserva = new JScrollPane();
			scrollPaneAmbosReserva.setFocusable(false);
			scrollPaneAmbosReserva.setViewportView(getTextAreaAmbosReserva());
		}
		return scrollPaneAmbosReserva;
	}

	private JTextArea getTextAreaAmbosReserva() {
		if (textAreaAmbosReserva == null) {
			textAreaAmbosReserva = new JTextArea();
			textAreaAmbosReserva.setFocusable(false);
			textAreaAmbosReserva.setFont(new Font("Segoe UI", Font.PLAIN, 20));
			textAreaAmbosReserva.setLineWrap(true);
			textAreaAmbosReserva.setEditable(false);
			textAreaAmbosReserva.setWrapStyleWord(true);
		}
		return textAreaAmbosReserva;
	}

	private JButton getBtEs() {
		if (btES == null) {
			btES = new JButton("ES");
			btES.setMnemonic('S');
			btES.setMnemonic(KeyEvent.VK_S);
			btES.setFont(new Font("Segoe UI", Font.BOLD, 15));
			btES.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cambiarIdioma("ES");
				}
			});
			btES.setFocusable(false);
		}
		return btES;
	}

	@SuppressWarnings("deprecation")
	protected void cambiarIdioma(String idioma) {
		// 1. Cambiamos la localización y recargamos el ResourceBundle

		Locale localizacion = new Locale(idioma.toLowerCase());
		this.textos = ResourceBundle.getBundle("textos", localizacion);

		internacionalInicio(textos, localizacion);
		internacionalParquesAsociados(textos, localizacion);

		internacionalReservaEntradas(textos, localizacion);
		lbFechaAlojamiento.setText(textos.getString("lbl.fecha.alojamiento"));
		dateChooserEntradas.setLocale(new Locale(idioma.toLowerCase()));

		internacionalReservaAmbos(textos, localizacion);
		dateChooserEntradasAmbos.setLocale(new Locale(idioma.toLowerCase()));
		lbFechaAlojamientoAmbos.setText(textos.getString("lbl.fecha.alojamiento"));

		internacionalPanelPago(textos, localizacion);

		textAreaServicios.setText(textos.getString("msg.servicios"));

		textAreaQuienesSomos.setText(textos.getString("msg.quienes.explicacion"));
		btQuienesSomosAyuda.setToolTipText(textos.getString("msg.tooltip.ayuda"));

		btVolverPaginaPrincipal.setToolTipText(textos.getString("msg.tooltip.inicio"));

		getBtFinalizarReserva().setText(textos.getString("btn.finalizar"));
		if (esReservaAmbos) {
			actualizarTxPagoResumenAmbos();
		} else {
			actualizarTxPagoResumen();
		}

		actualizarPaginaReserva(); // Actualiza "Has seleccionado el parque: X"
		actualizarPaginaReservaAmbos(); // Actualiza el texto del panel combinados

		if (alojamiento != null) {
			resumenSoloAlojamientos(); // Actualiza el resumen del alojamiento seleccionado en el pago
		}
		btFinalizarReserva.setMnemonic(textos.getString("btn.finalizar.nemo").charAt(0));

	}

	private void internacionalPanelPago(ResourceBundle textos2, Locale localizacion) {
		lbNombreTitular.setText(textos.getString("lbl.titular"));
		lbDocumentoIdentificativo.setText(textos.getString("lbl.dni"));
		lbNumeroTarjeta.setText(textos.getString("lbl.tarjeta"));
		lbFechaCaducidad.setText(textos.getString("lbl.caducidad"));
		lbCvv.setText(textos.getString("lbl.cvv"));
		lbComentarios.setText(textos.getString("lbl.comentarios"));
		btPagoModificar.setText(textos.getString("btn.modificar"));
		btnProcederPago.setText(textos.getString("btn.proceder"));
		btnProcederPago.setMnemonic(textos.getString("btn.proceder.nemo").charAt(0));
		btPagoModificar.setMnemonic(textos.getString("btn.modificar.nemo").charAt(0));

	}

	private void internacionalReservaAmbos(ResourceBundle textos2, Locale localizacion) {
		checkHotelAmbos.setText(textos.getString("lbl.hotel"));
		checkApartamentoAmbos.setText(textos.getString("lbl.apartamento"));
		checkApartaHotelAmbos.setText(textos.getString("lbl.apartahotel"));
		checkEntradasAmbos.setText(textos.getString("lbl.entradas"));

		lbNumeroNochesAmbos.setText(textos.getString("lbl.num_noches"));
		textAreaAmbosOpciones.setText(textos.getString("msg.seleccion.alojamiento"));

		getBtReservaAmbos().setText(textos.getString("btn.reservar.panel.reservas"));

		checkHotelAmbos.setMnemonic(textos.getString("lbl.hotel.nemo").charAt(0));
		checkApartamentoAmbos.setMnemonic(textos.getString("lbl.apartamento.nemo").charAt(0));
		checkApartaHotelAmbos.setMnemonic(textos.getString("lbl.apartahotel.nemo").charAt(0));
		checkEntradasAmbos.setMnemonic(textos.getString("lbl.entradas.nemo").charAt(0));

		TitledBorder bordeAmbos = (TitledBorder) getPnReservaAmbosCheckBoxes().getBorder();
		bordeAmbos.setTitle(textos.getString("border.filtros"));
		getPnReservaAmbosCheckBoxes().repaint();

	}

	private void internacionalReservaEntradas(ResourceBundle textos2, Locale localizacion) {
		// Panel Estándar
		checkHotelSimple.setText(textos.getString("lbl.hotel"));
		checkApartamentoSimple.setText(textos.getString("lbl.apartamento"));
		checkApartaHotelSimple.setText(textos.getString("lbl.apartahotel"));
		checkEntradasSimple.setText(textos.getString("lbl.entradas"));

		lbNumeroNoches.setText(textos.getString("lbl.num_noches"));
		textAreaOpciones.setText(textos.getString("textArea.selecciona"));

		// mnemonicos:
		checkHotelSimple.setMnemonic(textos.getString("lbl.hotel.nemo").charAt(0));
		checkEntradasSimple.setMnemonic(textos.getString("lbl.entradas.nemo").charAt(0));
		checkApartaHotelSimple.setMnemonic(textos.getString("lbl.apartahotel.nemo").charAt(0));
		checkApartamentoSimple.setMnemonic(textos.getString("lbl.apartamento.nemo").charAt(0));

		getBtReservaEntradas().setText(textos.getString("btn.reservar.panel.reservas"));
		btReservaEntradas.setMnemonic(textos.getString("btn.reservar.panel.reservas.nemo").charAt(0));

		textAreaOpciones.setText(textos.getString("textArea.selecciona"));

		TitledBorder bordeNormal = (TitledBorder) getPnReservaSimpleCheckBoxes().getBorder();
		bordeNormal.setTitle(textos.getString("border.filtros"));
		getPnReservaSimpleCheckBoxes().repaint();

	}

	private void internacionalParquesAsociados(ResourceBundle textos2, Locale localizacion) {
		// primero los textos
		lbPreguntaParquesAsociados.setText(textos.getString("lbl.titulo.asociados"));
		btParquesAsociadosOeste.setText(textos.getString("btn.info.parque"));
		btParquesAsociadosCentro.setText(textos.getString("btn.info.parque"));
		btParquesAsociadosEste.setText(textos.getString("btn.info.parque"));
		btParquesAsociadosServicios.setText(textos.getString("btn.analizar.servicios"));

		// mnemonicos:
		btParquesAsociadosOeste.setMnemonic(textos.getString("btn.info.parque.nemo1").charAt(0));
		btParquesAsociadosCentro.setMnemonic(textos.getString("btn.info.parque.nemo2").charAt(0));
		btParquesAsociadosEste.setMnemonic(textos.getString("btn.info.parque.nemo3").charAt(0));

	}

	private void internacionalInicio(ResourceBundle textos, Locale localizacion) {
		// primero los botones del panel norte y el titulo de la ventana:
		setTitle(textos.getString("ventana.titulo"));

		btLogo.setText(textos.getString("btn.inicio"));
		btParquesAsociados.setText(textos.getString("btn.parques"));
		btServicios.setText(textos.getString("btn.servicios"));
		btQuienesSomos.setText(textos.getString("btn.quienes"));
		btAyuda.setText(textos.getString("btn.ayuda"));
		btLogo.setMnemonic(textos.getString("btn.inicio.nemo").charAt(0));
		btParquesAsociados.setMnemonic(textos.getString("btn.parques.nemo").charAt(0));
		btServicios.setMnemonic(textos.getString("btn.servicios.nemo").charAt(0));
		btQuienesSomos.setMnemonic(textos.getString("btn.quienes.nemo").charAt(0));
		btAyuda.setMnemonic(textos.getString("btn.ayuda.nemo").charAt(0));

		// botones de reservas:
		btReservasSimple.setMnemonic(textos.getString("btn.reservas.nemo").charAt(0));
		btrReservasGrupos.setMnemonic(textos.getString("btn.reserva.ambos.nemo").charAt(0));
		btReservasSimple.setText(textos.getString("btn.reserva.entradas")); // <--- Faltaba esto
		btrReservasGrupos.setText(textos.getString("btn.reserva.pack"));

		// spinners y parque en oferta
		lbAdultos.setText(textos.getString("lbl.adultos"));
		lbNinos.setText(textos.getString("lbl.ninos"));
		lbDias.setText(textos.getString("lbl.dias"));
		String nombre = agencia.imprimirParqueEnOferta();
		String textoOferta = MessageFormat.format(textos.getString("msg.oferta"), nombre);
		getTextAreaParqueOferta().setText(textoOferta);

		// calendario
		calendar.setLocale(localizacion);

	}

	private JButton getBtEN() {
		if (btEN == null) {
			btEN = new JButton("EN");
			btEN.setMnemonic('N');
			btEN.setMnemonic(KeyEvent.VK_N);
			btEN.setFont(new Font("Segoe UI", Font.BOLD, 15));
			btEN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cambiarIdioma("EN");
				}
			});
			btEN.setFocusable(false);
		}
		return btEN;
	}

	private JPanel getPnReservaDerecha() {
		if (pnReservaDerecha == null) {
			pnReservaDerecha = new JPanel();
			pnReservaDerecha.setLayout(new BorderLayout(0, 0));
			pnReservaDerecha.add(getPnBotonReserva(), BorderLayout.SOUTH);
			pnReservaDerecha.add(getPnReservaDerechaCentral(), BorderLayout.CENTER);
		}
		return pnReservaDerecha;
	}

	private JPanel getPnBotonReserva() {
		if (pnBotonReserva == null) {
			pnBotonReserva = new JPanel();
			pnBotonReserva.setLayout(new GridLayout(0, 1, 0, 0));
			pnBotonReserva.add(getBtReservaEntradas());
		}
		return pnBotonReserva;
	}

	private JButton getBtReservaEntradas() {
		if (btReservaEntradas == null) {
			btReservaEntradas = new JButton(textos.getString("btn.reservar.panel.reservas"));
			btReservaEntradas.setFont(new Font("Segoe UI", Font.PLAIN, 20));
			btReservaEntradas.setMnemonic(textos.getString("btn.reservar.panel.reservas.nemo").charAt(0));

			btReservaEntradas.setFocusable(false);
			btReservaEntradas.setEnabled(false);
			btReservaEntradas.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cogerAlojamiento();
					if (!esReservaAmbos && !reservaEntradasSimple()) {
						mensajeCapacidad();
					}

					mostrarPaginaPago();
					actualizarTxPagoResumen();
				}
			});
		}
		return btReservaEntradas;
	}

	protected void mensajeCapacidad() {
		int personas = (int) spAdultos.getValue() + (int) spNinos.getValue();
		if (agencia.sobrepasarCapacidadAlojamiento(personas, this.alojamiento)) {
			String msg = textos.getString("msg.capacidad.sobrepasada");
			JOptionPane.showMessageDialog(null, msg);

		}

	}

	protected void habilitarBotonReservaEntradasSolo() {
		// solo habilitamos el boton de reservas ismple, si las entradas estan
		// seleccionadas
		if (reservaEntradasSimple()) {
			btReservaEntradas.setEnabled(true);
		} else {
			btReservaEntradas.setEnabled(false);
		}

	}

	protected void actualizarTxPagoResumen() {
		ParqueTematico parque = (ParqueTematico) cbParques.getSelectedItem();
		int dias = (int) spDias.getValue();
		if (reservaEntradasSimple()) { // si solo reservo entradas
			// muestro el parque seleccionado y la estancia
			String patron = textos.getString("msg.resumen.entradas");
			String mensaje = MessageFormat.format(patron, parque.getDenominacion(), dias);
			txPagoResumen.setText(mensaje);
		}
		// si solo reservo alojamiento
		else if (getAlojamiento() != null) {
			// muestro el alojamiento seleccionado
			String patron = textos.getString("msg.resumen.alojamiento");
			String mensaje = MessageFormat.format(patron, getAlojamiento().getDenominacion());
			txPagoResumen.setText(mensaje);
		} else {
			txPagoResumen.setText("");
		}

	}

	private JPanel getPnReservaDerechaCentral() {
		if (pnReservaDerechaCentral == null) {
			pnReservaDerechaCentral = new JPanel();
			pnReservaDerechaCentral.setLayout(new CardLayout(0, 0));
			pnReservaDerechaCentral.add(getPnReservaDerechaOpciones(), "opciones");
			pnReservaDerechaCentral.add(getPnReservaDerechaEntradas(), "entradas");
			pnReservaDerechaCentral.add(getPnReservaDerechaAlojamientos(), "alojamientos");
		}
		return pnReservaDerechaCentral;
	}

	private JPanel getPnReservaDerechaOpciones() {
		if (pnReservaDerechaOpciones == null) {
			pnReservaDerechaOpciones = new JPanel();
			pnReservaDerechaOpciones.setLayout(new GridLayout(0, 1, 0, 0));
			pnReservaDerechaOpciones.add(getTextAreaOpciones());
		}
		return pnReservaDerechaOpciones;
	}

	private JTextArea getTextAreaOpciones() {
		if (textAreaOpciones == null) {
			textAreaOpciones = new JTextArea();
			textAreaOpciones.setFocusable(false);
			textAreaOpciones.setFont(new Font("Segoe UI", Font.PLAIN, 20));
			textAreaOpciones.setLineWrap(true);
			textAreaOpciones.setWrapStyleWord(true);
			textAreaOpciones.setEditable(false);
			textAreaOpciones.setText(textos.getString("textArea.selecciona"));
			;

		}
		return textAreaOpciones;
	}

	private JPanel getPnReservaDerechaEntradas() {
		if (pnReservaDerechaEntradas == null) {
			pnReservaDerechaEntradas = new JPanel();
			pnReservaDerechaEntradas.setLayout(new GridLayout(0, 1, 0, 0));
			pnReservaDerechaEntradas.add(getLbImgReservaEntradas());
		}
		return pnReservaDerechaEntradas;
	}

	private JLabel getLbImgReservaEntradas() {
		if (lbImgReservaEntradas == null) {
			lbImgReservaEntradas = new JLabel("");
		}
		return lbImgReservaEntradas;
	}

	private JPanel getPnReservaDerechaAlojamientos() {
		if (pnReservaDerechaAlojamientos == null) {
			pnReservaDerechaAlojamientos = new JPanel();
			pnReservaDerechaAlojamientos.setLayout(new BorderLayout(0, 0));
			pnContenedorFichas = new JPanel();
			pnContenedorFichas.setBackground(Color.WHITE);
			pnContenedorFichas.setLayout(new GridLayout(0, 1, 0, 10));

			JScrollPane scrollPaneEntradasAlojamientos = new JScrollPane(pnContenedorFichas);
			scrollPaneEntradasAlojamientos
					.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			scrollPaneEntradasAlojamientos.setBorder(null);
			scrollPaneEntradasAlojamientos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPaneEntradasAlojamientos.getVerticalScrollBar().setUnitIncrement(16);

			pnReservaDerechaAlojamientos.add(scrollPaneEntradasAlojamientos, BorderLayout.CENTER);

			// AQUI, CREAMOS LOS ALOJAMIENTOS
			crearAlojamientos(agencia.getAlojamientosDisponibles());
		}
		return pnReservaDerechaAlojamientos;
	}

	/**
	 * Método que crea los alojamientos que mostraremos
	 * 
	 * @param listaFiltros
	 */
	private void crearAlojamientos(List<Alojamiento> listaFiltros) {
		JPanel miPanelParaPintar; // Variable para saber dónde pegar las fichas

		if (esReservaAmbos) { // si vamos a reservar tanto entradas como alojamiento
			getBtReservaAmbos().setEnabled(false); // deshabilitamos el boto hasta nueva orden
			getPnReservaAmbosEntradasAlojamiento(); // forzamos a que el panel de ambos exista
			miPanelParaPintar = pnContenedorFichasAmbos; // seleccionamos el panel de reserva de ambos
			((CardLayout) getPnReservaAmbosDerechaCentral().getLayout()).show(getPnReservaAmbosDerechaCentral(),
					"alojamientos ambos"); // y nos movemos hacia el
		} else {
			// si no, hacemos lo mismo pero en el panel de reservas simple.
			getBtReservaEntradas().setEnabled(false);
			getPnReservaDerechaAlojamientos();
			miPanelParaPintar = pnContenedorFichas;
		}
		panelesDinamicos.clear();
		if (miPanelParaPintar == null)
			return;
		miPanelParaPintar.removeAll();

		PanelesDinamicosAlojamientos elemento;
		ButtonGroup boton = new ButtonGroup(); // nuevo boton cada vez, para solo poder seleccionar 1 alojamiento
		if (listaFiltros != null) {
			for (Alojamiento a : listaFiltros) {
				// creamos un nuevo panel dinamico
				elemento = new PanelesDinamicosAlojamientos(this, agencia.dameAlojamiento(a));
				// decimos que el radio boton sea exclusivo
				boton.add(elemento.getRdbtnSeleccion());
				// le metemos un evento, para que cada vez que se haga clic sobre dicho boton y
				// se tenga una fecha, se deje reservar
				elemento.getRdbtnSeleccion().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						comprobarRadioButton();
					}

				});
				miPanelParaPintar.add(elemento); // añadimos los paneles al panel que tengamos
				panelesDinamicos.add(elemento); // añadimos a la lista de paneles el elemento
			}
		}

		miPanelParaPintar.revalidate();
		miPanelParaPintar.repaint();
	}

	protected void comprobarRadioButton() {
		boolean estaActivado = false;

		for (PanelesDinamicosAlojamientos p : panelesDinamicos) {
			if (p.estaSeleccionado()) {
				estaActivado = true;
				break;

			}

		}
		if (esReservaAmbos) {
			// activamos el boton de ambos, si el radioBoton esta seleccionado y existe
			// fecha de entrada
			getBtReservaAmbos().setEnabled(estaActivado && getDateChooserEntradasAmbos().getDate() != null);
		} else {
			// lo mismo, pero en reserva simple
			getBtReservaEntradas().setEnabled(estaActivado && getDateChooserEntradas().getDate() != null);
		}
	}

	@SuppressWarnings("unused")
	private JScrollPane getScrollPaneAlojamientos() {
		if (scrollPaneAlojamientos == null) {
			scrollPaneAlojamientos = new JScrollPane();
			scrollPaneAlojamientos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
			scrollPaneAlojamientos.setBorder(null);
		}
		return scrollPaneAlojamientos;
	}

	private JPanel getPnReservaAmbosDerecha() {
		if (pnReservaAmbosDerecha == null) {
			pnReservaAmbosDerecha = new JPanel();
			pnReservaAmbosDerecha.setLayout(new BorderLayout(0, 0));
			pnReservaAmbosDerecha.add(getPnBotonReservaAmbos(), BorderLayout.SOUTH);
			pnReservaAmbosDerecha.add(getPnReservaAmbosDerechaCentral(), BorderLayout.CENTER);
		}
		return pnReservaAmbosDerecha;
	}

	private JPanel getPnBotonReservaAmbos() {
		if (pnBotonReservaAmbos == null) {
			pnBotonReservaAmbos = new JPanel();
			pnBotonReservaAmbos.setLayout(new GridLayout(0, 1, 0, 0));
			pnBotonReservaAmbos.add(getBtReservaAmbos());
		}
		return pnBotonReservaAmbos;
	}

	private JButton getBtReservaAmbos() {
		if (btReservaAmbos == null) {
			btReservaAmbos = new JButton(textos.getString("btn.reservar.panel.reservas"));
			btReservaAmbos.setFont(new Font("Segoe UI", Font.PLAIN, 20));
			btReservaAmbos.setEnabled(false);
			btReservaAmbos.setFocusable(false);
			btReservaAmbos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cogerAlojamiento();
					mensajeCapacidad();
					mostrarPaginaPago();
					actualizarTxPagoResumenAmbos();
				}
			});

		}
		return btReservaAmbos;
	}

	protected void actualizarTxPagoResumenAmbos() {
		ParqueTematico parque = (ParqueTematico) cbParques.getSelectedItem();
		if (getAlojamiento() != null) {
			// modificamos el campo de texto cuando es reserva de ambos
			String patron = textos.getString("msg.resumen.ambos");
			String mensaje = MessageFormat.format(patron, parque.getDenominacion(), getAlojamiento().getDenominacion());
			txPagoResumen.setText(mensaje);
		}

	}

	private JPanel getPnReservaAmbosDerechaCentral() {
		if (pnReservaAmbosDerechaCentral == null) {
			pnReservaAmbosDerechaCentral = new JPanel();
			pnReservaAmbosDerechaCentral.setFocusable(false);
			pnReservaAmbosDerechaCentral.setLayout(new CardLayout(0, 0));
			pnReservaAmbosDerechaCentral.add(getPnReservaAmbosDerechaOpciones(), "opciones ambos");
			pnReservaAmbosDerechaCentral.add(getPnReservaAmbosEntradasAlojamiento(), "alojamientos ambos");
		}
		return pnReservaAmbosDerechaCentral;
	}

	private JPanel getPnReservaAmbosDerechaOpciones() {
		if (pnReservaAmbosDerechaOpciones == null) {
			pnReservaAmbosDerechaOpciones = new JPanel();
			pnReservaAmbosDerechaOpciones.setFocusable(false);
			pnReservaAmbosDerechaOpciones.setLayout(new GridLayout(0, 1, 0, 0));
			pnReservaAmbosDerechaOpciones.add(getTextAreaAmbosOpciones());
		}
		return pnReservaAmbosDerechaOpciones;
	}

	private JTextArea getTextAreaAmbosOpciones() {
		if (textAreaAmbosOpciones == null) {
			textAreaAmbosOpciones = new JTextArea();
			textAreaAmbosOpciones.setFocusable(false);
			textAreaAmbosOpciones.setWrapStyleWord(true);
			textAreaAmbosOpciones.setText(textos.getString("msg.seleccion.alojamiento"));
			textAreaAmbosOpciones.setLineWrap(true);
			textAreaAmbosOpciones.setFont(new Font("Segoe UI", Font.PLAIN, 20));
			textAreaAmbosOpciones.setEditable(false);
		}
		return textAreaAmbosOpciones;
	}

	private JPanel getPnReservaAmbosEntradasAlojamiento() {
		if (pnReservaAmbosEntradasAlojamiento == null) {
			pnReservaAmbosEntradasAlojamiento = new JPanel();
			pnReservaAmbosEntradasAlojamiento.setFocusable(false);
			pnReservaAmbosEntradasAlojamiento.setLayout(new BorderLayout(0, 0));
			pnReservaAmbosEntradasAlojamiento.add(getScrollPaneAmbos(), BorderLayout.CENTER);
		}
		return pnReservaAmbosEntradasAlojamiento;
	}

	private JScrollPane getScrollPaneAmbos() {
		if (scrollPaneAmbos == null) {

			pnContenedorFichasAmbos = new JPanel();
			pnContenedorFichasAmbos.setFocusable(false);
			pnContenedorFichasAmbos.setBackground(Color.WHITE);
			pnContenedorFichasAmbos.setLayout(new GridLayout(0, 1, 0, 10));

			scrollPaneAmbos = new JScrollPane();
			scrollPaneAmbos.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			scrollPaneAmbos.setFocusable(false);

			scrollPaneAmbos.setViewportView(pnContenedorFichasAmbos);

			scrollPaneAmbos.setBorder(null);
			scrollPaneAmbos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPaneAmbos.getVerticalScrollBar().setUnitIncrement(16);
		}
		return scrollPaneAmbos;
	}

	private void cogerAlojamiento() {
		// para todos los paneles dinamicos, si el radioBoton esta seleccionado,
		// entonces el alojamiento sera ese.
		for (PanelesDinamicosAlojamientos p : panelesDinamicos) {
			if (p.estaSeleccionado()) {
				this.alojamiento = p.getAlojamiento();
				break;
			}

		}
	}

	private Alojamiento getAlojamiento() {
		return this.alojamiento;

	}

	protected JDateChooser getDateChooserEntradas() {
		if (dateChooserEntradas == null) {
			dateChooserEntradas = new JDateChooser();
			dateChooserEntradas.setEnabled(false);
			dateChooserEntradas.setBounds(204, 153, 200, 45);
			dateChooserEntradas.setMinSelectableDate(new Date());
			JTextFieldDateEditor editor1 = (JTextFieldDateEditor) dateChooserEntradas.getDateEditor();
			editor1.setEditable(false);
			dateChooserEntradas.addPropertyChangeListener("date", new java.beans.PropertyChangeListener() {
				@Override
				public void propertyChange(java.beans.PropertyChangeEvent evt) {
					comprobarRadioButton();
				}
			});
		}
		return dateChooserEntradas;
	}

	private JDateChooser getDateChooserEntradasAmbos() {
		if (dateChooserEntradasAmbos == null) {
			dateChooserEntradasAmbos = new JDateChooser();
			dateChooserEntradasAmbos.setEnabled(false);
			dateChooserEntradasAmbos.setBounds(177, 154, 215, 47);
			dateChooserEntradasAmbos.setMinSelectableDate(new Date());
			JTextFieldDateEditor editor2 = (JTextFieldDateEditor) dateChooserEntradasAmbos.getDateEditor();
			editor2.setEditable(false);
			dateChooserEntradasAmbos.addPropertyChangeListener("date", new java.beans.PropertyChangeListener() {
				@Override
				public void propertyChange(java.beans.PropertyChangeEvent evt) {
					comprobarRadioButton();
				}
			});
		}
		return dateChooserEntradasAmbos;
	}

	private JLabel getLbFechaAlojamientoAmbos() {
		if (lbFechaAlojamientoAmbos == null) {
			lbFechaAlojamientoAmbos = new JLabel(textos.getString("lbl.fecha.alojamiento"));
			lbFechaAlojamientoAmbos.setFont(new Font("Segoe UI", Font.BOLD, 13));
			lbFechaAlojamientoAmbos.setBounds(70, 167, 140, 25);
		}
		return lbFechaAlojamientoAmbos;
	}
}
