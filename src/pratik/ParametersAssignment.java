package pratik;

public class ParametersAssignment {
	int balance=7000;

	void initBalance(int balance) {
		this.balance = balance;
	}

	void crAmt(int amt) {
		balance = balance + amt;
		System.out.println("Current balance after credit is : " + balance);
	}

	void drAmt(int amt) {
		balance = balance - amt;
		System.out.println("Current balance after debit is : " + balance);
	}

	void display() {
		System.out.println("Current balance is " + balance);
	}

	public static void main(String[] a) {
		ParametersAssignment bd = new ParametersAssignment();
		bd.initBalance(6000);
		bd.crAmt(4000);
		bd.drAmt(5500);
		bd.crAmt(2500);
		bd.display();

	}

}
