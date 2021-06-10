package comm.example;

public class Customer {

	private int customerId;
	private String customerName;
	private String emailId;
	public Customer() {
		super();
	}
	
	
	public Customer(int customerId, String customerName, String emailId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.emailId = emailId;
	}


	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", emailId=" + emailId + "]";
	}
	
	
	
}
