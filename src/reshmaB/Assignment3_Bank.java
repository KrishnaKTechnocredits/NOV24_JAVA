package reshmaB;

public class Assignment3_Bank {
int balance=1000;
	
	void creditAmt(){
		balance=balance + 300;
	}
	
	void debitAmt(){
		balance=balance - 500;
		}
		
	void display(){
		System.out.println("Current balance is " + balance);
	}

	public static void main (String[] args){
		Assignment3_Bank b=new Assignment3_Bank();
		b.creditAmt();
		b.debitAmt();
		b.creditAmt();
		b.display();
	}
}
