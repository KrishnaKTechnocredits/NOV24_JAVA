package sachin;

public class Assignment5 {
	int balance;
	int debitCount;
	int creditCount;
	int printStatementCount;

	void setBalance(int amt) {
		balance = amt;
	}

	void debitAmt(int amt) {
		balance = balance - amt;
		debitCount++;
	}

	void creditAmt(int amt) {
		balance = balance + amt;
		creditCount++;
	}

	void printBalance() {
		printStatementCount++;
		System.out.println("Your current balance is : " + balance);
	}

	void display() {
		System.out.println("Debit Count is : " + debitCount);
		System.out.println("Credit Count is : " + creditCount);
		System.out.println("Print Statement Count is : " + printStatementCount);
	}

	public static void main(String[] args) {
		Assignment5 bankDetails = new Assignment5();
		bankDetails.setBalance(1000);
		bankDetails.debitAmt(300);
		bankDetails.creditAmt(500);
		bankDetails.creditAmt(200);
		bankDetails.creditAmt(800);
		bankDetails.debitAmt(1800);
		bankDetails.printBalance();
		bankDetails.display();
	}
}
