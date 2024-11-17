/*
 * Assignment - 6 : 16th Nov'24 (25 mins)

Create a class called BankDetail, which should 4 methods.
Set your initial balance by calling initBalance method.

1. creditAmt : which should increase balance by 300 rs
2. debitAmt : which should deduct balance by 500 rs
3. display : which should print current balance. 
4. initBalance : which should initiliase your balance with given amount.
 
from main method, calling sequence should be,
initBalance(5000);
creditAmt(2000);
debitAmt(6500);
creditAmt(1500);
display();

output : Your current balance is 2000.
 */
package AmrutaK;

public class Assignment_6 {
	int balance;
	 
	void initBalance(int amt){
		balance = amt;
	}
	
	void debitAmt(int amt){
		balance = balance - amt;
	}
	
	void creditAmt(int amt){
		balance = balance + amt;
	}
	
	void printBalance(){
		System.out.println("Your current balance is : "+balance);
	}
	
	public static void main(String[] args){
		Assignment_6 a6 = new Assignment_6();
		a6.initBalance(5000);
		a6.creditAmt(2000);
		a6.debitAmt(6500);
		a6.creditAmt(1500);
		a6.printBalance();
	}
}
