package reshmaB;

//import assignment8.BankOperation;

public class Assignment8_BankOperation {
int balance;
	
	void initBalance(int amt){
		balance=amt;
		System.out.println("Balance has been initialized with "+balance+" rs.");
	}
	
	void creditAmt(int amt){
		balance=balance + amt;
		System.out.println(amt + " rs has been credited.");
	}
	
	void debitAmt(int amt){
		if(balance<amt){
			System.out.println("In Sufficient balance, your ask is "+amt+" rs but you only have "+balance+" rs.");
		}
		
		if(balance>amt){
		balance=balance - amt;
		System.out.println(amt + " rs has been debited.");
		}
	}
	   
	void display (){
		System.out.println("Current balance is " + balance);
	}
	
	public static void main (String[] args){
		Assignment8_BankOperation b=new Assignment8_BankOperation();
		b.initBalance(5000);
		b.creditAmt(2000);
		b.creditAmt(500);
		b.debitAmt(9500);
		b.creditAmt(1500);
		b.debitAmt(6000);
		b.display();
	}
}
