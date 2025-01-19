package pankaj.NotepadAssignment;

public class Assignment06 {

		int balance;
		
		void initbalance(int balance){
			this.balance=balance;
			System.out.println("Your Initial balance is ==>>"+balance);
		}
		
		void credit(int amt){
		
			balance=balance+amt;
			System.out.println("Your account is credited by ==>>"+balance);
		}
		void debit(int amt)	{
			balance=balance-amt;
			System.out.println("Your account is debited by ==>>"+balance);
		}
		void display(){
	    	System.out.println("Your Current Balance is==>>" +balance);
	    }

		public static void main(String[] args) 
		{
			Assignment06 bankdetails=new Assignment06();
			bankdetails.initbalance(5000);
			bankdetails.credit(2000);
			bankdetails.debit(6500);
			bankdetails.credit(1500);
			bankdetails.display();

		}

	}

