package roshan;

public class BankOperation {
	 int initBalance;
	 
	 	void creditAmt(int initBalance) {
	 		this.initBalance= this.initBalance+ initBalance;
	 	}
	 
	 	void debitAmt (int initBalance) {
	 		this.initBalance= this.initBalance- initBalance;

	 		
	 	}
	 	
	 	void initBalance (int initBalance) {
	 		this.initBalance= initBalance;
	 	}
	 		
	 		
	 	
	 	void display() {
	 		
	 		System.out.println(initBalance);
	 		
	 	}
	 
	 		
	 	
	public static void main(String[] args) {

	 		BankOperation  bankoperation = new BankOperation();
	 		bankoperation.initBalance(5000);
	 		bankoperation.creditAmt(2000);
	 		bankoperation.debitAmt(6500);
	 		bankoperation.creditAmt(1500);
	 		bankoperation.display();

		}
	}
