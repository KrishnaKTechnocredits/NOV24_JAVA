package swapnilH;

public class Bankdetail {
	int balance;
	
	void init(int balance){
		this.balance=balance;
	}
	void creditAmt(int amt){
		balance=balance+amt;
	}
	void debitAmt(int amt){
		balance = balance - amt;
	}
	void display(){
		System.out.println(balance);
	}
	public static void main(String[] args) {
		Bankdetail bankdetail = new Bankdetail();
		bankdetail.init(5000);
		bankdetail.creditAmt(2000);
		bankdetail.debitAmt(6500);
		bankdetail.creditAmt(1500);
		bankdetail.display();
		
	}

}
