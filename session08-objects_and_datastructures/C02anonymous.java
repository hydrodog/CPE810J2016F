public class C01_anonymous {
	public C01_anonymous() {
		JButton b = new JButton("ok");
		b.addActionListener(new ActionListener() { // C01_anonymous$1
				public void actionPerformed(ActionEvent e) {

				}
			} );
		b.addActionListener( new MyListener()  );

	}
	public static void main(String[] a) {
		C01_anonymous c = new C01_anonymous();
	}
}

class MyListener extends ActionListener {
	public void actionPerformed(ActionEvent e) {

	}
}
