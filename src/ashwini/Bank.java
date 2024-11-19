package ashwini;

class Bank{
	int balance=1000;
	
	void creditAmount(){
		balance = balance+300;
	}
	
	void debitAmount(){
		balance=balance-500;
	}
	
	void display(){
		System.out.println("Current Balance is "+ balance);
	}
	
	public static void main(String[] args){
		Bank bank =new Bank();
		bank.creditAmount();
		bank.debitAmount();
		bank.creditAmount();
		bank.display();
	}
}