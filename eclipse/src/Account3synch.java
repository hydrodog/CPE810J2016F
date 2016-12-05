
public class Account3synch {
	private double balance;
	
	public Account3synch() { balance = 0; }
	public double getBalance() { return balance; }
	
	public synchronized boolean withdraw(double amt) {
		if (balance >= amt) {
			balance -= amt;
			return true;
		}
		return false;
	}
	public synchronized void deposit(double amt) {
		double temp = balance;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {}
		temp += amt;
		balance = temp;
	}
	public static void main(String[] args) {
		Account3synch a = new Account3synch();
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++)
					a.deposit(1);				
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++)
					a.deposit(1);				
			}
		};
		t2.start();
		
		System.out.println(a.getBalance());
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {}
		
		System.out.println(a.getBalance());
		
	}
}
