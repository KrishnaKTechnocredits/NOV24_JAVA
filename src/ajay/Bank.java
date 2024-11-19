package ajay;
/* Assingment - 3 : 11th Nov'24
Create a class called Bank, which should 3 methods.
Consider your initial balance is 1000 rs.
1. creditAmt : which should increase balance by 300 rs
2. debitAmt : which should deduct balance by 500 rs
3. display : which should print current balance. */

class Bank{
	int balance=1000;
	
	void creditAmt(){
		balance=balance+300;
		System.out.println("300 Rs Credited to Your Account, Your Current balance is " +balance +" Rs");
	}
	
	void debitAmt(){
		balance=balance-500;
		System.out.println("500 Rs Debited from youur Account, Your Current balance is " +balance +" Rs");
	}
	
	void display(){
		System.out.println("Your Current balance is " +balance +" Rs");
	}
	
	public static void main(String[] args){
		Bank bank=new Bank();
		bank.creditAmt();
		bank.debitAmt();
		bank.creditAmt();
		bank.display();
	}
}