/*
 * A class is a concept, a type of object
 * an object is a specific instance (example) of a class
 * an object is concrete (it exists)
 * In pure object-oriented theory a class does not exist
 * In java, classes are also objects
 * 
 * 
 * Messages, methods
 * 
 * In Java (and C++) it is impossible to send a message to an object that does not understand it
 * If you do, the program will not compile
 * 
 * 
 * 
 * 
 * 
 * 
 */


public class Fraction {
	private int num, den;
	public Fraction(int n, int d) {
		num = n;
		den = d;
	}
	
	public void print() {
		System.out.println(num + "/" + den);
	}
	public static void main(String[] a) {
		Fraction f1 = new Fraction(1,2); // f1 = 1/2
		Fraction f2 = new Fraction(1,3); // f2 = 1/3
		f1.print();
		f2.print();
			// object oriented principle: all objects have a unique identity
			
//			Fraction f3 = f1 + f2; // only C++, sorry!
//			Fraction f3 = f1.add(f2);
//			Fraction f4 = add(f1,f2);
//			System.out.println(f4);
			
		}
	

}
