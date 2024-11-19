package nishit;

class BankOperation
{
	int balance;
	
	void initBalance(int balance)
	{
		this.balance = balance;
		System.out.println("Initial Balance: " + balance);
	}
	
	void creditBalance(int creditAmount)
	{
		balance = balance + creditAmount;
		System.out.println(creditAmount + " rs has been credited");
	}
	
	void debitBalance(int debitAmount)
	{
		if(balance >= debitAmount)
		{
			balance = balance - debitAmount;
			System.out.println(debitAmount + " rs has been debited");
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	
	void displayBalance()
	{
		System.out.println("Your current balance is: " + balance);
	}
	
	public static void main(String[] args)
	{
		BankOperation bankOperation = new BankOperation();
		bankOperation.initBalance(5000);
		bankOperation.creditBalance(2000);
		bankOperation.creditBalance(500);
		bankOperation.debitBalance(9500);
		bankOperation.creditBalance(1500);
		bankOperation.debitBalance(6000);
		bankOperation.displayBalance();
	}
}