import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyWin3 extends JFrame {
	public MyWin3(String title) {
		super(title);
		setSize(600,400);
		JButton b = new JButton("ok");
		Container c = this.getContentPane();
		c.add(b, BorderLayout.CENTER);
		b.addActionListener(new MyActionListener());
		setVisible(true);
	}
	public static void main(String[] a) {
		new MyWin3("Test A Button");
		
		
	}

}

class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("hello");
		
	}
}


