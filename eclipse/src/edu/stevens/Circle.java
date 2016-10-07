package edu.stevens;

import java.awt.Graphics;

public class Circle extends Shape {
	private double radius;
	public Circle(double x, double y, double radius) {
		super(x,y);
		this.radius = radius;
	}
	
	public void paint(Graphics g) {
		final int d = (int)(2*radius);
		g.drawOval((int)x, (int)y, d, d);
	}
}
