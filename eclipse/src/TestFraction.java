
public class TestFraction {
	public static void main(String[] args) {
		Fraction a = new Fraction(1, 2);
		System.out.println(a);
		Fraction b = new Fraction(1);
		System.out.println(b);
		Fraction c = a.add(b);
		System.out.println(c);
		Fraction d = a.sub(b);
		System.out.println(d);
		Fraction e = new Fraction(1,3);
		Fraction f = e.neg();  //f=-1/3 e should not change
		System.out.println(f);
	}

}
