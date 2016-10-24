public class C00_classes {
	public static void main(String[] a) {
		Outer out = new Outer(5);

	}
}

class Outer { // size = 4 + 8 = 12
	private int x;

	public Outer(int x) { this.x = x; }
	public void f() {
		Inner in = new Inner(3);


	}
	
	private class Inner { // 4 + 12 = 16
		private int y;

		public Inner(int y) { this.y = y; }

		public void f() {
			System.out.println(y);
			System.out.prinltn(x);
		}

	}
}
