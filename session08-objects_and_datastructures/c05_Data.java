import java.util.*;
public class c05_Data {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(5); // new Integer(5)    public class Integer extends Object { private int value;
		a.add(new Elephant());
    a.add(new JFrame());
		for (int i = 0; i < a.size(); i++) {
			Object obj = a.get(i);
			System.out.println(obj);
		}

		//		ArrayList<Elephant> elephant = new ArrayList<Elephant>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <= 1000; i++)
			numbers.add(i); // new Integer(i)
		for (int i = 0; i < numbers.size(); i++)
			numbers.set(i, numbers.get(i) + 1); // creating a new object, delete old object

		LinkedList<Integer> pi = LinkedList<Integer>();
		pi.add(1);
		pi.add(4);
		pi.add(1);
		pi.addFirst(3); //O(1) regardless of the size of the list

		//		pi.get(3500000000); // very slow
		
		
	}

}

class Elephant {

}
