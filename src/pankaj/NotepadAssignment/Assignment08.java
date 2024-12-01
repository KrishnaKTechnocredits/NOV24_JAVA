package pankaj.NotepadAssignment;

public class Assignment08 {
	int balance;
	
	void initibalance(int balance)
	{
		this.balance=balance;
		System.out.println("The Init Balance is ==>> "+balance);
	}
	void creditbalance(int creditbalance)
	{
	    balance=balance+creditbalance;
		System.out.println(creditbalance+" "+"Rs has been credited to your account");
		display();
	}
	void debitbalance(int debitbalance)
	{
		if(balance>debitbalance)
		{
			balance=balance-debitbalance;
			System.out.println(" " +balance+ "Rs has been debited from your account");
			
		}
		else
		{
			System.out.println("In Sufficient balance, your ask is"+" "+debitbalance+" rs but you only have"+" "+ balance+" rs.");
		}

		
	}
	void display()
	{
		System.out.println("Your current balance is==>>"+balance);
	}
	public static void main(String[] args) 
	{
		Assignment08 BD=new Assignment08();
		BD.initibalance(5000);
		BD.creditbalance(2000);
		BD.creditbalance(500);
		BD.debitbalance(9500);
		BD.creditbalance(1500);
		BD.debitbalance(6000);
		BD.display();
	}
}
