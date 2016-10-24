public class C03_interfaces {
	public static void main(String [] args) {


	}
}

interface A {
	public void f();
}

class B implements A{
	public void f() {

	}
	
}
	
abstract class C {
	public abstract void f();
}

class D extends C {
  public void f() {

	}
}

interface E extends A {
	public void g();
}

class F implements E {
	public void f() {}
	public void g() {}

}




