package RushikeshK;

public class MethodsParameter {
	
	int balance=1000;
	
	void totalBalance() {
		System.out.println("total balance is "+balance);
	}
	
	void debitAmt(int debit) {
		balance=balance-debit;
		System.out.println(debit +" amount is debited from your account");
	}
	
	void creditAmt(int credit) {
		balance=balance+credit;
		System.out.println(credit +" amount is credited your account");
	}
	
	void display() {
		System.out.println("current balance is "+balance);
	}
	
	public static void main(String[] args) {
		MethodsParameter methodparameter=new MethodsParameter();
		methodparameter.totalBalance();
		methodparameter.debitAmt(300);
		methodparameter.creditAmt(500);
		methodparameter.display();
	}	
}
