package harishR;

/**
 * Assignment - 8 : 16th Nov'24 (25 mins) [parameter & condition]
 * 
 * Create a class called BankOperation, which should have 4 methods. Set your
 * initial balance by calling initBalance method.
 * 
 * From main method, calling sequence should be, initBalance(5000);
 * creditAmt(2000); creditAmt(500); debitAmt(9500); creditAmt(1500);
 * debitAmt(6000); display();
 * 
 * Output : Balance has been initialized with 5000 rs. 2000 rs has been
 * credited. 500 rs has been credited. In Sufficient balance, your ask is 9500
 * rs but you only have 7500 rs. 1500 rs has been credited. 6000 rs has been
 * debited. Your current balance is 3000 rs.
 */

public class BankOperationAssignment8 {
	int balance;

	void initBalance(int balance) {
		this.balance = balance;
		System.out.println("Your initial account balance is Rs." + balance);
	}

	void debitAmount(int debitAmount) {
		if (debitAmount > balance) {
			System.out.println("Warning!! Insufficient balance. Can't withdraw Rs." + debitAmount
					+ ". Your account balance is Rs. " + balance);
		} else {
			balance -= debitAmount;
			System.out.println(
					"Rs." + debitAmount + " has been debited from your account. Available balance is Rs." + balance);
		}
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
		BankOperationAssignment8 bankDetailsAssignment8 = new BankOperationAssignment8();
		bankDetailsAssignment8.initBalance(5000);
		bankDetailsAssignment8.creditAmount(2000);
		bankDetailsAssignment8.debitAmount(9500);
		bankDetailsAssignment8.debitAmount(6500);
		bankDetailsAssignment8.creditAmount(1500);
		bankDetailsAssignment8.displayBalance();
	}
}
