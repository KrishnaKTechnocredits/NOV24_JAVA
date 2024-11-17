package AmrutaK;

public class Assignment_3 {
		int balance = 20000;
	 
		void debitAmt(){
			balance = balance - 500;
		}
		
		void creditAmt(){
			balance = balance + 300;
		}
		
		void printBalance(){
			System.out.println("Your current balance is : "+balance);
		}
		
		public static void main(String[] args){
			Assignment_3 a3 = new Assignment_3();
			a3.debitAmt();
			a3.creditAmt();
			a3.printBalance();
		}
}
