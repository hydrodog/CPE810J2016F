package edu.stevens;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Error2 {
	public static void main(String[] args) {
		JFrame f = new JFrame("error2");
		Container c = f.getContentPane();
		f.addWindowListener(new WL2());
		f.setSize(600, 400);
		f.setVisible(true);
	}
}

class WL2 extends WindowAdapter {
	public void windowClosingx(WindowEvent e) {
		System.out.println("hello");
		
	}
}
	class WL implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
	}
}

