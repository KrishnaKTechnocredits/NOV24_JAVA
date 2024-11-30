package kishor;
//Assignment:-6

public class Assignment6 {
	int balance;
	
	void initBalance(int balance) {
		this.balance = balance; //this keyword will access the instance variable
	}
	
	void creditAmt(int creditAmounnt) {
		balance = balance + creditAmounnt;
	}
	
	void debitAmt(int debitAmount) {
		balance = balance - debitAmount;
	}
	
	void displayAmt() {
		System.out.println("The available balance in your account is Rs:- "+balance+".");
	}
	
	public static void main(String[] args) {
		Assignment6 bankdetails = new Assignment6();
		bankdetails.initBalance(5000);
		bankdetails.creditAmt(2000);
		bankdetails.debitAmt(6500);
		bankdetails.creditAmt(1500);
		bankdetails.displayAmt();
	}
}
