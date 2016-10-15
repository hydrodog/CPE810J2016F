package edu.stevens;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Error1 {
	public static void main(String[] args) {
		JFrame f = new JFrame("error1");
		Container c = f.getContentPane();
		JButton b = new JButton("ok");
		b.addActionListener( new MyListener() );
		c.add(b, BorderLayout.WEST);
		f.setSize(600, 400);
		f.setVisible(true);
	}
}
abstract class MyListener implements ActionListener {
	public void f(ActionEvent e) {
		System.out.println("hello");
	}
}
