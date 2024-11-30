package Assignments1to10;

public class Assignment8_BankOperation {
	
	int accBalance;

	void creditAmt(int amt) {
		if (amt>0) {
			accBalance += amt;
			System.out.println(amt + " rs has been credited");
		} else
			System.out.println("amount should be greater than 0");
	}
	
	void debitAmt(int amt) {
		if (accBalance>amt) {
			accBalance -= amt;
			System.out.println(amt + " rs has been debited");
		} else
			System.out.println("insufficient balance , you are asking for " + amt + " but you only have " + accBalance );
	}
	
	void displayBalance() {
		System.out.println("your current balance is " + accBalance);
	}
	
	void initBalance(int amt) {
		accBalance = amt;
		System.out.println("Balance has been initialized with " + amt + " rs");
	}
	
	public static void main(String[] args) {
		Assignment8_BankOperation test = new Assignment8_BankOperation();
		test.initBalance(5000);
		test.creditAmt(2000);
		test.creditAmt(500);
		test.debitAmt(9500);
		test.debitAmt(6000);
		test.displayBalance();
	}
}
