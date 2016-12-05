
public class Account {
	private double balance;
	
	public Account() { balance = 0; }
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
		Account a = new Account();
		a.withdraw(10);
		for (int i = 0; i < 1000000; i++)
			a.deposit(1);
		System.out.println(a.getBalance());
		for (int i = 0; i < 1000000; i++)
			a.withdraw(1);
		System.out.println(a.getBalance());
		
	}
}
