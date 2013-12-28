package Bank1;

public class Netbank {
	private int accountNumber;
	private Account customerAccount;
	
	public Netbank(int accountNumber){
		this.accountNumber = accountNumber;
		customerAccount = AccountList.getAccountDetails(this.accountNumber);
}
	public int getCustomerAccountbalance(){
		return customerAccount.getBalance();
	}
	
	public int withdrawAmount(int amount){
		return customerAccount.withdraw(amount);
	}
	
	public int depositAmount(int amount){
		return customerAccount.deposit(amount);
	}
}
