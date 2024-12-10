package nilam.basics;

public class Assignment5_BankDetails_Count {
	static int d_count=0;
	static int c_count=0;
	static int print_Count=0;
	int balance=1000;
	
	void debitAmt(){
		d_count++;
		balance=balance-200;
	}
	
	void creditAmt(){
		c_count++;
		balance=balance+400;
	}
	
	void printStatement(){
		System.out.println("Remaining balance is-> "+balance);
	}
	
	void printCount(){
		System.out.println("Debit method call count-> "+d_count);	
		System.out.println("Credit method call count-> "+c_count);
		System.out.println("Print statement method call count-> "+d_count);
	}
	
	public static void main(String[] args){
		Assignment5_BankDetails_Count assignment5_bankdetails_count= new Assignment5_BankDetails_Count();
		assignment5_bankdetails_count.debitAmt();
		assignment5_bankdetails_count.creditAmt();
		assignment5_bankdetails_count.creditAmt();
		assignment5_bankdetails_count.creditAmt();
		assignment5_bankdetails_count.printStatement();
		assignment5_bankdetails_count.printCount();
	
	}
}
