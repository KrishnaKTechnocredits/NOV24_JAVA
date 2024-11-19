package titiksha;

public class ParameterAssignment6 {
	int balance;
	
	void initBalance(int balance) {
		this.balance = balance;
	}
	
	void creditAmt(int credit) {
		balance = balance + credit;
	}
	
	void debitAmt(int debit) {
		balance = balance - debit;
	}
	
	void display() {
		System.out.println("Current balance is : " + balance);
	}
	
	public static void main (String[] args) {
		ParameterAssignment6 pararmeterAsignment=new ParameterAssignment6();
		pararmeterAsignment.initBalance(5000);
		pararmeterAsignment.creditAmt(2000);
		pararmeterAsignment.debitAmt(6500);
		pararmeterAsignment.creditAmt(1500);
		pararmeterAsignment.display();
		}
}
