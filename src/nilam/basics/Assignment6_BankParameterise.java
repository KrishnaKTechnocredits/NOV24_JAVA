package nilam.basics;

public class Assignment6_BankParameterise {
	int bal=0;	

	void initBalance(int x){
		bal=x;
	}
	
	void debitAmt(int amt){
		bal=bal-amt;
	}
	
	void creditAmt(int amt){
		bal=bal+amt;
	}
	
	void display(){
		System.out.println("Remaining balance is-> "+bal);
	}
	
	public static void main(String[] args){
		Assignment6_BankParameterise assignment6_bankparameterise= new Assignment6_BankParameterise();
		assignment6_bankparameterise.initBalance(5000);
		assignment6_bankparameterise.creditAmt(2000);
		assignment6_bankparameterise.debitAmt(6500);
		assignment6_bankparameterise.creditAmt(1500);
		assignment6_bankparameterise.display();
	}
}
