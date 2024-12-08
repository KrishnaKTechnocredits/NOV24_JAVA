/* Assingment - 6 : 16th Nov'24 (25 mins)

Create a class called BankDetail, which should 4 methods.
Set your initial balance by calling initBalance method.

1. creditAmt : which should increase balance 
2. debitAmt : which should deduct balance 
3. display : which should print current balance. 
4. initBalance : which should initiliase your balance with given amount.
 
from main method, calling sequence should be,
initBalance(5000);
creditAmt(2000);
debitAmt(6500);
creditAmt(1500);
display();

output : Your current balance is 2000.*/

package nikita.basicdemo;

public class Assignment06 {
	int balance;
	
	void initBalance(int balance) {
		this.balance = balance;	
	}
	
	void creditAmt(int crdAmt) {
		this.balance = balance + crdAmt;
	}
	
	void debitAmt(int debtAmt) {
		this.balance = balance - debtAmt;
	}
	
	void display() {
		System.out.println ("Your current balance is: " + balance);
	}
	
	public static void main(String[] args) {
		Assignment06 a6 = new Assignment06();
		a6.initBalance(5000);
		a6.creditAmt(2000);
		a6.debitAmt(6500);
		a6.creditAmt(1500);
		a6.display();
	}
}
