package rutuj;

public class Assignment3Bank {
	
	int initialbal =1000;
	int creditAmt = 300;
	int debitAmt = 500;
	int x=0;
	
	void CraditAmt()
	{
		x =initialbal+creditAmt;
		//System.out.println(x);
	}
	void debitAmt()
	{
		x = x-debitAmt;
		//System.out.println(x);
	}
	void display()
	{
		x = x + creditAmt;
		System.out.println("your current balance is " + x);
	}
	
	public static void main(String[] args)
	{
		Assignment3Bank ex4 = new Assignment3Bank();
		ex4.CraditAmt();
		ex4.debitAmt();
		ex4.display();
		
	}
}
