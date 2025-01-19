package rutuj;

public class Assignment6BankDetail {
	
	//int iniBalance = 5000;
//	int craditAmt = 2000;
	//int debitAmt =1500;;
	int bal;
	
	void InitBaleance(int num)
	{
		bal = num;
	}
	
	void cradirAmt(int cradit)
	{
		bal = bal + cradit ;
	}
	void debitAmt(int debit)
	{
		bal = bal - debit ;
	}
	void display()
	{
		System.out.println("your current balance is "+ bal);
	}
	public static void main(String[] args)
	{
		Assignment6BankDetail ex3 = new Assignment6BankDetail();
		ex3.InitBaleance(5000);
		ex3.cradirAmt(2000);
		ex3.debitAmt(6500);
		ex3.cradirAmt(1500);
		ex3.display();
	}

}
