package edu.stevens;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import java.util.ArrayList;

public class DrawingArea extends JPanel {
	private ArrayList<Shape> shapes;
	public DrawingArea() {
		shapes = new ArrayList<Shape>();
		shapes.add(new Circle(200,300, 150));
		shapes.add(new Rect(100,50, 200,100));
		shapes.add(new Circle(300,200,100));
		setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		addMouseListener(new MyMouseListener()      );
	}
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.WHITE);
//		for (int i = 0; i < shapes.size(); i++)
//			shapes.get(i).paint(g);
		for (Shape s : shapes) {
			s.paint(g);
		}
	}

	class MyMouseListener implements MouseListener {

		@Override public void mouseClicked(MouseEvent e) {
		}
		@Override public void mousePressed(MouseEvent e) {
			shapes.add(new Circle(e.getX(),e.getY(),100));
			repaint();			
		}
		@Override public void mouseReleased(MouseEvent e) {
			
		}

		@Override public void mouseEntered(MouseEvent e) {
			System.out.println("Mouse entering!");
		}

		@Override public void mouseExited(MouseEvent e) {}
		
		
	}

}

