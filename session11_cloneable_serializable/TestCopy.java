public class TestCopy {
	public static void main(String[] args) {
		int a = 1;
		int b = a; // b is a copy of a
		b = 3; // a does not become 3
		//variables of Object type in Java are pointers
		String c = "abc";
		String d = c; // d is NOT a copy of c  d is the SAME object
		d = "def";

		int[] x = {1, 2, 3, 4};
		int[] y = {1, 2, 3, 4};
		int[] z = x;
		z[0] = 9;
		System.out.println(x[0]);
		Person p = new Person("Yu-Dong", "Yao", 48);
		System.out.println("p=" + p);
		Person p2 = p;
		p2.setFName("Dov"); // wipes out first name (only one object!)
		System.out.println("p=" + p);
		p2.setFName("Yu-Dong"); // fix original name...
		Person p3 = p.clone();
		p3.setFName("Dov");
		p3.setLName("Kruger");
		System.out.println("p=" + p);
		System.out.println("p3=" + p3);
	}


}

class Person implements Cloneable {
	private String fName, lName;
	private int age;
	public Person(String firstName, String lastName, int age) {
		this.fName = firstName; this.lName = lastName;
		this.age = age;
	}
	public void setFName(String name) { this.fName = name; }
	public void setLName(String name) { this.lName = name; }
	public Person clone() {
		try { 
			return (Person)super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		} 
	}
	public String toString() { 
	  return fName + " " + lName;
	}
}





