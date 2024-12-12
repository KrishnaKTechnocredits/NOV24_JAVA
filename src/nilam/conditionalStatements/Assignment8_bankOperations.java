package nilam.conditionalStatements;

public class Assignment8_bankOperations {
	int balance,creditAmt,debitAmt;
	
	void initBalance(int amount) {
		balance=amount;
		System.out.println("Balance has been initialized with "+balance+"rs." );
	}
	
	void debitAmt(int dbAmt) {
		debitAmt=dbAmt;
		if(debitAmt<=balance) {
		balance=balance-debitAmt;
		System.out.println(debitAmt+ "rs. has been debited from account.");
		}
		else {
			System.out.println("Insufficient balance, your ask for " +debitAmt+ "rs but you only have "+balance+"rs.");
		}
	}
	
	void creditAmt(int crAmt) {
		creditAmt=crAmt;
		balance=balance+creditAmt;
		System.out.println(creditAmt+ "rs.has been credited to the account.");
	}
	
	void displayBalance() {
		System.out.println("your current balance is :"+balance+"rs.");
	}
	
	public static void main(String[] args) {
		Assignment8_bankOperations assignment8_bankoperations=new Assignment8_bankOperations();
		assignment8_bankoperations.initBalance(5000);
		assignment8_bankoperations.creditAmt(2000);
		assignment8_bankoperations.creditAmt(500);
		assignment8_bankoperations.debitAmt(9500);
		assignment8_bankoperations.creditAmt(1500);
		assignment8_bankoperations.debitAmt(6000);
		assignment8_bankoperations.displayBalance();
	}

}
