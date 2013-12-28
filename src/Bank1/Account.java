package Bank1;

public class Account {
private String name;
private int balance;
private int accno;
//private String gender;
private static int counter=1000;
public Account(String name1)
{
	this(0,name1);
	
	
	accno=counter;
	counter++;
	
}
public Account(int bal,String name1)
{
	name=name1;
	balance=bal;
	
	accno=counter;
	counter++;
	
}

public int withdraw(int amount)
{
	if(amount>0&&amount>balance)
	{
		balance=balance-amount;
	}
	return balance;
}
public int deposit(int amount)
{
	if(amount>0)
	{
	balance=balance+amount;
	}
	return balance;
}
public int getBalance()
{
	return this.balance;
}
public int getAccno()
{
	return this.accno;
}
public String getAccname()
{
	return this.name;
}

}
