package uo.cpm.modulo;

import java.awt.EventQueue;



import com.formdev.flatlaf.themes.FlatMacLightLaf;

import uo.cpm.modulo.service.Agencia;
import uo.cpm.modulo.ui.VentanaPrincipal;

public class Main {

	/**
	 * Launch the application.
	 */ 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agencia a = new Agencia();
					javax.swing.UIManager.setLookAndFeel(new FlatMacLightLaf()); 
					javax.swing.UIManager.put("Component.hideMnemonics", false);   
					VentanaPrincipal frame = new VentanaPrincipal(a);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
