package ashwini;
class BankOperation_Assignment8{
	int balance;
	
	void initBalance(){
		balance=5000;
	}
		
	void creditAmt(int amt){
		balance = balance+amt;
		System.out.println(amt + " rs has been credited.");		
	}
	
	void debitAmt(int amt){
		if(balance>amt){
			balance = balance-amt;
			System.out.println("Your balance is debited successfully");
		}else
		{
			System.out.println("In Sufficient balance, your ask is "+amt+" rs but you only have "+balance+" rs.");
		}
	}
	
	void display(){
		System.out.println("Your current Balance is "+balance);
	}
	public static void main(String[] args){
		BankOperation_Assignment8 bankOperation =new BankOperation_Assignment8();
		bankOperation.initBalance();
		bankOperation.creditAmt(2000);
		bankOperation.creditAmt(500);
		bankOperation.debitAmt(9500);
		bankOperation.creditAmt(1500);
		bankOperation.debitAmt(6000);
		bankOperation.display();
	}
}

public class BankOPerationAssignment8 {

}
