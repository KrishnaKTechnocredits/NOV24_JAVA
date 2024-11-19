package madhura;

public class Assignment5_BankDetails {
	
		int balance=1000;
		int debitCount;
		int creditCount;
		int printStatementCount;
		
		void debitAmt(){
			balance = balance-200;
			debitCount++;
		}
		
		void creditAmt(){
			balance = balance+400;
			creditCount++;
		}
		
		void printStatement(){
			System.out.println("Remaining balance is " + balance);
			printStatementCount++;
		}
		
		void printCountInfo(){
			System.out.println("The debit count is " + debitCount);
			System.out.println("The credit count is " + creditCount);
			System.out.println("The print count is " + printStatementCount);
		}
		
		public static void main (String [] args){
			Assignment5_BankDetails bankdetails = new Assignment5_BankDetails();
			bankdetails.debitAmt();
			bankdetails.creditAmt();
			bankdetails.creditAmt();
			bankdetails.creditAmt();
			bankdetails.printStatement();
			bankdetails.printCountInfo();
		}
	}
