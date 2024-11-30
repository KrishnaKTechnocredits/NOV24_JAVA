package pranita;

class BankDetailsAss_5{
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(){
		debitCount++;
		balance = balance - 200;
	}
	
	void creditAmt(){
		creditCount++;
		balance = balance + 400;
	}
	
	void printStatementCount(){
		printStatementCount++;
		System.out.println("Remaining balance is :" + balance);
	}
	
	void printCountInfo(){
		System.out.println("Debit count  is :" + debitCount);
		System.out.println("Credit count  is " + creditCount);
		System.out.println("printStatementCount: is " + printStatementCount);
	}
	
	public static void main (String [] args){
		BankDetailsAss_5 bank = new BankDetailsAss_5();
		bank.debitAmt();
		bank.creditAmt();
		bank.creditAmt();
		bank.creditAmt();
		bank.printStatementCount();
		bank.printCountInfo();
	}
		
}