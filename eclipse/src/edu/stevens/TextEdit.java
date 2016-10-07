package edu.stevens;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextEdit extends JFrame {
	private JTextArea t;
	public TextEdit() {
		super("Text Editor");
		Container c = getContentPane();
		JButton b = new JButton("Clear");
		t = new JTextArea(30,80);
		c.add(t, BorderLayout.CENTER);
		c.add(b, BorderLayout.WEST);
		b.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						t.setText("");
					}
				} );
		
		
		setSize(800,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextEdit();
	}
}
