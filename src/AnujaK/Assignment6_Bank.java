/*Assignment - 6 : 16th Nov'24 (25 mins)

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
display();*/

package AnujaK;

public class Assignment6_Bank {
int balance; //instance variable
	
	public void initialBalance(int amt) {
		balance = amt;
	}// Parameterized method to take initial balance and set as balance.
	
	public void creditAmt(int credit) {
		balance = balance + credit;
	}// update the balance after credited amount
	
	public void debitAmt(int debit) {
		balance = balance - debit;
	}//update the balance after debited amount.
	
	public void display() {
		 System.out.println("your current balance is "+balance+" ." );
	}
	
	public static void main(String [] args) {
		Assignment6_Bank bank =  new Assignment6_Bank();
		bank.initialBalance(5000);
		bank.creditAmt(2000);
		bank.debitAmt(6500);
		bank.creditAmt(1500);
		bank.display();
		} 
}
