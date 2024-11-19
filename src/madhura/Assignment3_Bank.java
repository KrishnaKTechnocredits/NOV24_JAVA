package madhura;

public class Assignment3_Bank {

		int balance = 1000;
		
		void creditAmt(){
			balance = balance + 300;
		}
		
		void debitAmt(){
			balance = balance - 500;
		}
		
		void printBalance(){
			System.out.println ("Your current balance is " + balance);
		}
		
		public static void main (String [] args){
			Assignment3_Bank bank = new Assignment3_Bank();
			bank.creditAmt();
			bank.debitAmt();
			bank.creditAmt();
			bank.printBalance();
		}
}
