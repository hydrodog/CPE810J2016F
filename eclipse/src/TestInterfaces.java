
public class TestInterfaces {
	public static void main(String[] args) {
		//Cannot create an object of type interface
		//Cannot instantiate an abstract class
		//Illegal: A is interface: A a1 = new A();
		//a1.f();
		
		A a1 = new C();
		a1.f();
		a1.g();
		a1.h();
		
		//A a2 = new B();
		
		A a3 = new D();
		a3.f();
		a3.g();
		a3.h();
	}
}
