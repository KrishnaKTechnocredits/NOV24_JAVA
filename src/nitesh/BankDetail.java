package nitesh;

public class BankDetail {
	static int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debit() {
		balance = balance-200;
		debitCount++;
	}
	
	void credit() {
		balance = balance +400;
		creditCount++;
	}
	
	void printStatement() {
		System.out.println("Current balance is "+ balance);
		printStatementCount++;
	}
	
	void printCountInfo() {
		System.out.println("Debit method call count ->"+" "+debitCount);
		System.out.println("Credit method call count->"+" "+creditCount);
		System.out.println("PrintStatement method call count->"+" "+printStatementCount);
	}
	public static void main(String[] args) {
		BankDetail bankdetail = new BankDetail();
		bankdetail.debit();
		bankdetail.credit();
		bankdetail.credit();
		bankdetail.credit();
		bankdetail.printStatement();
		bankdetail.printCountInfo();
	}
}
