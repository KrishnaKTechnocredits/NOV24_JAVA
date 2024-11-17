package kishorR;

public class Assignment3_Bank {
int balance = 1000;
	
	void creditAmt(){
		balance = balance + 300;
	}
	
	void debitAmt(){
		balance = balance - 500;
	}
	
	void displayAmt(){
		System.out.println("Cureent balance is " + balance);
	}
	
	public static void main(String[] args){
		Assignment3_Bank bank = new Assignment3_Bank();
		bank.creditAmt();
		bank.debitAmt();
		bank.creditAmt();
		bank.displayAmt();
		System.out.println("second commit practise");
	}

}
