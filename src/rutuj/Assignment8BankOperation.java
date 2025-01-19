package rutuj;

public class Assignment8BankOperation {
	
	int balance;
	
	void initBalance(int initBalance)
	{
		balance = initBalance;
		System.out.println("Balance has been initalize with "+ balance+  "rs" );
	}
	void creditAmt(int creditAmt)
	{
		balance = balance + creditAmt;
		System.out.println(creditAmt + "rs has been credited");
	}
	void debitAmt(int debitAmt)
	{
		if(debitAmt>balance)
		{
			System.out.println("In Sufficient balance , your aks is " + debitAmt + "rs but only have " + balance + "rs.");
		}
		else
		{
			balance = balance - debitAmt;
			System.out.println(debitAmt +"rs has been debited");
		}
	}
		void display()
		{
			System.out.println("Your current balance is" + balance);
		}
	
public static void main(String[] args)
{
	Assignment8BankOperation ex1 = new Assignment8BankOperation();
	ex1.initBalance(5000);
	ex1.creditAmt(2000);
	ex1.creditAmt(500);
	ex1.debitAmt(9500);
	ex1.creditAmt(1500);
	ex1.debitAmt(6000);
	ex1.display();
}
}
