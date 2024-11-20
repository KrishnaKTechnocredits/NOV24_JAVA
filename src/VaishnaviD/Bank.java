package VaishnaviD;

public class Bank {
	int balance = 1000;

	void creditAmt() {
		balance = balance + 200;
	}


	void debitAmt() {
		balance = balance - 300;

	}

	void display() {
		 System.out.println("Your current balance is: " + balance);

	}

	public static void main(String[] args) {

		Bank B = new Bank();

		B.creditAmt();

		B.debitAmt();

		B.display();

	}
}
