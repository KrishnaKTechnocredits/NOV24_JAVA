package madhviJ;

public class BankDetails {
	 int balance;
	
	void creditAmt(int amt) {
		balance = balance + amt;
		System.out.println("Your account is credited by " +amt);
	}
	
	void debitAmt(int amt) {
		balance = balance - amt;
		System.out.println("Your account is debited by " +amt);
	}
	
	void display() {
		System.out.println("Your current balance is " +balance);
	}
	
	void initBalance(int balance) {
		this.balance = balance;
		System.out.println("Your initial balance is " +balance);
	}
	
	public static void main(String[] args) {
		BankDetails bankDetails = new BankDetails();
		bankDetails.initBalance(5000);
		bankDetails.creditAmt(2000);
		bankDetails.debitAmt(6500);
		bankDetails.creditAmt(1500);
		bankDetails.display();
	}

}
