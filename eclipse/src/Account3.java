
public class Account3 {
	private double balance;
	
	public Account3() { balance = 0; }
	public double getBalance() { return balance; }
	
	public boolean withdraw(double amt) {
		if (balance >= amt) {
			balance -= amt;
			return true;
		}
		return false;
	}
	public void deposit(double amt) {
		balance += amt;
	}
	public static void main(String[] args) {
		Account3 a = new Account3();
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 1000000; i++)
					a.deposit(1);				
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 1000000; i++)
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
