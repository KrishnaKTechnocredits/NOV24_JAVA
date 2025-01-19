
/*
Create a class called BankOperation, which should 4 methods.
Set your initial balance by calling initBalance method.

1. creditAmt : 
2. debitAmt : 
3. display : 
4. initBalance :

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
 */
package nitesh.conditions;

class BankOperation{
	int balance;

	void initBalance(int initialBal){
		balance = initialBal;
		System.out.println("Balance has been initialized with "+ initialBal+ "rs.");
	}

	void creditAmt(int credit){
		balance = balance + credit;
		System.out.println(credit+" " +" rs has been credited.");
	}

	void debitAmt(int debit){
		if (balance<debit){
			System.out.println("In Sufficient balance, your ask is "+debit+" rs but you only have "+balance+" rs.");

		}else
			balance = balance -debit;
		System.out.println(debit+" "+" rs has been debited.");
	}

	void display(){
		System.out.println("Current balance is: "+" "+ balance + "rs");
	}

	public static void main(String [] args){
		BankOperation bankoperation = new BankOperation();
		bankoperation.initBalance(5000);
		bankoperation.creditAmt(2000);
		bankoperation.creditAmt(500);
		bankoperation.debitAmt(9500);
		bankoperation.creditAmt(1500);
		bankoperation.debitAmt(6000);
		bankoperation.display();
	}

}