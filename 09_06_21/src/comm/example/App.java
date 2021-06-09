package comm.example;

public class App{
	
	public static void main(String args[])
	{
		AccountClass account=new AccountClass();
		account.createAccount("acc-1", 200.0, "John",AccountType.SAVINGS );
		if(account.getAccountType()==AccountType.SAVINGS)
		{
			SavingsAccount newAccount  = new SavingsAccount();
			newAccount.createSavingsAccount() ;	
		}
		else if(account.getAccountType()==AccountType.CURRENT)
		{
			CurrentAccount newAcc = new CurrentAccount();
			newAcc.createCurrentAccount();
		}
	
	}

}