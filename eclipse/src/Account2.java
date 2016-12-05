
public class Account2 {
	private double balance;
	
	public Account2() { balance = 0; }
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
		Account2 a = new Account2();
		a.withdraw(10);
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 1000000; i++)
					a.deposit(1);				
			}
		};
		t1.start();
		System.out.println(a.getBalance());
		for (int i = 0; i < 1000000; i++)
			a.withdraw(1);
		System.out.println(a.getBalance());
		
	}
}
