/*Create a call called BankDetail and print how many time debit, credit and printstatement method has been called.
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
package nitesh.basicprogram;

class BankDetail1{
	int balance = 1000;
	int creditCount;
	int debitCount;
	int printStatementCount;

	void debit(){
		balance = balance -200;
		debitCount++;
	}

	void credit(){
		balance = balance+400;
		creditCount++;
	}

	void printStatement(){
		System.out.println("Current Balance is :"+ " "+ balance);
		printStatementCount++;
	}

	void printCountInfo(){
		System.out.println("Debit method called: "+ " "+ debitCount +" "+ "Times");
		System.out.println("credit method called: "+ " "+ creditCount +" "+ "Times");
		System.out.println("printStatement method called: "+ " "+ printStatementCount +" "+ "Times");
	}

	public static void main(String[] args){
		BankDetail1 bankdetail1 = new BankDetail1();
		bankdetail1.debit();
		bankdetail1.credit();
		bankdetail1.credit();
		bankdetail1.credit();
		bankdetail1.printStatement();
		bankdetail1.printCountInfo();
	}
}