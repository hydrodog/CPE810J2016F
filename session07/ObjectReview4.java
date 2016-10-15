public class ObjectReview4 {
	public static void main(String[] a) {
		A a1 = new A(); // class, abstract class, or interface  ==> class (because new)
		
		

	}

}
interface B {
	public void f();
	public void g();
}

abstract class C implements B {
	public void f() {
		System.out.println("test");
	}
}
class D extends C {
	public void g() {

	}
}
class A implements B { // what is B? interface (because of implements)


}




