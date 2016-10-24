public class TestB {
	public static void main(String[] args) {
		C c1 = new C(5,4);
		System.out.println(c1);
		B b1 = c1;
		b1.f();
	}

}

interface A {
	public void f();
}

abstract class B implements A {
	private int x;

}

class C extends B{
	private int y;
	public C(int y, int x) { this.y = y ; }
	public void f() { }
	public String toString() { return y + ""; }
}

interface D extends A{
	public void g();
}
