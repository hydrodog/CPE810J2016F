package edu.stevens;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousInner {
	public static void main(String[] args) {
		JFrame f = new JFrame("error2");
		Container c = f.getContentPane();
		f.addWindowListener(   
				new WindowListener() { //AnonymousInner$1
					@Override
					public void windowOpened(WindowEvent e) {
					}
					@Override
					public void windowClosing(WindowEvent e) {
						System.out.println("test");
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
					}
				}
				);
		f.setSize(600, 400);
		f.setVisible(true);
	}
}

