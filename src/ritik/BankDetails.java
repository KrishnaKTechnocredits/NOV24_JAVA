package ritik;

public class BankDetails {
	int Balance;
	
	void initBalance(int balance) {
		this.Balance = balance;
	}
	
	void creditAmt(int bal1){
		Balance = Balance + bal1;
	}
	
	void debitAmt(int bal2) {
		Balance = Balance - bal2;
	}
	
	void dispaly() {
		System.out.println("Your current balance is "+ Balance);		
	}
	
	public static void main (String[] args) {
		BankDetails bk = new BankDetails();
		bk.initBalance(5000);
		bk.creditAmt(2000);
		bk.debitAmt(6500);
		bk.creditAmt(1500);	
		bk.dispaly();
	}
}

