public class C01_classes {
	public static void main(String[] a) {
		Outer out = new Outer(5);
		Outer.Inner in = new Outer.Inner(4);

	}
}

class Outer { // size = 4 + 8 = 12
	private int x;

	public Outer(int x) { this.x = x; }
	public void f() {
		Inner in = new Inner(3);


	}
	// a static inner class is just like an outer class Outer.Inner
	public static class Inner { // 4 + 8 = 16 
		private int y;

		public Inner(int y) { this.y = y; }

		public void f() {
			System.out.println(y);
			System.out.prinltn(x);
		}

	}
}
