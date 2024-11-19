package pooja;
public class Assignment_6 {
	int balance;

	void initBalance(int balance) {
		this.balance = balance; 
		System.out.println("Your account balance is "+balance);
	}

	void creditAmt(int cAmt) {
		balance += cAmt;
		System.out.println(cAmt + " rs.credited to your account.");
	}

	void debitAmt(int dAmt) {		
			balance -= dAmt;
			System.out.println(dAmt + " rs.debited from your account.");
	}

	void display() {
		System.out.println("Your account current balance is " + balance +" rs");
	}

	public static void main(String[] args) {
		Assignment_6 assignment_6 = new Assignment_6();
		System.out.println("------------------------------------------");
		assignment_6.initBalance(5000);
		assignment_6.creditAmt(2000);
		assignment_6.debitAmt(6500);
		assignment_6.creditAmt(1500);
		assignment_6.display();
		System.out.println("------------------------------------------");
	}
}