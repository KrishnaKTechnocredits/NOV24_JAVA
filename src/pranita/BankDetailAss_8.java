package pranita;

class BankDetailAss_8{
	int balance;

	void initBalance(int balance){
		this.balance=balance;
	}
	
	void debitAmt(int debit){
		balance = balance - debit;
	}
	
	void creditAmt(int credit){
		balance = balance + credit;
	}
	
	void display(){
		System.out.println("Your current balance is "+ balance);
	}
	
	public static void main (String [] args){
		BankDetailAss_8 bank = new BankDetailAss_8();
		bank.initBalance(5000);
		bank.creditAmt(2000);
		bank.debitAmt(6500);
		bank.creditAmt(1500);
		bank.display();
	}
		
	}