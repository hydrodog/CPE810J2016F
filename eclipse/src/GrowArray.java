import java.util.ArrayList;
import java.util.Vector;

public class GrowArray {
	private int[] data;
	
	public GrowArray() {
		data = new int[0];
	}
	
	public void add(int v) {
		int[] temp = data;
		data = new int[temp.length+1];
		for (int i = 0; i < temp.length; i++)
			data[i] = temp[i];
		data[data.length-1] = v;
	}
	
	public String toString() {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < data.length; ++i)
			b.append(data[i]).append(' ');
		return b.toString();		
	}
	public static void testGrow(int n) {
		GrowArray g = new GrowArray();
		for (int i = 0; i < n; i++)
			g.add(i);
		
	}
	public static void main(String[] args) {
		int n = 100000;
		long t0 = System.currentTimeMillis();
		//testGrow(n);
		
		long t1 = System.currentTimeMillis();
		System.out.println(t1-t0);
		GrowArray g = new GrowArray();
		Thread th1 = new Thread() {
			public void run() {
				for (int i = 0; i < 20; i++)
					g.add(i);
			}
		};
		th1.start();
		Thread th2 = new Thread() {
			public void run() {
				for (int i = 0; i < 20; i++)
					g.add(i);
			}
		};
		th2.start();
		System.out.println(g);
	}
}
