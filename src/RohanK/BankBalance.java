package rohanK;
class BankBalance {
	
	int Balance;

	void creditAmt(int creditAmt) {
		Balance = Balance + creditAmt ;
	}
	void debitAmt(int debitAmt) {
		Balance = Balance - debitAmt ;
	}
	void display() {
		System.out.println("Totle balance is :"+Balance);
	}
	void initBalance(int Balance) {
		this.Balance = Balance;
	}
	
	public static void main (String[] args) {
		BankBalance bank = new BankBalance();
		bank.initBalance(5000);
		bank.creditAmt(2000);
		bank.debitAmt(6500);
		bank.creditAmt(1500);
		bank.display();
		
	}
}
