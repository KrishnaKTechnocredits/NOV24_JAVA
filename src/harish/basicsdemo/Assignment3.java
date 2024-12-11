package harish.basicsdemo;

/**
 * Assignment - 3 : 11th Nov 2024
 * 
 * Create a class bank having 3 methods, creditAmount, debitAmount and display
 */

class Assignment3 {
	int balance = 1000;

	void creditAmount() {
		balance += 300;
	}

	void debitAmount() {
		balance -= 500;
	}

	void display() {
		System.out.println("Your current balance is " + balance);
	}

	public static void main(String[] args) {
		Assignment3 bank = new Assignment3();
		bank.creditAmount();
		bank.debitAmount();
		bank.creditAmount();
		bank.display();
	}
}