package comm.example;

public class AccountClass {
   private String id;
   private Double balance;
   private String name;
   
   private AccountType accountType;

public AccountClass() {
	super();
}






public void createAccount(String id, Double balance, String name, AccountType accountType) {
	
	this.id = id;
	this.balance = balance;
	this.name = name;
	this.accountType = accountType;
}



@Override
public String toString() {
	return "AccountClass [id=" + id + ", balance=" + balance + ", name=" + name + ", accountType=" + accountType + "]";
}






public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public Double getBalance() {
	return balance;
}

public void setBalance(Double balance) {
	this.balance = balance;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public AccountType getAccountType() {
	return accountType;
}

public void setAccountType(AccountType accountType) {
	this.accountType = accountType;
}
   
   
}
