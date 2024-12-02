package anuja;

/*Assignment - 5 : 13th Nov'2024 (30 mins)
Create a call called BankDetail and print how many time debit, credit and printstatement method has been called.
Instance variable can be balance = 1000, debitCount, creditCount, printStatementCount.
printCountInfo method should show how many times debit,credit and printStatement method has been called.

from main method calling sequence should be as follows:
debitAmt() -> debitCount++, balance = balance - 200;
creditAmt()
creditAmt()
creditAmt()
printStatement() [this method should print remaining balance]
printCountInfo()

output :
remaining balance is 2000
debit method call count -> 1
credit method call count -> 3
printstatment method call count -> 1

Note : debitAmt deduct 200 rs, creditAmt increase balance by 400 rs*/
public class Assignment05 {

	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	int debitAmt = 200;
	int credtAmt = 400;

	void creditAmt() {
		balance = credtAmt + balance;
		creditCount++;
	}

	void deditAmt() {
		balance = balance - debitAmt;
		debitCount++;
	}

	void printStatement() {
		System.out.println("My remaining balance is " + balance);
		printStatementCount++;
	}

	void printCountInfo() {
		System.out.println("debit method executed " + debitCount + " number of times \n");
		System.out.println("credit method executed " + creditCount + " number of times \n");
		System.out.println("printStatementCount method executed " + printStatementCount + " number of times");
	}

	public static void main(String[] args) {
		Assignment05 assignment05 = new Assignment05();
		assignment05.deditAmt();
		assignment05.creditAmt();
		assignment05.creditAmt();
		assignment05.creditAmt();
		assignment05.printStatement();
		assignment05.printCountInfo();

	}

}
