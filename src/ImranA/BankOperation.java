package ImranA;
// Assignment no:8

public class BankOperation {
		
		int balance;
		
		void initBalance(int amt)
		{
			balance=amt;
			System.out.println("Balance has been initialised with Rs."+ amt);
		}
		
		void creditAmt(int amt)
		{
			balance=balance+amt;
			System.out.println("The account has been credited with Rs."+ amt);
		}
		
		void debitAmt(int amt)
		{
			if(balance>=amt)
			{
				balance=balance-amt;
				System.out.println("The Account is debited with Rs."+ amt);
			}
			else
			{
				System.out.println("insufficient balance, your Withdrawal amount is Rs."+ amt+".  and Account balance is Rs"+ balance);
			}			
		}
		
		void display()
		{
			System.out.println("Your Current balance is Rs."+ balance);
		}
		
		public static void main(String[] args) {
			BankOperation bankOperation1 = new BankOperation();
			bankOperation1.initBalance(5000);
			bankOperation1.creditAmt(2000);
			bankOperation1.debitAmt(5000);
			bankOperation1.creditAmt(1500);
			bankOperation1.debitAmt(6000);
			bankOperation1.display();
		}
		
}
