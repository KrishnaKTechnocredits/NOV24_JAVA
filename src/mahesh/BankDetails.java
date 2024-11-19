package mahesh;

class BankDetails {

	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;

	void debit() {
		
		balance = balance - 200;
		debitCount++;
	}

	void credit() {
		
		balance = balance + 400;
		creditCount++;
	}
	
	void printStatement() {
		
		System.out.println("Remaining Balance is "+balance);
		printStatementCount++;
		System.out.println("Amount debited "+debitCount+ " times");
		System.out.println("Amount credited "+creditCount+ " times");
		System.out.println("Statement printed "+printStatementCount+ " times");
	}
	
	public static void main(String[] args) {
		
		BankDetails bankDetails = new BankDetails();
		bankDetails.debit();
		bankDetails.credit();
		bankDetails.credit();
		bankDetails.credit();
		bankDetails.printStatement();
	}	
		
}