package roshanM;

class Bank {
	int initalbalance = 1000;
	
	void creditAmt(){
		initalbalance = initalbalance + 300 ;
		System.out.println("your current creditAmt is" +" "+ initalbalance);      //if this statment >>> creditAmt will written
	}
	
	void debitAmt(){
		initalbalance = initalbalance - 500;	
	}
	
	void display () {
		initalbalance = initalbalance ;
	    System.out.println("your current balance is" +" "+ initalbalance);
		
	}
	
	public static void main(String [] args){
		Bank bank = new Bank();
		bank.creditAmt();
		bank.debitAmt();
		bank.creditAmt();
		bank.display();
	}
	
}