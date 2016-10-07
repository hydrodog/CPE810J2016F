import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DisplayMouseEvents extends JFrame {
	public DisplayMouseEvents() {
		super("mouse events");
		Container c = getContentPane();
		c.addMouseMotionListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
}
