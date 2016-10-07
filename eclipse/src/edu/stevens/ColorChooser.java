package edu.stevens;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorChooser extends JFrame {
	private JScrollBar r, g, b;
	private JPanel p;
	public ColorChooser() {
		super("Color Chooser");
		Container c = getContentPane();
		r = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255);
		g = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255);
		b = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255);
		r.addAdjustmentListener(new ColorListener());
		g.addAdjustmentListener(new ColorListener());
		b.addAdjustmentListener(new ColorListener());
		p = new JPanel();

		c.setLayout(new GridLayout(1, 4));
		c.add(r);
		c.add(g);
		c.add(b);
		c.add(p);
		setSize(800,700);
		setVisible(true);
	}
	class ColorListener implements AdjustmentListener {
		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			Color c =
					new Color(r.getValue(), g.getValue(), b.getValue());
			p.setBackground(c);
			repaint();
		}
	}
	public static void main(String[] args) {
		new ColorChooser();
	}
}
