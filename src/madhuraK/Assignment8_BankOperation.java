package MadhuraK;

public class Assignment8_BankOperation {
		
		int balance;
		
		void initbalance(int balance){
			this.balance = balance;
			System.out.println ("Balance has been initialized with Rs." + balance);
		}
		
		void creditAmt(int creditAmt){
			balance = balance+creditAmt;
			System.out.println (creditAmt+ " Rs. has been credited");
		}
		
		void debitAmt(int debitAmt){
			if (balance<debitAmt){
				System.out.println ("Insufficient balance, your ask is Rs. " +debitAmt+ " but you have only Rs." +balance);
			} 
			else {
			balance=balance-debitAmt;
			System.out.println(debitAmt+ " Rs. has been debited");
			}
		}
		
		void display(){
			System.out.println ("Your current balance is " + balance);
		}
		
		public static void main (String [] args){
			Assignment8_BankOperation bankoperation = new Assignment8_BankOperation();
			bankoperation.initbalance(5000);
			bankoperation.creditAmt(2000);
			bankoperation.creditAmt(500);
			bankoperation.debitAmt(9500);
			bankoperation.creditAmt(1500);
			bankoperation.debitAmt(6000);
			bankoperation.display();
		}
}
