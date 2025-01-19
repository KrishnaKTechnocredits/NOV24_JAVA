package anuja;

/*Bank operations with condition if debit is more than current balance*/
public class Assignment08 {

	int debitcount;
	int creditcount;
	int printcount;
	int debitAmt;
	int creditAmt;
	int balance; // intitial balance

	void setInitBalance(int initBalance) {
		balance = initBalance;
		System.out.println("Balance has been initialized with " +balance+ " rs.\n");
	}

	void creditAmt(int crAmt) {
		balance = crAmt + balance;
		System.out.println(crAmt +" Rs has been credited \n");
	}

	void debitAmt(int dbAmt) {
		if (dbAmt > balance) {
			System.out.println("In Sufficient balance, your ask is " + dbAmt + " rs but you only have " + balance
					+ " rs in your current account \n");
			}
		else
			balance = balance - dbAmt;
		System.out.println(dbAmt+ " Rs has been debited \n");

	}

	void displayActualBalance() {
		System.out.println("---------------------------------------------");
		System.out.println("My current balance is " + balance + " . \n");
	}
	
	public static void main(String[] args) {
		Assignment08 assignment08 = new Assignment08();
		assignment08.setInitBalance(5000);
		assignment08.creditAmt(2000);
		assignment08.creditAmt(500);
		assignment08.debitAmt(9500);
		assignment08.creditAmt(1500);
		assignment08.debitAmt(6000);
		assignment08.displayActualBalance();
	}

}
