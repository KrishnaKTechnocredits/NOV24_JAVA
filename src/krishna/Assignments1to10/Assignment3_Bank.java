package Assignments1to10;

public class Assignment3_Bank {

	int accBalance = 1000;
	
	void debitAmt(int amt) {
		if(amt<accBalance) {
			System.out.println(" your remaining account balance is " + (accBalance-amt));
			System.out.println("hope you enjoy our service");
		}else {
			System.out.println("insufficient fund");
		}
	}
	
	void creditAmt(int amt) {
		if(amt>=0) {
			System.out.println(" your account balance is " + (accBalance+amt));
			System.out.println("hope you enjoy our service");
		}else {
			System.out.println("amount should be more than 0");
		}
	}
	
	
	public static void main(String[] args) {
		Assignment3_Bank test = new Assignment3_Bank();
		test.creditAmt(500);
		test.debitAmt(1200);
		test.creditAmt(300);
		test.debitAmt(700);
		test.creditAmt(0);
		
	}
}
