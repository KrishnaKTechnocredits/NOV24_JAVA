package vidya;

public class BankOperation {
	int balance;
	
	void initBalance() {
		balance = 5000;
	}
	
	void creditAmt(int amt) {
		balance = balance+amt;
		System.out.println("Balance credited "+balance);
	}
		
	void debitAmt(int amt) {
		balance = balance -amt;
	}
	
	void display() {
		System.out.println("Your current balance is "+balance);
	}
	 
	public static void main(String[] a) {
		BankOperation bankoperation = new BankOperation();
		bankoperation.initBalance();
		bankoperation.creditAmt(2000);
		bankoperation.creditAmt(500);
		bankoperation.debitAmt(9500);
		bankoperation.creditAmt(1500);
		bankoperation.debitAmt(6000);
		bankoperation.display();
		
	}
}
