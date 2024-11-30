package nitesh;

public class Bank {
	static int balance = 1000;
	
	void creditAmt() {
		balance = balance + 300;
	}
	
	void debitAmt() {
		balance = balance -500;
	}
	
	void display() {
		System.out.println("Current Balance in Account is"+" "+balance);
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.creditAmt();
		bank.debitAmt();
		bank.creditAmt();
		bank.display();
	}
}
