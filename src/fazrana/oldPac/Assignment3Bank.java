package fazrana.oldPac;

public class Assignment3Bank {
	int balance= 1000;
	
	void credit(){
		balance = balance + 300;
	}
	
	void debit(){
		balance = balance - 500;
	}
	
	void display(){
		System.out.println(balance);
	}
	
	public static void main(String[] args){
		Assignment3Bank bank= new Assignment3Bank();
		bank.credit();
		bank.debit();
		bank.credit();
		bank.display();
	}	
}
