package Bank1;

public class AccountList {
	private static Account[] obj;

	static{
		obj = new Account[10];
	}
	private static int counter=0;
	public static void addAccount(Account acobj)
	{
		if(counter<10)
		{
			obj[counter]=acobj;
			counter++;
		}
	} 

	public static Account getAccountDetails(int accountNumber){
		Account accountObject = null;

		for(int i = 0 ; i < 10; i++)
		{
			if(obj[i].getAccno() == accountNumber)
			{
				accountObject = obj[i];
				break;
			}
			else
			{
				continue;
			}
		}

		return accountObject;
	}

}

