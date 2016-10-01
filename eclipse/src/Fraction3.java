public class Fraction3 {
	private int num, den;
	public Fraction3(int n, int d) {
		num = n;
		den = d;
	}
	
	public String toString() {
		return num + "/" + den;
	}

	public Fraction3 add(Fraction3 r) {
		return new Fraction3(num * r.den + r.num * den, den * r.den);
	}
	public static void main(String[] a) {
		Fraction3 f1 = new Fraction3(1,2); // f1 = 1/2
		Fraction3 f2 = new Fraction3(1,3); // f2 = 1/3
		System.out.println(f1);
		System.out.println(f2);
		Fraction3 f3 = f1.add(f2);
		System.out.println(f3);
	}

}
