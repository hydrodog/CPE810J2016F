public class ObjectReview2 {

	public static void main(String[] args) {
		X x1; // ___________
		Y y1; // ___________
		Z z1; // ___________
		x1 = new X(); // ILLEGAL: ABSTRACT CLASS
		y1 = new Y(); // LEGAL
		z1 = new Z();
		y1.f(); // Y
		z1.f(); // Z
		y1.g();
		y1.h();
		x1 = y1;
		x1.f();

		y1 = x1; // ILLEGAL ??  How does this know that x1 is compatible?  Could be pointing to Z
		y1.g();
	}
}

abstract class X {
	public void f();
}

class Y extends X {
	private int y;
	public void f() { System.out.println("Y"); }
	public void g() { System.out.println(y); }
}

class Z extends X {
	private int z;
	public void f() { System.out.println("Z"); }
	public void h() { System.out.println(z); }
}

