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
package AnujaK;
class Bankoperations{
int balance; //instance variable
	
	public void initialBalance(int amt) {
		balance = amt;
		System.out.println("Balance has been initialized with "+amt+" rs");
		System.out.println("----------------- \n ");
	}// Parameterized method to take initial balance and set as balance.
	
	public void creditAmt(int credit) {
		balance = balance + credit;
		System.out.println(credit+" amount has been credited");
		System.out.println("----------------- \n ");
	}// update the balance after credited amount
	
	public void debitAmt(int debit) {
		if (balance < debit) {
			System.out.println("In Sufficient balance, your ask is"
					+ " "+debit+" rs but you only have "+balance+"rs.");
		}
		else {
		balance = balance - debit;
		System.out.println(debit+ " amount has been debited");
		}
		System.out.println("----------------- \n ");
	}//update the balance after debited amount.
	
	public void display() {
		 System.out.println("your current balance is "+balance+" ." );
	}
	
	public static void main(String [] args) {
		Bankoperations bankdetail =  new Bankoperations();
		bankdetail.initialBalance(5000);
		bankdetail.creditAmt(2000);
		bankdetail.debitAmt(30000);
		bankdetail.creditAmt(1500);
		bankdetail.display();
		
	} 
}
