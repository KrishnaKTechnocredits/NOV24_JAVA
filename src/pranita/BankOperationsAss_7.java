package pranita;

class BankOperationsAss_7{
	int balance;
	
	void initBalance(int initBalance){
		balance=initBalance;
		System.out.println("Balance has been initialized with "+initBalance+" Rs");
		}
		
	void creditAmt(int credit){
		balance = balance + credit;
		System.out.println(credit+" Rs has been credited");
	}
	
	void debitAmt(int debit){
		if(balance<debit){
		System.out.println("Insufficient balance "+debit+" Rs but you only have "+balance+" Rs");
	}
	else{
		balance=balance-debit;
		System.out.println(debit+" Rs has been debited ");
	    }
	}
	void display(){
	 System.out.println("Your current balance is "+balance+" Rs ");
	 }
	 
	 public static void main (String [] args){
		BankOperationsAss_7 bank = new BankOperationsAss_7();
		bank.initBalance(5000);
		bank.creditAmt(2000);
		bank.creditAmt(500);
		bank.debitAmt(9500);
		bank.creditAmt(1500);
		bank.debitAmt(6000);
		bank.display();
	}
}