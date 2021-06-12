package comm.example;

public class SavingsAccount extends Account {

   private double minimumBalance;

	public SavingsAccount() {
	super();
}

	public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}

	@Override
	public boolean withdraw(double amount) {
	if((getBalance()-amount)> minimumBalance)
	{
		this.balance = getBalance() - amount;
	    return true;
	}
	else
		return false;
	}
	
	
}
