package siddharthK;
//Assignment 8
public class BankDetails {
	
	int balance;
	
	void initBalance(int balance) {
		this.balance = balance;
		System.out.println("Balance has been initialized with "+balance+" rs.");
	}
	
	void debitAmt(int amt){
		if(amt<balance) {
		balance = balance - amt;
		System.out.println(amt+" rs has been debited.");
		}else {
		System.out.println("Insufficient balance, your ask is "+amt+"rs but you only have "+balance+" rs.");
		}
	} 
	void creditAmt(int amt){
		balance = balance + amt ;
		System.out.println(amt +" rs has been created");
	}
	void printStatement(){

		System.out.println("Your current balance is "+balance+" rs.");
	}
	
	public static void main(String[] args){
		BankDetails bankdetails = new BankDetails();
		bankdetails.initBalance(5000);
		bankdetails.creditAmt(2000);
		bankdetails.creditAmt(500);
		bankdetails.debitAmt(9500);
		bankdetails.creditAmt(1500);
		bankdetails.debitAmt(6000);
		bankdetails.printStatement();
	}
}
