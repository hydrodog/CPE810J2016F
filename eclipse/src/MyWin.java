import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyWin {
	public static void main(String[] a) {
		JFrame f = new JFrame("hello!");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		Container c = f.getContentPane();
		
		
		JButton b = new JButton("ok");
		c.add(b, BorderLayout.EAST);
		
		JScrollBar sb = new JScrollBar(JScrollBar.VERTICAL, 0, 0,0, 255);
		c.add(sb, BorderLayout.WEST);
		f.setSize(800, 600);
		f.setVisible(true);
		
	}
}
