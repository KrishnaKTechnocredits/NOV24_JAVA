package nishit;

class Bank
{
	int balance = 1000;
	
	void creditAmount()
	{
		balance = balance + 300;
	}
	
	void debitAmount()
	{
		balance = balance - 500;
	}
	
	void printCurrentBalance()
	{
		System.out.println("Your current balance is: " + balance);
	}
	
	public static void main(String[] args)
	{
		Bank bank = new Bank();
		bank.creditAmount();
		bank.debitAmount();
		bank.creditAmount();
		bank.printCurrentBalance();
	}
}