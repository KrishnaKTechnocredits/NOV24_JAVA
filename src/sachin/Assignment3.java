package sachin;

public class Assignment3 {

	int balance = 1000;

	void creditAmount() {

		balance = balance + 300;

		// System.out.println("Your credit amount is :" + balance);

	}

	void debitAmount() {

		balance = balance - 500;

		// System.out.println("Your debit amount is :" + balance);

	}

	void display() {

		System.out.println("Your current balance is :" + balance);

	}

	public static void main(String[] args) {
		Assignment3 bank = new Assignment3();
		bank.creditAmount();
		bank.debitAmount();
		bank.creditAmount();
		bank.display();

	}

}
