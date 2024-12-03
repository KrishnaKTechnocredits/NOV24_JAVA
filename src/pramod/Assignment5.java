/*Assignment - 5 : 13th Nov'2024 (13 mins)
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

Note : debitAmt deduct 200 rs, creditAmt increase balance by 400 rs */

package pramod;

class Assignment5{
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(){
		balance = balance - 200;
		debitCount++;
	}
	
	void creditAmt(){
		balance = balance + 400;
		creditCount++;
	}
	
	void printStatement(){
		System.out.println("Remining balance is: " + balance);
		printStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("Debit method call count is: " + debitCount);
		System.out.println("Credit method call count is: " + creditCount);
		System.out.println("Print Statement method call count is: " + printStatementCount);
	}
	
	public static void main(String[] args){
		Assignment5 bankdetails = new Assignment5();
		bankdetails.debitAmt();
		bankdetails.creditAmt();
		bankdetails.creditAmt();
		bankdetails.creditAmt();
		bankdetails.printStatement();
		bankdetails.printCountInfo();
	}
}
