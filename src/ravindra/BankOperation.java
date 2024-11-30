package ravindra;
class BankOperation{
	int balance;
	
	void initBalance(int initBalance){
		balance=initBalance;
		System.out.println("Balance has been initialized with "+initBalance+" rs");
	}
	
	void creditAmt(int creditAmt){
		balance=balance+creditAmt;
		System.out.println(creditAmt+" rs has been credited");
	}
	
	void debitAmt(int debitAmt){		
		if(balance<debitAmt){
			System.out.println("In Sufficient balance, your ask is "+debitAmt+" rs but you only have "+balance+" rs.");
		}
		else{
			balance=balance-debitAmt;
			System.out.println(debitAmt+" rs has been debited.");
		}
	}
	
	void display(){
		System.out.println("Your current balance is "+balance+" rs");
	}
	
	public static void main(String []args){
		BankOperation bankOperation=new BankOperation();
		bankOperation.initBalance(5000);
		bankOperation.creditAmt(2000);
		bankOperation.creditAmt(500);
		bankOperation.debitAmt(9500);
		bankOperation.creditAmt(1500);
		bankOperation.debitAmt(6000);
		bankOperation.display();
	}
}
