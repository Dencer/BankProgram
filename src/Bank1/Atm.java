package Bank1;

public class Atm {
	private int accountNumber;
	private Account customerAccount;
	public  Atm(int accountNumber){
		this.accountNumber = accountNumber;
		customerAccount = AccountList.getAccountDetails(this.accountNumber);
	}

	public int getCustomerAccountbalance(){
		return customerAccount.getBalance();
	}

	public int withdrawAmount(int amount){
		return customerAccount.withdraw(amount);
	}
}
