//Assignment - 5 : 13th Nov'2024 (30 mins)
//Create a call called BankDetail and print how many time debit, credit and printstatement method has been called.
//Instance variable can be balance = 1000, debitCount, creditCount, printStatementCount.
//printCountInfo method should show how many times debit,credit and printStatement method has been called.
//
//from main method calling sequence should be as follows:
//debitAmt() -> debitCount++, balance = balance - 200;
//creditAmt()
//creditAmt()
//creditAmt()
//printStatement() [this method should print remaining balance]
//printCountInfo()
//
//output :
//remaining balance is 2000
//debit method call count -> 1
//credit method call count -> 3
//printstatment method call count -> 1
//
//Note : debitAmt deduct 200 rs, creditAmt increase balance by 400 rs 

package komal.Basic;

public class Assignment5 {

	static int bal = 1000;
	static int debitCount;
	static int creditCount;
	static int printStatementCount;

	void getDebitAmt(int debitamt) {
		bal = bal - debitamt;
		debitCount++;
	}

	void getCreditAmt(int creditamt) {
		bal = bal + creditamt;
		creditCount++;
	}

	void toPrintStatement() {
		System.out.println("Remaining balance is: " + bal);
		printStatementCount++;
	}

	void toPrintCountInfo() {// to get count of all transactions
		System.out.println("debit method call count -> " + debitCount);
		System.out.println("credit method call count -> " + creditCount);
		System.out.println("printStatement method call count -> " + printStatementCount);

	}

	public static void main(String[] args) {
		Assignment5 bankTransaction = new Assignment5();
		bankTransaction.getDebitAmt(200);
		bankTransaction.getCreditAmt(400);
		bankTransaction.getCreditAmt(400);
		bankTransaction.getCreditAmt(400);
		bankTransaction.toPrintStatement();
		bankTransaction.toPrintCountInfo();
	}

}
