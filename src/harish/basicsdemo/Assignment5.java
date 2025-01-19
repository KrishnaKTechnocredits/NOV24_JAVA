package harish.basicsdemo;

/**
 * Assignment - 5 : 13th Nov'2024 (30 mins)
 * 
 * Create a call called BankDetail and print how many time debit, credit and
 * printstatement method has been called. Instance variable can be balance =
 * 1000, debitCount, creditCount, printStatementCount. printCountInfo method
 * should show how many times debit,credit and printStatement method has been
 * called.
 * 
 * from main method calling sequence should be as follows: debitAmt() ->
 * debitCount++, balance = balance - 200; creditAmt() creditAmt() creditAmt()
 * printStatement() [this method should print remaining balance]
 * printCountInfo()
 * 
 * output : remaining balance is 2000 debit method call count -> 1 credit method
 * call count -> 3 printstatment method call count -> 1
 * 
 * Note : debitAmt deduct 200 rs, creditAmt increase balance by 400 rs
 * 
 */

class Assignment5 {
	int balance = 1000;
	int debitCount = 0;
	int creditCount = 0;
	int printStatementCount = 0;

	void debitAmount() {
		balance -= 200; // deduct the balance by 200
		debitCount++; // increment the debitCount value on every debit
	}

	void creditAmount() {
		balance += 400; // increase the balance by 400
		creditCount++; // increment the creditCount value on every credit
	}

	void printStatement() {
		System.out.println("Current Account Balance is: " + balance); // print the current account balance
		printStatementCount++; // increment printStatementCount value every time balance is printed
	}

	void printCountInfo() {
		System.out.println("Total Debit Count is: " + debitCount);
		System.out.println("Total Credit Count is: " + creditCount);
		System.out.println("Total Statement Count is: " + printStatementCount);
	}

	public static void main(String[] args) {
		Assignment5 bankDetails = new Assignment5();
		bankDetails.debitAmount();
		bankDetails.creditAmount();
		bankDetails.creditAmount();
		bankDetails.creditAmount();
		bankDetails.printStatement();
		bankDetails.printCountInfo();
	}
}