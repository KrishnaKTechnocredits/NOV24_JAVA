package swapnil;

public class Assignment5 {
	int balance = 1000;
	int debitCount=0;
	int creditCount=0;
	int printStatementCount=0;
	
	void debitAmt(){
		debitCount++;
		balance = balance - 200;
	}
	void creditAmt(){
		creditCount++;
		balance = balance + 400;
	}
	void printStatement(){
		System.out.println();
		System.out.println("Remainin balance is "+balance);	
		printStatementCount++;
	}
	void printCountInfo(){
		System.out.println("DebitCount is "+debitCount);	
		System.out.println("CreditCount is "+creditCount);
		System.out.println("printStatementCount is "+printStatementCount);
	}
	public static void main (String[] args){
		Assignment5 assignment5 = new Assignment5();
		assignment5.debitAmt();
		assignment5.creditAmt();
		assignment5.creditAmt();
		assignment5.creditAmt();
		assignment5.printStatement();
		assignment5.printCountInfo();
	}

}
