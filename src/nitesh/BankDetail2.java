package nitesh;

public class BankDetail2 {
	int initialBalnace;
	
	
	void initBalance(int initialBalnace) {
		 this.initialBalnace =initialBalnace;
		}
	
	void creditAmt(int creditAmt){
		initialBalnace = initialBalnace + creditAmt;
	}
	
	void debitAmt(int debitAmt) {
		initialBalnace = initialBalnace - debitAmt;
	}
	
	void display() {
		System.out.println("Current balance is:"+ " " +initialBalnace+ " "+"rs");
	}
	
	public static void main(String[] args) {
		BankDetail2 bankdetail2 = new BankDetail2();
		bankdetail2.initBalance(5000);
		bankdetail2.creditAmt(2000);
		bankdetail2.debitAmt(6500);
		bankdetail2.creditAmt(1500);
		bankdetail2.display();
	}
}
