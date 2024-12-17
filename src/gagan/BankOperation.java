package gagan;

public class BankOperation {
	int balance;
	
	void initBalance(int initBalance) {
		balance = initBalance;
		System.out.println("Balance has been initialized with "+balance+" rs.");
	}
	
	void creditAmt(int creditAmt) {
		balance = balance + creditAmt;
		System.out.println(creditAmt+  "rs has been credited.");
		
	}
	
	void debitAmt(int debitAmt) {
		if (balance >= debitAmt) {
			balance = balance - debitAmt;
			System.out.println(debitAmt+  "rs has been debited.");
		} else {
			System.out.println("In Sufficient balance, your ask is "+debitAmt+" but you have only "+balance+"  rs.  ");
		}
		
		
	}
	 
	void display() {
		System.out.println("Your Current Balance is " +balance);
	}
	
public static void main(String[] args) {
	BankOperation b1= new BankOperation();
	b1.initBalance(5000);
	b1.creditAmt(2000);
	b1.creditAmt(500);
	b1.debitAmt(9500);
	b1.creditAmt(1500);
	b1.debitAmt(6000);
	b1.display();
	
}
}