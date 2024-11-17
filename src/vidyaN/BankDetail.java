package vidyaN;

public class BankDetail {
	int balance;
	
	void initBalance(int balance) {
		this.balance = balance;
	}
	
	void creditAmt(int amt) {
		balance = balance + amt;
	}
	
	void debitAmt(int amt) {
		balance = balance - amt;
	}
	
	void display() {
		System.out.println("Current balance is "+balance);
	}
	
	public static void main(String[] a)
	{
		BankDetail bankdetail = new BankDetail();
		bankdetail.initBalance(5000);
		bankdetail.creditAmt(2000);
		bankdetail.debitAmt(6500);
		bankdetail.creditAmt(1500);
		bankdetail.display();
		
	}
	
}
/* 1. creditAmt : which should increase balance 
2. debitAmt : which should deduct balance 
3. display : which should print current balance. 
4. initBalance : which should initiliase your balance with given amount.
 
from main method, calling sequence should be,
initBalance(5000);
creditAmt(2000);
debitAmt(6500);
creditAmt(1500);
display();*/