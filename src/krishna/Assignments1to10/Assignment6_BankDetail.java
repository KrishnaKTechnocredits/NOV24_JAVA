package Assignments1to10;

public class Assignment6_BankDetail {

	int accBalance ;
	
	void initBalance(int amt) {
		accBalance += amt;
	}
	
	void debitAmount(int amt) {
		if(amt<accBalance) {
			accBalance -= amt;
			System.out.println(amt + " rs. has been debited ");
			System.out.println("have a good day");
		}
		else
			System.out.println("insufficient balance : "  + accBalance);
	}
	
	void creditAmount (int amt) {
		if(amt>0) {
			accBalance += amt;
			System.out.println("your current balance is : "+ accBalance);
			System.out.println("have a good day");
		}else 
			System.out.println("please enter greater amount");
	}
	
	void display() {
		System.out.println("your account balance is : " + accBalance);
	}
	
	public static void main(String[] args) {
		Assignment6_BankDetail test = new Assignment6_BankDetail();
		test.initBalance(5000);
		test.debitAmount(300);
		test.debitAmount(5000);
		test.creditAmount(4000);
		test.debitAmount(5000);
		test.display();
	}
}
