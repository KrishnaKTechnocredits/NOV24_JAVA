package RohanK;

public class BankDetails {
	
		int initBalance;
		
		void initBalance(int initBalance) {
			this.initBalance = initBalance;
			System.out.println("Initial balance is "+initBalance);
		}
		
		void debitAmt(int debitAmt){
			if(debitAmt<initBalance) {
			initBalance = initBalance - debitAmt;
			System.out.println(debitAmt+" rs has been debited.");
			}else {
			System.out.println("In Sufficient balance, your ask is "+ debitAmt +" "
					+ "rs but you only have "+initBalance +" rs.");
			}
		} 
		void creditAmt(int creditAmt){
			initBalance = initBalance + creditAmt ;
			System.out.println(creditAmt +" rs has been created");
		}
		void printStatement(){
	
			System.out.println("Your current balance is"+ initBalance +"rs.");
		}
		
		public static void main(String[] args){
			BankDetails bankdetails = new BankDetails();
			bankdetails.initBalance(5000);
			bankdetails.creditAmt(2000);
			bankdetails.creditAmt(500);
			bankdetails.debitAmt(9500);
			bankdetails.creditAmt(1500);
			bankdetails.debitAmt(6000);
			bankdetails.printStatement();
		}
	}
	
	

