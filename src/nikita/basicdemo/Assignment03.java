
/* Create a class called Bank, which should 3 methods.
Consider your initial balance is 1000 rs.
1. creditAmt : which should increase balance by 300 rs
2. debitAmt : which should deduct balance by 500 rs
3. display : which should print current balance. 
from main method, calling sequence should be,
creditAmt();
debitAmt();
creditAmt();
display;
output : Your current balance is 1100. */

package nikita.basicdemo;

public class Assignment03 {
	int balance = 1000;
	
	void creditAmt() {
		balance = balance + 300;
	}
	
	void debitAmt () {
		balance = balance - 500;
	}

	void display() {
		System.out.println ("Your current balance is: " + balance);
	}
	
	public static void main(String[] args) {
		Assignment03 a03 = new Assignment03();
		a03.creditAmt();
		a03.debitAmt();
		a03.creditAmt();
		a03.display();
	}
}
