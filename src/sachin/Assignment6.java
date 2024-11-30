package sachin;

class Assignment6 {
	// int initBalance;
	int balance;

	void initBalance(int balance) {

		this.balance = balance;

		System.out.println("Your initBalance balance is : " + balance);
	}

	void creditAmt(int creditamt) {

		balance = balance + creditamt;

		System.out.println("Your credit balance is : " + balance);

	}

	void debitAmt(int debitAmt) {

		balance = balance - debitAmt;
		System.out.println("Your credit balance is : " + balance);

	}

	void display() {

		System.out.println("Your current balance is : " + balance);

	}

	public static void main(String[] args) {

		Assignment6 bankstatement = new Assignment6();
		bankstatement.initBalance(5000);
		bankstatement.creditAmt(2000);
		bankstatement.debitAmt(6500);
		bankstatement.creditAmt(1500);
		bankstatement.display();

	}

}
