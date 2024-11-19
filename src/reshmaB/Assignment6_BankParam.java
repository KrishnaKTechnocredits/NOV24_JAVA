package reshmaB;

//import assignment6.BankDetails1;

public class Assignment6_BankParam {
int balance;
	
	void initBalance(int amt){
		balance=amt;
	}
	
	void creditAmt(int amt){
		balance=balance + amt;
	}
	
	void debitAmt(int amt){
		balance=balance - amt;
	}
		
	void display(){
		System.out.println("Current balance is " + balance);
	}
	
	public static void main (String[] args){
		Assignment6_BankParam b=new Assignment6_BankParam();
		b.initBalance(5000);
		b.creditAmt(2000);
		b.debitAmt(6500);
		b.creditAmt(1500);
		b.display(); 
	}
}
