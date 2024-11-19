package nishitP;

class BankDetail
{
	int balance;
	
	void initBalance(int balance)
	{
		this.balance = balance;
		System.out.println("Your initial balance is: " + balance);
	}
	
	void creditAmount(int amount)
	{
		balance = balance + amount;
		System.out.println(amount + " has been credited to your account");
	}
	
	void debitAmount(int amount)
	{
		balance = balance - amount;
		System.out.println(amount + " has been debited to your account");
	}
	
	void displayCurrentBalance()
	{
		System.out.println("Your current balance is: " + balance);
	}
	
	public static void main(String[] args)
	{
		BankDetail bankDetail = new BankDetail();
		bankDetail.initBalance(5000);
		bankDetail.creditAmount(2000);
		bankDetail.debitAmount(6500);
		bankDetail.creditAmount(1500);
		bankDetail.displayCurrentBalance();
	}
}