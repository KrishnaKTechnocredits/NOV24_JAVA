package siddharthK;
// Assignment 5
class BankDetail{
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmount(){
		debitCount++;
		balance = balance - 200;
	}
	
	void creditAmount(){
		creditCount++;
		balance = balance + 400;
	}
	
	void printStatement(){
		printStatementCount++;
		System.out.println("Remaining Balance is "+balance);
	}
	
	void printCountInfo(){
		System.out.println("debit method call count -> "+debitCount);
		System.out.println("credit method call count -> "+creditCount);
		System.out.println("printstatement method call count -> "+printStatementCount);
	}
	
	public static void main(String[] args){
		BankDetail bankDetail = new BankDetail();
		bankDetail.debitAmount();
		bankDetail.creditAmount();
		bankDetail.creditAmount();
		bankDetail.creditAmount();
		bankDetail.printStatement();
		bankDetail.printCountInfo();
	}
}