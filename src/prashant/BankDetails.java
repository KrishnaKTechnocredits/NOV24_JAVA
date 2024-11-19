package prashant;
class BankDetails{
	int balance=1000;
	int debitCount; 
	int creditCount;
	int printStatementCount;
	
	void debitAmt(){
		balance=balance-200;
		debitCount++;
	}
	
	void creditAmt(){
		balance=balance+400;
		creditCount++;
	}
	
	void printStatement(){
		System.out.println("Your remaining  balance is-:"+balance);	
		printStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("Your debit method call count is-:"+debitCount);
		System.out.println("Your credit  method call count is-:"+creditCount);
		System.out.println("Your printstatement method call count is-:"+printStatementCount);
	}
	
	public static void main(String[] args){
		BankDetails bankdetails=new BankDetails();
		bankdetails.debitAmt();
		bankdetails.creditAmt();
		bankdetails.creditAmt();
		bankdetails.creditAmt();
		bankdetails.printStatement();
		bankdetails.printCountInfo();
	}	
}