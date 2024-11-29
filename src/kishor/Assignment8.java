package kishor;
//Assignment:-8
public class Assignment8 {
	int balance; //instance variable-accessible to all methods
	
	void initBalance(int balance) {
		this.balance = balance;
		System.out.println("opening balance of account is "+balance+".");
	}
	
	void creditAmt(int creditAmount) {
		balance = balance +creditAmount;
		System.out.println("Your account is credited by RS: "+creditAmount+".Avl balance is RS:"+balance+".");
	}
	
	void debitAmt(int debitAmount) {
		if(balance >=debitAmount) {
			balance = balance - debitAmount;
			System.out.println("Your account is debited by RS:"+debitAmount+".Avl balance is RS: "+balance+".");
		}
		else {
			System.out.println("Your balance is insufficient for Rs: "+debitAmount+" transaction");
		}
	}
	
	void displayBalance() {
		System.out.println("your current account balance is RS: "+balance+".");
	}
	 public static void main(String[] args) {
		Assignment8 bankoperation = new Assignment8();
		bankoperation.initBalance(5000);
		bankoperation.creditAmt(2000);
		bankoperation.creditAmt(500);
		bankoperation.debitAmt(9500);
		bankoperation.creditAmt(1500);
		bankoperation.debitAmt(6000);
		bankoperation.displayBalance();
	}
}
