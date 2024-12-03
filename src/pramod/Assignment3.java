/*Assignment 3 - 30/11/2024

Create class called Bank, which has 3 methods
1. creditAmt - Which should increase balance by 300 rs.
2. debitAmt - Which should decrease balance by 500 rs.
3. display - Which should print current balance.
from main method calling sequence should be 
creditAmt();
debitAmt();
creditAmt();
display();

Output => Your current balance is 1100
*/

package pramod;

class Assignment3{
	int balance = 1000;
	
	void creditAmt(){
			balance = balance + 300;
	}
	
	void debitAmt(){
			balance = balance - 500;
	}
	
	void display(){
			System.out.println("Your current balance is " + balance);
	}
	
	public static void main(String[] args){
			Assignment3 bank = new Assignment3();
			bank.creditAmt();
			bank.debitAmt();
			bank.creditAmt();
			bank.display();
	}
}
