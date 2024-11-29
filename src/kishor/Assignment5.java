package kishor;

public class Assignment5 {
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(){
		debitCount = debitCount+1; //for my understanding-same as post increament statement
		balance = balance-200;
	}
	
	void creditAmt(){
		creditCount++;
		balance = balance + 400;
	}
	
	void printStatement(){
		printStatementCount++;
		System.out.println("The remaining account balance is " + balance);
	}
	
	void printCountInfo(){
		System.out.println("The total debit count is "+ debitCount);
		System.out.println("The total credit count is " + creditCount);
		System.out.println("The total print statement count is " + printStatementCount);
	}
	
	public static void main(String[] args){
		Assignment5 bankdetails = new Assignment5();
		bankdetails.debitAmt();
		bankdetails.creditAmt();
		bankdetails.creditAmt();
		bankdetails.creditAmt();
		bankdetails.printStatement();
		bankdetails.printCountInfo();
	}

}
