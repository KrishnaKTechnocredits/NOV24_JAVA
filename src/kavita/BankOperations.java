package kavita;

public class BankOperations {
	int balance;
	
	void initbalance(int initbalance) {
		balance=initbalance;
		System.out.println("balance has been initialized" +initbalance+" Rs");
	}
	
	void creditAmt(int credit) {
		balance=balance+credit;
		System.out.println(credit+" amount has been credited");
	}
	
	void debitAmt(int debit) {
		if(balance<debit) {
			System.out.println("Insufficient balance "+debit+" but you have only "+balance+" Rs");
		}
		else {
			balance=balance-debit;
			System.out.println(debit+" amount has been debited");
		}
	}
	
	void displayAmt() {
		System.out.println("Your account balance is "+balance);
	}
	
	public static void main(String[] args) {
		BankOperations bankOperations = new BankOperations();
		bankOperations.initbalance(5000);
		bankOperations.creditAmt(2000);
		bankOperations.debitAmt(9500);
		bankOperations.debitAmt(6500);
		bankOperations.creditAmt(1500);
		bankOperations.displayAmt();
		
	}
}
