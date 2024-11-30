package prem;

public class BankOperation {
	int balance;
	
	void debitAmt(int debitAmt) {
		if(this.balance <= debitAmt) {
			System.out.println("In Sufficient balance, your ask is " + debitAmt +" Rs but you only have" + this.balance +" Rs.");
	}else {
		balance = this.balance - debitAmt;
		    System.out.println( debitAmt +"Rs has been debited.");
	      }
	}	
	void creditAmt(int creditAmt) {
		balance = this.balance + creditAmt;
		System.out.println(creditAmt +"Rs has been credited.");
	}
	void display(){
		System.out.println("Your Current balance is Rs : " + balance);
	}
	void initBalance(int balance) {
		this.balance = balance;
		System.out.println("Balance has been initialized with : " + balance +"Rs.");
	}
	public static void main(String[] args){
	    BankOperation bankOperation = new BankOperation();
		bankOperation.initBalance(5000);
		bankOperation.creditAmt(2000);
		bankOperation.creditAmt(500);
	    bankOperation.debitAmt(9500);
		bankOperation.creditAmt(1500);
		bankOperation.debitAmt(6000);
		bankOperation.display();
	}
}

