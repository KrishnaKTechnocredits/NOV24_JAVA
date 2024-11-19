package titiksha;

public class BankDetail_Condition {
int balance;
	
	void initBalance(int balance) {
		this.balance = balance;
	}
	
	void creditAmt(int credit) {
		balance = balance + credit;
		System.out.println(credit + " has been credited");
	}
	
	void debitAmt(int debit) {
		balance = balance - debit;
		System.out.println(debit + " has been debited");
	}
	
	void display(int amt) {
		if(balance>=amt) {
		System.out.println("your balance is "+ balance + " your ask is " + amt);
	}
		else {
			System.out.println("your balance is "+ balance + " your ask is " + amt+" hence your balance is insufficient");}
			
}
	
	public static void main (String[] args) {
		BankDetail_Condition bankcondition=new BankDetail_Condition();
		bankcondition.initBalance(5000);
		bankcondition.creditAmt(2000);
		bankcondition.debitAmt(6500);
		bankcondition.creditAmt(1500);
		bankcondition.debitAmt(6000);
		bankcondition.creditAmt(5000);
		bankcondition.display(500);
		}
}