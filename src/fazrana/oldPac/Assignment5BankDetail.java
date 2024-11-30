package fazrana.oldPac;

public class Assignment5BankDetail {
	int balance= 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debit(){
		balance= balance -200;
		System.out.println("Your account is debited for Rs200, current balance is Rs" +balance);
		printStatementCount++;
		debitCount++;
	}
	
	void credit(){
		balance= balance +400;
		System.out.println("Your account is credited with Rs400, current balance is Rs" +balance);
		printStatementCount++;
		creditCount++;
	}
	
	void printStatement(){
		System.out.println("Your account balance is Rs" +balance);
		printStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("Total Debit count is " +debitCount);
		System.out.println("Total Credit count is " +creditCount);
		System.out.println("Total Statement count is " +printStatementCount);
	}
	
	public static void main(String[] args){
		Assignment5BankDetail bankDetail=new Assignment5BankDetail();
		bankDetail.debit();
		bankDetail.credit();
		bankDetail.credit();
		bankDetail.credit();
		bankDetail.printStatement();
		bankDetail.printCountInfo();
	}
}
