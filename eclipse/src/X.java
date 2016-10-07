
public class X {
	private int a;// data should always be private
	public static void main(String[] args) {
		X x1 = null;
		x1 = new X(); // create an object
		x1.a = 5;
		
		Y y1 = new Y();
//		y1.b = 4; // ILLEGAL, b is private in Y
		Z z1 = null;
		//z1 = new Z(); illegal, Z is abstract
	}
}

class Y {
	private int b;
}

abstract class Z {
	public abstract void f();
	
}

class W extends Z {
	public void f() {}
}

