package nitesh;

public class BankOperations {
	int balance;
	
	void InitBalance(int initbalance) {
		this.balance = initbalance;
		System.out.println("Balance has been initialized with "+initbalance+" " +"rs");
		}
	
	void debitAmt(int debitAmt) {
		if (balance<debitAmt){
		System.out.println("In Sufficient balance, your ask is "+" "+ debitAmt+ " "+"rs but you only have" +balance+ " "+"rs");
		}else{
			balance = balance - debitAmt; 
			System.out.println(debitAmt+" "+" rs has been debited.");	
		}
	}
	
	void creditAmt(int creditAmt) {
			balance = balance +creditAmt;
			System.out.println(creditAmt +" "+ "rs has been credited");
		}/*else if (creditAmt ==500) {
			balance = balance +creditAmt;
			System.out.println(creditAmt+" "+" rs has been credited");
		}else if (creditAmt ==1500) {
			balance = balance +creditAmt;
			System.out.println(creditAmt+" "+" rs has been credited");
		}*/
	
	void display() {
		System.out.println("Your current balance is"+" " + balance+ " "+ " rs");
	}
	public static void main(String[] args) {
		BankOperations bankoperations = new  BankOperations();
		bankoperations.InitBalance(5000);
		bankoperations.creditAmt(2000);
		bankoperations.creditAmt(500);
		bankoperations.debitAmt(9500);
		bankoperations.creditAmt(1500);
		bankoperations.debitAmt(6000);
		bankoperations.display();
		
	}	

}
