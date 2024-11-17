package PoojaR;
public class Assignment_8 {
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
		if (balance >= dAmt) {
			balance -= dAmt;
			System.out.println(dAmt + " rs.debited from your account.");
		} else {
			System.out.println("You have insufficient Account balance !!!");
		}
	}

	void display() {
		System.out.println("Your account current balance is " + balance +" rs");
	}

	public static void main(String[] args) {
		Assignment_8 assignment_8 = new Assignment_8();
		System.out.println("------------------------------------------");
		assignment_8.initBalance(5000);
		assignment_8.creditAmt(2000);
		assignment_8.creditAmt(500);
		assignment_8.debitAmt(9500);
		assignment_8.creditAmt(1500);
		assignment_8.debitAmt(6000);
		assignment_8.display();
		System.out.println("------------------------------------------");
	}
}