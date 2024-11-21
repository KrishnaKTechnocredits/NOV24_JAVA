package rajashreeA;
class BankOperation{
	
	int balance;
	
	void creditAmt(int creditBalance){
		balance = balance + creditBalance;
		System.out.println(creditBalance + " rs has been credited.");
	}
	
	void debitAmt(int debitBalance){
		if (balance >= debitBalance){
			balance = balance - debitBalance;
			System.out.println(debitBalance + " rs has been debited.");
		}
		else {
			System.out.println("In Sufficient balance, your ask is "+debitBalance+" rs but you only have "+balance+" rs.");
		}
	}
	
	void initBalance(int balance){
		this.balance = balance;
		System.out.println("Balance has been initialized with "+balance+" rs.");
	}
	
	void display(){
		System.out.println("Your current account balance is rs "+balance+".");
	
	}
	
	public static void main(String[] args){
		BankOperation bankOperation= new BankOperation();
		bankOperation.initBalance(5000);
		bankOperation.creditAmt(2000);
		bankOperation.creditAmt(500);
		bankOperation.debitAmt(9500);
		bankOperation.creditAmt(1500);
		bankOperation.debitAmt(6000);
		bankOperation.display();
	}
}
	