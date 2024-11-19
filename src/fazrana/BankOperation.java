package fazrana;

public class BankOperation {
	int balance;
	
	void showBalance(){
		System.out.println("your current balance is Rs" +balance);
	}
	
	void intBalance(int balance) {
		this.balance=balance;
		System.out.println("Balance has been initialized with Rs" +this.balance);
	}
	
	void debit(int deb) {
		if(deb<=balance) {
			balance= balance-deb;
			System.out.println(deb +"rs is debited and your current balance is Rs" +balance);
		}else {
			System.out.println("You have insufficient balance, your ask is "+deb+"rs and your account balance is "+balance);
		}
	}
	
	void credit(int cred) {
		balance= balance+cred;
		System.out.println(cred +"rs is credited and your current balance is Rs" +balance);
	}
	
	public static void main(String[] args) {
		BankOperation bankOperation=new BankOperation();
		bankOperation.intBalance(5000);
		bankOperation.credit(2000);
		bankOperation.credit(500);
		bankOperation.debit(9500);
		bankOperation.credit(1500);
		bankOperation.debit(6000);
		bankOperation.showBalance();
	}
}
