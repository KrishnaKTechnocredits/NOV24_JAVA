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

Note : debitAmt deduct 200 rs, creditAmt increase balance by 400 rs */
package SheetalG;
class BankDetail{
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatment;
	
	void debitAmount(int amount){
		balance = balance - amount;
		debitCount++;
	}
	
	void creditAmount(int amount){
		balance = balance + amount;
		creditCount++;
	}
	
	void printStatment(){
		System.out.println("Remaining balance is " + balance);
		printStatment++;
	}
	
	void printCounIf(){
		System.out.println("Debit method call count -> " +debitCount);
		System.out.println("Credit method call count -> " +creditCount);
		System.out.println("printStatment method call count -> " +printStatment);
	}

	public static void main(String[] s){
		BankDetail bankDetail = new BankDetail();
		bankDetail.debitAmount(200);
		bankDetail.creditAmount(400);
		bankDetail.creditAmount(400);
		bankDetail.creditAmount(400);
		bankDetail.printStatment();
		bankDetail.printCounIf();
	}
}