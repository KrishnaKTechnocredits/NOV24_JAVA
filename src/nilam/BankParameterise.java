package nilam;

public class BankParameterise {
	int bal=0;	

	void initBalance(int x){
		bal=x;
	}
	
	void debitAmt(int amt){
		bal=bal-amt;
		//balance=balance-200;
	}
	
	void creditAmt(int amt){
				bal=bal+amt;
	}
	
	void display(){
		System.out.println("Remaining balance is-> "+bal);
	}
	
	public static void main(String[] args){
		BankParameterise bankparamererise= new BankParameterise();
		bankparamererise.initBalance(5000);
		bankparamererise.creditAmt(2000);
		bankparamererise.debitAmt(6500);
		bankparamererise.creditAmt(1500);
		bankparamererise.display();
		
	}
}
