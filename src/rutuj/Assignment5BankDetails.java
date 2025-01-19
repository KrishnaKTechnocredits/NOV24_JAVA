package rutuj;

public class Assignment5BankDetails {
	
	int bal = 1000;
	int  debitCount;
	int  creditCount; 
	int printStatementCount;
	 
	
	
	
	void debitAmt()
	{
		bal = bal - 200;
		debitCount++;
	}
	void creditAmt()
	{
		bal = bal + 400;
		creditCount++;
	}
	void printStatmentCount()
	{
		System.out.println("remaining Balance is " + bal);
		System.out.println("Amount Debited " + debitCount);
		System.out.println("Amount Credited "+ creditCount);
		System.out.println("printStatementCount "+ printStatementCount);
	}
	public static void main(String[] args)
	{
		Assignment5BankDetails ex6 = new Assignment5BankDetails();
		ex6.debitAmt();
		ex6.creditAmt();
		ex6.creditAmt();
		ex6.creditAmt();
		ex6.printStatmentCount();
	}

}
