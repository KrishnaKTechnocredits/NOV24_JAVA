package swapnil;

public class Assignment8 {
	int balance;
	
	void init(int balance){
		this.balance=balance;
		System.out.println("Balance has been initialized with " +balance+ " rs");
	}
	void creditAmt(int amt){
		balance=balance+amt;
		System.out.println(+amt+ " rs has been credited");
	}
	void debitAmt(int amt){
		if (balance < amt)
			System.out.println("In Sufficient balance, your ask is "+ " amt rs but you only have"+balance+" rs.");
			else {
			balance = balance - amt;
		    System.out.println(+amt+ " rs has been debited");
			}
	}
	void display(){
		System.out.println("Your current balance is "+balance+" rs" );
	}
	public static void main(String[] args) {
		Assignment8 assignment8 = new Assignment8();
		assignment8.init(5000);
		assignment8.creditAmt(2000);
		assignment8.creditAmt(500);
		assignment8.debitAmt(9500);
		assignment8.creditAmt(1500);
		assignment8.debitAmt(6000);
		assignment8.display();
		
	}

}

