package pratiksha;

public class Assignment5 {
/*
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

Note : debitAmt deduct 200 rs, creditAmt increase balance by 400 rs 
 */
	int balance=1000;
	int debitAmt;
	int creditAmt;
	int printCountInfo;
	
	void debitAmt(){
		debitAmt++;
		balance=balance - 200;
		
	}
	void creditAmt(){
		creditAmt++;
		balance= balance+400;
	}
		
	void printStatement(){
		printCountInfo++;
		System.out.println("Remaining balance is " +balance);
		
	}
	void printCountInfo(){
		System.out.println("Amount debit call count is--> " +debitAmt);
		System.out.println("Amount credit call count is--> " +creditAmt);
		System.out.println("Print statement count is--> " +printCountInfo);
	}
	
	public static void main(String[]args){
		Assignment5 bank = new Assignment5();
		bank.debitAmt();
		bank.creditAmt();
		bank.creditAmt();
		bank.creditAmt();
		bank.printStatement();
		bank.printCountInfo();
	}
}
