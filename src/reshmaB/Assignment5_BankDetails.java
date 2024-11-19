package reshmaB;

public class Assignment5_BankDetails {
	int balance=1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void creditAmt(){
		creditCount++;
		balance=balance + 400;
	}
	
	void debitAmt(){
		debitCount++;
		balance=balance - 200;
		}
		
	void printStatement (){
		printStatementCount++;
		System.out.println("Remaining balance is " + balance);
	}
	
	void printCountInfo(){
		System.out.println("debit method call count is " + debitCount);
		System.out.println("credit method call count is " + creditCount);
		System.out.println(" printStatement method call count is " + printStatementCount);
	}
	
	public static void main (String[] args){
		Assignment5_BankDetails b=new Assignment5_BankDetails();
		b.debitAmt();
		b.creditAmt();
		b.creditAmt();
		b.creditAmt();
		b.printStatement(); 
		b.printCountInfo();
	}
}
