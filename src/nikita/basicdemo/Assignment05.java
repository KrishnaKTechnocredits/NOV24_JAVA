/* Assignment - 5 : 13th Nov'2024 (30 mins)
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

Note : debitAmt deduct 200 rs, creditAmt increase balance by 400 rs  */

package nikita.basicdemo;

public class Assignment05 {
	
	int balance = 1000;
	int debitCount, creditCount, printStatementCount;
	
	void debitAmt() {
		debitCount++;
		balance = balance - 200;
	}
	
	void creditAmt() {
		creditCount++;
		balance = balance + 400;
	}
	
	void printSatement() {
		printStatementCount++;
		System.out.println("Remaining Balance is: " + balance);
	}
	
	void printCountInfo () {
		System.out.println("Debit method call count: " + debitCount);
		System.out.println("Credit method call count: " + creditCount);
		System.out.println("PrintStetement method call count: " + printStatementCount);
	}

	public static void main(String[] args) {
		Assignment05 a5 = new Assignment05();
		a5.debitAmt();
		a5.creditAmt();
		a5.creditAmt();
		a5.creditAmt();
		a5.printSatement();
		a5.printCountInfo();
	}
}
