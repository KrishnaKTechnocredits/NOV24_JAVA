package pratiksha;

public class BankOperationAss_8 {
	int initBalance;
 
	void initBalance(int initBalance) {
	 this.initBalance= initBalance;
	 System.out.println("Initial balance is " +initBalance);
 }
	void debitAmt(int debitAmt) {
	  if(debitAmt<initBalance) {
		  initBalance = initBalance - debitAmt;
		  System.out.println(debitAmt+" rs has been debited.");
	  }
	  else {
		  System.out.println("In sufficient balance, your ask is "+ debitAmt + " " + "rs but you only have "+initBalance +" rs");
		  
	  }
  }
	void creditAmt(int creditAmt) {
		initBalance = initBalance + creditAmt;
		System.out.println(creditAmt +"rs has been created");
		}
	void printStatement() {
		System.out.println("Your current balance is"+ initBalance +"rs");
	}
	
	public static void main(String[] args) {
		BankOperationAss_8 bank= new BankOperationAss_8();
		bank.initBalance(5000);
		bank.creditAmt(2000);
		bank.creditAmt(500);
		bank.debitAmt(9500);
		bank.creditAmt(1500);
		bank.debitAmt(6000);
		bank.printStatement();
	}
	}
 
	

