
public class ThreadTest {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (;;) {
					System.out.println("hello");
					try { 
						Thread.sleep(1000);
					} catch(Exception e) {}
				}
			}			
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				for (;;) {
					System.out.println("bye");
					try { 
						Thread.sleep(2000);
					} catch(Exception e) {}
				}
			}			
		};
		t2.start();
		
	}
}
