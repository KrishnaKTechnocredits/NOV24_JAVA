package imranA;

public class Assignment1_Bank {

	int balance=1000;
	
	void creditAmt()
	{
		balance= balance+300;
		System.out.println("Bank Account is credited with Rs.300. Current Balance is Rs." + balance);
	}
	
	void debitAmt()
	{
		balance= balance-500;
		System.out.println("Bank Account is debited with Rs.500. Current Balance is Rs." + balance);
	}
	
	void display()
	{
		System.out.println("Account Balance is Rs." + balance);
	}
	
	public static void main(String[] args) {
		Assignment1_Bank assignment1_Bank1 = new Assignment1_Bank();
		System.out.println("Account Balance is Rs." + assignment1_Bank1.balance);
		assignment1_Bank1.creditAmt();
		assignment1_Bank1.debitAmt();
		assignment1_Bank1.creditAmt();
		assignment1_Bank1.display();
	}
}
