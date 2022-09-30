package application;

import javax.swing.SwingUtilities;

import controller.Controller;

public class App {
	
	public static void main(String []aegs) {
		SwingUtilities.invokeLater(Controller::new);
	}
	
}
