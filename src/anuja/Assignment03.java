package anuja;

/*Assingment - 3 : 11th Nov'24
Create a class called Bank, which should 3 methods.
Consider your initial balance is 1000 rs.
1. creditAmt : which should increase balance by 300 rs
2. debitAmt : which should deduct balance by 500 rs
3. display : which should print current balance. 

from main method, calling sequence should be,
creditAmt();
debitAmt();
creditAmt();
display;

output : Your current balance is 1100.*/
public class Assignment03 {

	int initialBalance = 1000;
	int currentBalance =initialBalance;
	int creditAmount = 300;
	int debitAmount = 500;

	void creditBalance() {
		currentBalance = currentBalance + creditAmount;
	}
	
	void debitBalance() {
		currentBalance = currentBalance - debitAmount;

	}
	
	void displayCurrentBalance() {
		System.out.println("Current balance is " + currentBalance + ".\n") ;
	}
	
	public static void main(String[] args) {
		Assignment03 assignment03 =new  Assignment03();
		assignment03.creditBalance();
		assignment03.debitBalance();
		assignment03.creditBalance();
		assignment03.displayCurrentBalance();
	}

	
}
