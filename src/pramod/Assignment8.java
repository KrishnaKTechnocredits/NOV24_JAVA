/*Assignment - 8 : 16th Nov'24 (25 mins) [parameter & condition]

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
}*/

package pramod;

class Assignment8 {
	int balance;
	void initBalance(int balance) {
		this.balance = balance;
		System.out.println("Balance has been initialized with "+balance+" rs.");
	}
	
	void creditAmt(int creditAmt) {
		balance = balance + creditAmt;
		System.out.println(creditAmt+" rs has been credited.");
	}
	
	void debitAmt(int debitAmt) {
		if (balance >= debitAmt) {
			balance = balance - debitAmt;
		} else {
			System.out.println(
					"In Sufficient balance, your ask is " + debitAmt + " rs but you only have " + balance + " rs.");
		}
	}
	
	void display() {
		System.out.println("Your current balance is " + balance);
	}
	
	public static void main(String[] args) {
		Assignment8 bnkDtl = new Assignment8();
		bnkDtl.initBalance(5000);
		bnkDtl.creditAmt(2000);
		bnkDtl.creditAmt(500);
		bnkDtl.debitAmt(9500);
		bnkDtl.creditAmt(1500);
		bnkDtl.debitAmt(6000);
		bnkDtl.display();
	}
}