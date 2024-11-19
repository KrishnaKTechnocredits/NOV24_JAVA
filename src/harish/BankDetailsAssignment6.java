package harish;

/**
 * Assignment - 6 : 16th November 24
 * 
 * Create a class called BankDetail which should have 4 methods - initBalance,
 * creditAmount, debitAmount, displayBalance. Set your initial balance by
 * calling initBalance method.
 * 
 * From main method, calling sequence should be, initBalance(5000);
 * creditAmt(2000); debitAmt(6500); creditAmt(1500); display();
 * 
 * Output : Your current balance is 2000.
 */

public class BankDetailsAssignment6 {
	int balance;

	void initBalance(int balance) {
		this.balance = balance;
		System.out.println("Your initial account balance is Rs." + balance);
	}

	void debitAmount(int debitAmount) {
		balance -= debitAmount;
		System.out.println(
				"Rs." + debitAmount + " has been debited from your account. Available balance is Rs." + balance);
	}

	void creditAmount(int creditAmount) {
		balance += creditAmount;
		System.out.println(
				"Rs." + creditAmount + " has been credited to your account. Available balance is Rs." + balance);
	}

	void displayBalance() {
		System.out.println("Your account balance is Rs." + balance);
	}

	public static void main(String[] args) {
		BankDetailsAssignment6 bankDetailsAssignment6 = new BankDetailsAssignment6();
		bankDetailsAssignment6.initBalance(7000);
		bankDetailsAssignment6.creditAmount(2000);
		bankDetailsAssignment6.debitAmount(6500);
		bankDetailsAssignment6.creditAmount(1500);
		bankDetailsAssignment6.displayBalance();
	}
}
