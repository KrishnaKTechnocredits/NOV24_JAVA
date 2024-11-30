package rushikesh;

public class Assignment_5 {

	int balance = 1000;
	int debitCount = 0;
	int creditCount = 0;
	int printStatementCount = 0;

	void debiAmt() {
		balance = balance - 200;
		debitCount++;
	}

	void creditAmt() {
		balance = balance + 400;
		creditCount++;
	}

	void printStatement() {
		System.out.println("Remaining Balance is " + balance + "rs");
		printStatementCount++;
	}

	void printInfo() {
		System.out.println("debitAmt method call count is " + debitCount);
		System.out.println("creditAmt method call count is " + creditCount);
		System.out.println("printStatement method call count is " + printStatementCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_5 assignment_5 = new Assignment_5();
		assignment_5.debiAmt();
		assignment_5.creditAmt();
		assignment_5.creditAmt();
		assignment_5.creditAmt();
		assignment_5.debiAmt();
		assignment_5.printStatement();
		assignment_5.printInfo();
	}

}
