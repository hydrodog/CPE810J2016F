package edu.stevens;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Drawing extends JFrame { // edu.stevens.Drawing
	private DrawingArea d;
	public Drawing() {
		super("Drawing");
		setSize(800, 600);
		Container c = getContentPane();
		Font f = new Font("Helvetica", Font.BOLD, 25);
		JPanel p = new JPanel();
		p.setBackground(new Color(255, 0, 255));
		p.setLayout(new GridLayout(5, 2, 5, 10));
		JButton b = new JButton("clear");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.clear();
			}});
		p.add(b);
		for (int i = 0; i < 9; i++) {
			b = new JButton("ok");
			b.setFont(f);
			p.add(b);
		}
		c.add(p, BorderLayout.WEST);
		d = new DrawingArea();
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