package ashwini;

class BankDetail2_Assignment6{
	int balance;
	
	void initBalance(){
		balance=5000;
	}
	
	void creditAmt(int amt){
		balance = balance+amt;	
	}
	
	void debitAmt(int amt){
		balance = balance-amt;
	}
	
	void display(){
		System.out.println("Your current Balance is "+balance);
	}
	
	public static void main(String[] args){
		BankDetail2_Assignment6 bankDetails2 =new BankDetail2_Assignment6();
		bankDetails2.initBalance();
		bankDetails2.creditAmt(2000);
		bankDetails2.debitAmt(6500);
		bankDetails2.creditAmt(1500);
		bankDetails2.display();
	}	
}