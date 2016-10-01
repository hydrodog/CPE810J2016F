
public class Fraction4 {
	private int num, den;
	
/*	public Fraction4() {
		num = 0; den = 1;
	}
*/
	public Fraction4(int n, int d) {
		num = n; den = d;
	}
	public static void main(String[] args) {
		Fraction4 a = new Fraction4(1,2);   //   0/0
		System.out.println(a.num + "/" + a.den);
	}
}
