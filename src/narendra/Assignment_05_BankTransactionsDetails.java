package narendra;
/*
Assignment - 5 : 13th Nov'2024 (30 mins)
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

public class Assignment_05_BankTransactionsDetails {
	static int bal = 1000;
	static int debitCount;
	static int creditCount;
	static int printStatementCount;
	
	void getDebitAmt(int debitamt) { // to call debitaAmt method
		bal = bal - debitamt;
		debitCount++;		
	}
	
	void getCreditAmt(int creditamt) { // to call creditAmt method
		bal = bal + creditamt;
		creditCount++;
	}
	
	void toPrintStatement() { // to get balance Statement
		System.out.println("Remaining balance is: ₹" + bal + "/-");
		printStatementCount++;
	}
	
	void toPrintCountInfo() {// to get count of all transactions
		System.out.println("debit method call count -> " + debitCount);
		System.out.println("credit method call count -> " + creditCount);
		System.out.println("printStatement method call count -> " + printStatementCount);
		
	}
	
	public static void main(String[] args) {
		Assignment_05_BankTransactionsDetails banktransaction = new Assignment_05_BankTransactionsDetails();
		banktransaction.getDebitAmt(200);
		banktransaction.getCreditAmt(400);
		banktransaction.getCreditAmt(400);
		banktransaction.getCreditAmt(400);
		banktransaction.toPrintStatement();
		banktransaction.toPrintCountInfo();
	}
	
}