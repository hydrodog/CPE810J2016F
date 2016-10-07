package edu.stevens;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Drawing extends JFrame { // edu.stevens.Drawing
	public Drawing() {
		super("Drawing");
		setSize(800, 600);
		Container c = getContentPane();
		Font f = new Font("Helvetica", Font.BOLD, 25);
		JPanel p = new JPanel();
		p.setBackground(new Color(255, 0, 255));
		p.setLayout(new GridLayout(5, 2, 5, 10));
		for (int i = 0; i < 10; i++) {
			JButton b = new JButton("ok");
			b.setFont(f);
			p.add(b);
		}
		c.add(p, BorderLayout.WEST);
		DrawingArea d = new DrawingArea();
		c.add(d, BorderLayout.CENTER);
		addWindowListener(new MyWindowListener());
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Drawing();
	}
}

class MyWindowListener extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}