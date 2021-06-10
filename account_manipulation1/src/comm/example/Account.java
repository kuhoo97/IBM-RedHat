package comm.example;

public abstract class Account {

	protected int accountNumber;
	protected Customer customerObj;
	protected double balance;
	public Account() {
		super();
	}
	public Account(int accountNumber, Customer customerObj, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerObj = customerObj;
		this.balance = balance;
	}
	
	
	
	protected double getBalance() {
		return balance;
	}
	protected void setBalance(double balance) {
		this.balance = balance;
	}
	public abstract boolean withdraw(double amount);
	
}
