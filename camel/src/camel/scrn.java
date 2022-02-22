package camel;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class scrn extends JFrame implements WindowListener, WindowFocusListener, WindowStateListener {
	// deals with graphics, name suggests my feelings towards Swing and Awt graphics

	public static JPanel p;
	public static Canvas c;


	public scrn() {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	private void createAndShowGUI() {
		// Create and set up the window.
		main.Screen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		main.Screen.addWindowFocusListener(this);
		main.Screen.addWindowStateListener(this);
		main.Screen.addWindowListener(this);
		main.Screen.setSize(500, 500);
		main.Screen.add(main.cp);
		main.Screen.setVisible(true);
		
	}

	

	public void windowClosed(WindowEvent e) {
		// This will only be seen on standard output.
		//System.out.println("WindowListener method called: windowClosed.");

		// TODO save all of the stuff, IDK for now
	}

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("WindowListener method called: womthing happened.");
		main.cp.paint(getGraphics());
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		// TODO pause screen thing
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("WindowListener method called: closing :( .");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
}
