
public class Fraction {
	private int num, den;
	//constructor (same name as class)
	public Fraction(int n, int d) {
		num = n;
		den = d;
	}
	public Fraction(int n) {
		num = n;
		den = 1;
	}
	public String toString() {
		return num + "/" + den;
	}
	// lefthand side is called "this"
	public Fraction add(Fraction r) {
		// this.num					r.num
		// this.den					r.den
//		int n = this.num*r.den + r.num*this.den;
//		int d = this.den * r.den;
		
		Fraction ans = new Fraction(this.num*r.den + this.den*r.num, this.den*r.den);	
		return ans;
	}
	public Fraction add2(Fraction r) {
		return new Fraction(this.num*r.den + this.den*r.num, this.den*r.den);	
	}
	public Fraction sub(Fraction r) {
		return new Fraction(this.num*r.den - this.den*r.num, this.den*r.den);	
	}
	public Fraction neg() {
		return new Fraction(-num, den);
	}
}
