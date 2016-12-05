import java.util.ArrayList;
import java.util.Vector;

public class LockingSpeed {
	public static void testArrayList(int n) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i)
			a.add(i);
	}
	public static void testVector(int n) {
		Vector<Integer> a = new Vector<Integer>();
		for (int i = 0; i < n; ++i)
			a.add(i);
	}
	
	public static void main(String[] args) {
		int n = 10000000;
		long t0 = System.currentTimeMillis();
		testVector(n);
		
		long t1 = System.currentTimeMillis();
		System.out.println(t1-t0);
		
	}
}
