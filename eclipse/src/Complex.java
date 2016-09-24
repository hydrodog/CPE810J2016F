
public class Complex {

	public Complex(double r, double i) {}
	
	public static void main(String[] args) {
		Complex c1;   // c1 = null
		Complex c2 = new Complex(); // (0,0)
		Complex c3 = new Complex(1.5, 2.0); // 1.5 + 2.0i
		Complex c4 = new Complex(1.5);      // 1.5 + 0.0i
		Complex c5 = c4.add(c3);			// 3.0 + 2.0i
		Complex c6 = c5.mult(c3);			// 2.25 + 3.0i   
		Complex c7 = c5.neg();              // -3.0 + -2.0i
		System.out.println(c4); // (1.5,0.0)
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		
	}
}
