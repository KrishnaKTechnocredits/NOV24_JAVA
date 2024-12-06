package imran;

public class Assignment8_BankOperation {

	int balance;
	
	void initBalance(int amt)
	{
		balance= amt;
		System.out.println("balance has been initialised with Rs." +amt );
	}
	
	void creditAmt(int amt)
	{
		balance= balance+amt;
		System.out.println(amt +" rs has been credited.");
	}
	
	void debitAmt( int amt)
	{
		if(balance>=amt)
		{
			balance= balance-amt;
			System.out.println(amt +" rs has been debited.");
		}
		else 
		{
			System.out.println("Insufficient balance : your withdrawal amt is Rs." +amt+" but account balance is Rs." + balance);
		}
	}
	
	void display()
	{
		System.out.println("The Current Balance of Account is Rs." + balance);
	}
	
	public static void main(String[] args) {
		Assignment8_BankOperation assignment8_BankOperation_1 = new Assignment8_BankOperation();
		assignment8_BankOperation_1.initBalance(2000);
		assignment8_BankOperation_1.creditAmt(5000);
		assignment8_BankOperation_1.debitAmt(9500);
		assignment8_BankOperation_1.creditAmt(1500);
		assignment8_BankOperation_1.debitAmt(6000);
		assignment8_BankOperation_1.display();
	}
}
