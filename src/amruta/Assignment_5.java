/*
 * Assignment - 5 : 13th Nov'2024 (30 mins)
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

package amruta;

public class Assignment_5 {
	int balance;
	int debitCount;
	int creditCount;
	int printStatementCount;
	 
	void setBalance(int amt){
		balance = amt;
	}
	
	void debitAmt(int amt){
		balance = balance - amt;
		debitCount++;
	}
	
	void creditAmt(int amt){
		balance = balance + amt;
		creditCount++;
	}
	
	void printBalance(){
		printStatementCount++;
		System.out.println("Your current balance is : "+balance);
	}
	
	void display(){
		System.out.println("Debit Count is : "+debitCount);
		System.out.println("Credit Count is : "+creditCount);
		System.out.println("Print Statement Count is : "+printStatementCount);
	}
	
	public static void main(String[] args){
		Assignment_5 bankDetails = new Assignment_5();
		bankDetails.setBalance(1000);
		bankDetails.debitAmt(300);
		bankDetails.creditAmt(500);
		bankDetails.creditAmt(200);
		bankDetails.creditAmt(800);
		bankDetails.debitAmt(1800);
		bankDetails.printBalance();
		bankDetails.display();
	}
}
