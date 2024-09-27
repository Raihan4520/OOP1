package myPackage.accountManagement;
import myPackage.transectionManagement.Account;

public class Customer implements AccountOperations
{
	private String name;
	private int nid;
	private Account[] accounts=new Account[3];
	static int i=0;

	public void setName(String name)
	{
		this.name=name;
	}
	public void setNid(int nid)
	{
		this.nid=nid;
	}
	public String getName()
	{
		return this.name;
	}
	public int getNid()
	{
		return this.nid;
	}

	public void insertAccount(Account a)
	{
		try
		{
			accounts[i]=a;
			i++;
			System.out.println("Account inserted successfully");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Account insertion failed\nMaximum "+accounts.length+" accounts can be created");
		}
	}
	public void removeAccount(Account a)
	{
		int count=0;
		if(a!=null)
		{
			for(i=0;i<accounts.length;i++)
			{
				if(accounts[i]==a)
				{
					if(i==(accounts.length-1))
					{
						accounts[i]=null;
						count++;
					}
					else
					{
						for(int k=i;k<(accounts.length-1);k++)
						{
							accounts[k]=accounts[k+1];
							if((k+1)==(accounts.length-1))
							{
								accounts[k+1]=null;
							}
						}
						count++;
						break;			
					}
				}
			}
			if(count==0)
			{
				System.out.println("Account number not found");
			}
			else
			{
				System.out.println("Account removed successfully");
			}
		}
	}
	public Account getAccount(int accountNumber)
	{
		try
		{
			for(i=0;i<accounts.length;i++)
			{
				if(accounts[i].getAccountNumber()==accountNumber)
				{
					return accounts[i];
				}
			}
		}
		catch(NullPointerException ex)
		{
			System.out.println("Account number not found");
		}
		return null;
	}
	public void showAllAccounts()
	{
		for(i=0;i<accounts.length;i++)
		{
			if(accounts[i]!=null)
			{
				System.out.println("**************************************************");
				System.out.println("Details of Account "+(i+1)+":");
				System.out.println("Account number: "+accounts[i].getAccountNumber());
				System.out.println("Balance: "+accounts[i].getBalance());
				System.out.println("**************************************************");
			}
			else
			{
				break;
			}
		}
	}
}