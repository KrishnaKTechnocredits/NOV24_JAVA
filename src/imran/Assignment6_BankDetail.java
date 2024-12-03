package imran;

public class Assignment6_BankDetail {
	
	int balance;
	
	void initBalance(int amt)
	{
		balance= amt;
		System.out.println("The Account is Initialised with Rs :" +amt+ ". The Current Balance is " + balance);
	}
	
	void debitAmt(int amt)
	{
		balance= balance-amt;
		System.out.println("The Account is debited with Rs :" +amt+ ". The Current Balance is " + balance);
	}
	
	void creditAmt(int amt)
	{
		balance= balance+amt;
		System.out.println("The Account is credited with Rs :" +amt+ ". The Current Balance is " + balance);
	}
	
	void display()
	{
		System.out.println("Remaing Current Balance is :" +balance);
	}
	
	public static void main(String[] args) {
		Assignment6_BankDetail assignment6_BankDetail_1= new Assignment6_BankDetail();
		assignment6_BankDetail_1.initBalance(5000);
		assignment6_BankDetail_1.creditAmt(2000);
		assignment6_BankDetail_1.debitAmt(6500);
		assignment6_BankDetail_1.creditAmt(1500);
		assignment6_BankDetail_1.display();	
	}
}
