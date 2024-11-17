package ImranA;
// Assignment no: 6

public class BankDetail{

	int balance;
	
	void initBalance(int amt)
	{
		balance= amt;
		System.out.println("The Account is initialised with Rs." + amt);
	}
	void creditAmt(int amt)
	{
		balance= balance +amt;
		System.out.println("The Account is Credited with Rs."+ amt +". Current balance is Rs."+balance);
	}
	void debitAmt(int amt)
	{
		balance= balance-amt;
		System.out.println("The Account is debited with Rs."+ amt +". Current balance is Rs."+balance);
	}
	void display()
	{
		System.out.println("The Current Balance of the Account is Rs." + balance);
	}
	public static void main(String[] args) {
		BankDetail bankDetail1= new BankDetail();
		bankDetail1.initBalance(5000);
		bankDetail1.creditAmt(2000);
		bankDetail1.debitAmt(6500);
		bankDetail1.creditAmt(1500);
		bankDetail1.display();
	}
}
