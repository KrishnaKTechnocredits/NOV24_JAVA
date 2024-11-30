package narendra;
/*
Assignment - 8 : 16th Nov'24 (25 mins) [parameter & condition]

Create a class called BankOperation, which should 4 methods.
Set your initial balance by calling initBalance method.

1. creditAmt : which should increase balance by 300 rs
2. debitAmt : which should deduct balance by 500 rs
3. display : which should print current balance. 
4. initBalance : which should initialize your balance with given amount.
 
from main method, calling sequence should be,
initBalance(5000);
creditAmt(2000);
creditAmt(500);
debitAmt(9500);
creditAmt(1500);
debitAmt(6000);
display();

output : 
Balance has been initialized with 5000 rs.
2000 rs has been credited.
500 rs has been credited.
In Sufficient balance, your ask is 9500 rs but you only have 7500 rs.
1500 rs has been credited.
6000 rs has been debited.
Your current balance is 3000 rs.

Hint : System.out.println("In Sufficient balance, your ask is "+amt+" rs but you only have "+balance+" rs.")
void creditAmt(int amt){
	System.out.println(amt + " rs has been credited.");
}
*/

public class Assignment_08_BankOperations {
	static int balance;
	
	void getInitBal(int initBal) { // to get initial balance
		if(initBal >= 0) {
			balance = initBal;
			System.out.println("Balance has been initialized with " + balance + "₹");
		}
		else {
			System.out.println("Initial amount is not correct");
		}
			
	}
	
	void getDebitAmt(int debitAmt) {// to call debitaAmt method
		if(debitAmt <= balance ) {
			balance = balance - debitAmt;
			System.out.println(debitAmt + "₹ has been debited\"");
		}
		else {
			System.out.println("Insufficient balance, your ask is " + debitAmt + "₹" + " but you only have " + balance + "₹ in your account.");
		}
		
	}
	
	void getCreditAmt(int creditAmt) { // to call creditAmt method
		if(creditAmt > 0 ) {
			balance = balance + creditAmt;
			System.out.println(creditAmt +"₹ has been credited");
		}
		else {
			System.out.println("Incorrect credit amount has been entered");
		}
	}
	
	void toDisplayBalance() { // to display total remaining balance
		System.out.println("Your current balance is: " + balance +"₹");
	}
	
	public static void main(String[] args) {
		Assignment_08_BankOperations bankoperations = new Assignment_08_BankOperations();
		bankoperations.getInitBal(5000);
		bankoperations.getCreditAmt(2000);
		bankoperations.getCreditAmt(500);
		bankoperations.getDebitAmt(9500);
		bankoperations.getCreditAmt(1500);
		bankoperations.getDebitAmt(6000);
		bankoperations.toDisplayBalance();

	}
	
}