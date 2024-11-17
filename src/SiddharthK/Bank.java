package SiddharthK;
// Assignment 3
class Bank{
	int balance = 1000;
	
	void creditAmt(){
		balance = balance + 300;	
	}
	
	void debitAmt(){
		balance = balance - 500;
	}
	
	void display(){
		System.out.println("Your current balance is "+balance);
	}

	public static void main(String[] args){
		Bank bank = new Bank();
		bank.creditAmt();
		bank.debitAmt();
		bank.creditAmt();
		bank.display();
	}
}