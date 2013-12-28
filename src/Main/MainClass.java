package Main;

import Bank1.*;

public class MainClass {
	
	public static void main(String[]args)
	{
		Account accountObject1 = new Account("John Mayor");
		AccountList.addAccount(accountObject1);
		
		Account accountObject2 = new Account(5000, "Mary Roberts");
		AccountList.addAccount(accountObject2);
		
		Atm atmSession1 =  new Atm(1002);
		System.out.println(String.format("%s Accno:%d has balance: %d",accountObject1.getAccname(), 1002, atmSession1.getCustomerAccountbalance()));
		Atm atmSession2 =  new Atm(1003);
		System.out.println(String.format("%s Accno:%d has balance: %d",accountObject2.getAccname(), 1003, atmSession2.getCustomerAccountbalance()));
        Netbank obj1=new Netbank(1002);
       
        System.out.println(String.format("%s Accno:%d has balance: %d",accountObject1.getAccname(), 1002,  obj1.depositAmount(1000)));
	}
	}

