package pankaj.NotepadAssignment;

public class Assignment05 
{
	
		int balance=1000;
		int debitCount;
		int creditCount;
		int printStatementCount;
		
		void debit()
		{
			balance=balance-200;
			//System.out.println("Account balance is ==>>"+ " " + balance);
			debitCount++;
		}
		
		void credit()
		{	
			balance=balance+400;
			//System.out.println("Account balance is ==>>"+ " " +balance);
			creditCount++;
		}
		
		void printstatement()
		{
			System.out.println("Remaining balance is ==>>"+ " " + balance);
			printStatementCount++;
		}
		void printCountInfo()
		{
			System.out.println("The debitCount   ==>>"+ " "+ debitCount);
			System.out.println("The creditCount  ==>>"+ " "+ creditCount);
			System.out.println("The printCountInfo=>>"+ " "+ printStatementCount);
		}
		
		public static void main(String[] args)
		{
			Assignment05 bankdetails=new Assignment05();
			bankdetails.debit();
			bankdetails.credit();
			bankdetails.credit();
			bankdetails.credit();
			bankdetails.printstatement();
			bankdetails.printCountInfo();
		}
		
	}	
		
