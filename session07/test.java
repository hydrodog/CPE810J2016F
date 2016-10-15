_________________ {
  public void f();
  public void g();
}

_________ class B implements A {
  public void g() { System.out.println("a"); }
}

________ C ___________B {
  public void f() { System.out.println("B"); }
}

public class Test {
  public static void main(String[] a) {
    A a1 = new C();
    a1.f();
  }
