package swapnil;

public class Assignment3 {
	int balance=1000;
	
	void creditAmt(){
		balance=balance+300;
	}
	void debitAmt(){
		balance = balance - 500;
	}
	void display(){
		System.out.println(balance);
	}
	public static void main(String[] args) {
		Assignment3 assignment3 = new Assignment3();
		assignment3.creditAmt();
		assignment3.debitAmt();
		assignment3.creditAmt();
		assignment3.display();
		
	}
}

