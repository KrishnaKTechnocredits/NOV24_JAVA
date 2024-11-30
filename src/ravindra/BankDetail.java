//Assignment - 5 : 13th Nov'2024 (30 mins)
//Create a class called BankDetail and print how many time debit, credit and printstatement method has been called.
//Instance variable can be balance = 1000, debitCount, creditCount, printStatementCount.
//printCountInfo method should show how many times debit,credit and printStatement method has been called.

//from main method calling sequence should be as follows:
//debitAmt() -> debitCount++, balance = balance - 200;
//creditAmt()
//creditAmt()
//creditAmt()
//printStatement() [this method should print remaining balance]
//printCountInfo()
//output :
//remaining balance is 2000
//debit method call count -> 1
//credit method call count -> 3
//printstatment method call count -> 1
//Note : debitAmt deduct 200 rs, creditAmt increase balance by 400 rs 
package ravindra;
class BankDetail{
	int balance=1000;
	int debitCount;
	int creditCount;
	int printStatmentCount;
	
	void debitAmt(){
		balance=balance-200;
		debitCount++;
	}
	
	void creditAmt(){
		balance=balance+400;
		creditCount++;
	}
	
	void printStatement(){
		System.out.println("Remaining balance is "+balance);
		printStatmentCount++;
	}
	
	void printCountInfo(){
		System.out.println("debit method call count is "+debitCount);
		System.out.println("credit method call count is "+creditCount);
		System.out.println("printStatementCount method call count is "+printStatmentCount);
	}
	
	public static void main(String [] args){
		BankDetail bankDetail=new BankDetail();
		bankDetail.debitAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.printStatement();
		bankDetail.printCountInfo();
	}
}