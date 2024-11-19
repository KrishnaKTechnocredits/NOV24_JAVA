package rushikesh;

public class BankOperation {
	
	int balance;
	
	void initBalance(int balance) {
		this.balance=balance;
		System.out.println("Balance has been initialized with "+balance+" rs.");
	}
	
	void creditAmt(int credit) {
		balance=balance+credit;
		System.out.println(credit+ "rs has been credited");	
	}
	
	void debitAmt(int debit) {
		if(balance>debit)
		{
			balance=balance-debit;
			System.out.println(debit+" rs has been debited");
		}
		else 
		{
			System.out.println("In Sufficient balance, your ask is "+debit+ "rs but you only have "+balance+" rs.");
		}
	}
	
	void display() {
		System.out.println("Your current balance is "+balance+" rs.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankOperation bankopretion=new BankOperation();
		bankopretion.initBalance(5000);
		bankopretion.creditAmt(2000);
		bankopretion.creditAmt(500);
		bankopretion.debitAmt(9500);
		bankopretion.creditAmt(1500);
		bankopretion.debitAmt(6000);
		bankopretion.display();
	}

}
