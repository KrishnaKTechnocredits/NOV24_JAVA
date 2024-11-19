package MadhuraK;

public class Assignment6_BankDetail {

		int balance;
		
		void initbalance(int balance){
			this.balance = balance;
			System.out.println ("Your opening balance is " + balance);
		}
		
		void creditAmt(int creditAmt){
			balance = balance+creditAmt;
			System.out.println ("Your account is credited by " +creditAmt);
		}
		
		void debitAmt(int debitAmt){
			balance=balance-debitAmt;
			System.out.println("Your account is debited by " +debitAmt);
		}
		
		void display(){
			System.out.println ("Your current balance is " + balance);
		}
		
		public static void main (String [] args){
			Assignment6_BankDetail bankdetail = new Assignment6_BankDetail();
			bankdetail.initbalance(5000);
			bankdetail.creditAmt(2000);
			bankdetail.debitAmt(6500);
			bankdetail.creditAmt(1500);
			bankdetail.display();
		}
}
