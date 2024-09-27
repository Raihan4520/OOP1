package myPackage.accountManagement;
import myPackage.transectionManagement.Account;

interface AccountOperations
{
	void insertAccount(Account a);
	void removeAccount(Account a);
	Account getAccount(int accountNumber);
	void showAllAccounts();
}