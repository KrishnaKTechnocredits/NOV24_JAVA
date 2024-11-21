package sindhuP;

public class Bank {
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void printCountInfo(){
		System.out.println(debitCount+" times debitAmt() has been called");
		System.out.println(creditCount+" times creditAmt() has been called");
		System.out.println(printStatementCount+" times printStatement() has been called");
	}
	
	void printStatement(){
		printStatementCount++;
		System.out.println("The remaining balance is "+balance);
	}
	
	void debitAmt(){
		debitCount++;
		balance = balance - 200;
	}
	
	void creditAmt(){
		creditCount++;
		balance = balance + 400;
	}
	
	public static void main(String[] args){
		Bank bankDetail = new Bank();
		bankDetail.debitAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.creditAmt();
		bankDetail.debitAmt();
		bankDetail.printStatement();
		bankDetail.printCountInfo();		
	}
}
