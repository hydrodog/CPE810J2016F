public class ObjectReview {

	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1);
		B b1 = new B();
		System.out.println(b1);
	}
}

class A {
  private int x;
	public A(int x) {
		this.x = x;
	}
	public String toString() {
		return x + ""; //SimpleDecimalFormat sdf =
	}
}

class B extends A {
	private int y;
	public B(int x, int y) {
		//illegal, private		this.x = x;
		super(x);
		this.y = y;
	}
	public String toString() {
		return super.toString() + " " +  y;
	}
}





