package edu.stevens;

public class C04_inheritance {

}

class A {
	private int x;
	protected int y;
	public void f() {}
	int z;   //anyone in this class, or children, or in this package can see it
}

class B extends A {
	private int w; // private
	//x is invisible
	//y is protected for us (we can see it, and our children can see it
	//f is public
}

/*
	Best practices:

	Data should always be PRIVATE
	  to make it accessible you can create get() and set() methods

		if it should be read only, then only expose get() method


		First design public interface (what can your object DO)
		Be STINGY: Don't give more than you need to give

		You can always add methods, but taking them away will break other people's code
		If your child needs something special, give it as a protected method
		Remember, you can have MANY children (it is their decision)
*/
