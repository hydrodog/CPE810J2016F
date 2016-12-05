import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class TestRunnable extends JFrame implements Runnable {
	public void run() {
		Graphics g = getGraphics();
		g.setColor(getForeground());
		Random r = new Random(0);
		int w = getWidth();
		int h = getHeight();
		for (;;) {
			int x1 = r.nextInt(w);
			int y1 = r.nextInt(h);
			int x2 = r.nextInt(w);
			int y2 = r.nextInt(h);
			g.drawLine(x1, y1, x2, y2);
			try { Thread.sleep(100); } catch (Exception e) {}
//			System.out.println(x1+"," + y1 + "," +x2 + "," + y2);
		}
	}
	private Thread t;
	public TestRunnable() {
		super("Animate Window");
		setSize(1024, 768);
		Container c = getContentPane();
		c.setBackground(Color.BLACK);
		c.setForeground(Color.RED);
		t = new Thread(this);
		setVisible(true);
	}
	public void paint(Graphics g) {
		t.start();
	}
	public static void main(String[] args) {
		TestRunnable t = new TestRunnable();
	}
}
