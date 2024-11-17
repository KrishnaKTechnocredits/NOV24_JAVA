package VrushaliK;

public class BankDetail {
	int balance;
	
	void initBalance (int balance)
	{
		this.balance=balance;
		System.out.println("Your Initial Balance is ="+this.balance);
		
	}
	
	void creditAmt (int credAmt)
	{
		balance=balance+credAmt;
		System.out.println(credAmt+" credted in your account.");
		System.out.println("Your currnt balance is"+balance);
	}
	
	void debitAmt  (int debAmt)
	{
		balance=balance-debAmt;
		System.out.println(debAmt+" debited from your aacount.");
		System.out.println("Your currnt balance is"+balance);
	}
	void display()
	{
		System.out.println("Your currnt balance is"+balance);
	}
	public static void main(String[] args) 
	{
		BankDetail bankDetails=new BankDetail();
		
		bankDetails.initBalance(5000);
		bankDetails.creditAmt(2000);
		bankDetails.debitAmt(6500);
		bankDetails.creditAmt(1500);
		bankDetails.display();
	}
	   
}
