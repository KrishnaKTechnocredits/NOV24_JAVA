package rushikesh;

public class Assignment_2 {

	int balance = 1000;

	void creditAmt() {
		balance = balance + 300;
		System.out.println("300rs credit in your account");
	}

	void debitAmt() {
		balance = balance - 500;
		System.out.println("500rs debit from your account");
	}

	void displayTotalBalance() {
		System.out.println("Toatl Balance in your account is " + balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_2 assignment_2 = new Assignment_2();
		System.out.println("Current Balance in your Account is " + assignment_2.balance + "rs");
		assignment_2.creditAmt();
		assignment_2.debitAmt();
		assignment_2.creditAmt();
		assignment_2.displayTotalBalance();
	}

}
