/* Assingment - 8 : 16th Nov'24 (25 mins) [parameter & condition]

Create a class called BankOperation, which should 4 methods.
Set your initial balance by calling initBalance method.

1. creditAmt : which should increase balance by 300 rs
2. debitAmt : which should deduct balance by 500 rs
3. display : which should print current balance. 
4. initBalance : which should initiliase your balance with given amount.
 
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

package nikita;

public class Assignment08 {
	int balance;
	
	void initBalance(int balance) {
		this.balance = balance;
		System.out.println("Balance has been initialized with " + balance + " Rs.");	
	}
	
	void creditAmt(int crdtAmt) {
		balance = balance + crdtAmt;
		System.out.println(crdtAmt + " Rs. has been credited & your current balance is: " + balance + " Rs.");
	}
	
	void debitAmt(int debtAmt) {
		if (debtAmt > balance) {
			System.out.println("Warning!!! Insufficient balance, your ask is " + debtAmt + " Rs. but your balance is: " + balance + " Rs.");
		}
		else {
		balance = balance - debtAmt;
		System.out.println(debtAmt + " Rs. has been debited & your current balance is: " + balance + " Rs.");
		}
	}
	
	void display() {
		System.out.println("Your current balance is: " + balance + " Rs.");
	}

	public static void main(String[] args) {
		Assignment08 a8 = new Assignment08();
		a8.initBalance(5000);
		a8.creditAmt(2000);
		a8.creditAmt(500);
		a8.debitAmt(9500);
		a8.creditAmt(1500);
		a8.debitAmt(6000);
		a8.display();
	}
}
