package krishna.Assignments1to10;

public class Assignment5_printCountInfo {
	
	int accBalance = 1000;
	int creditCount = 0;
	int debitCount = 0;
	int printStatmentCount = 0;
	
	void creditAmt(int amt) {
		creditCount++;
		if (amt>0) {
			accBalance += amt;
			System.out.println(amt + " rs has been credited");
		} else
			System.out.println("amount should be greater than 0");
	}
	
	void debitAmt(int amt) {
		debitCount++;
		if (accBalance>amt) {
			accBalance -= amt;
			System.out.println(amt + " rs has been debited");
		} else
			System.out.println("insufficient balance , you are asking for " + amt + " but you only have " + accBalance );
	}
	
	void printStatment() {
		printStatmentCount++;
		System.out.println("your current balance is " + accBalance);
	}
	
	void printCountInfo() {
		System.out.println(" debit count is "+ debitCount);
		System.out.println(" credit count is "+ creditCount);
		System.out.println(" print statment count is "+ printStatmentCount);
	}
	

	public static void main(String[] args) {
		Assignment5_printCountInfo test = new Assignment5_printCountInfo();
		test.debitAmt(200);
		test.creditAmt(400);
		test.creditAmt(400);
		test.creditAmt(400);
		test.printStatment();
		test.printCountInfo();
	}
}
