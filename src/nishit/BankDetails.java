package nishit;

class BankDetails
{
	int balance = 1000;
	int debitCount = 0;
	int creditCount = 0;
	int printStatementCount = 0;
	
	void debitAmount()
	{
		balance -= 200;
		debitCount++;
	}
	
	void creditAmount()
	{
		balance += 400;
		creditCount++;
	}
	
	void printStatement()
	{
		System.out.println("Current account balance is: " + balance);
		printStatementCount++;
	}
	
	void printCountInfo()
	{
		System.out.println("Total debit count is: " + debitCount);
		System.out.println("Total credit count is: " + creditCount);
		System.out.println("Total Statement count is: " + printStatementCount);
	}
	
	public static void main(String[] args)
	{
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitAmount();
		bankDetails.creditAmount();
		bankDetails.creditAmount();
		bankDetails.creditAmount();
		bankDetails.printStatement();
		bankDetails.printCountInfo();
	}
}