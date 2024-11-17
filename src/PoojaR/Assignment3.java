package PoojaR;
class Assignment3{
	int balance = 1000;
	
	void credit(){
		balance = balance + 300;
	}
	
	void debit(){
		balance = balance - 500;
	}
	
	void print(){
		System.out.println("Current available balance is : " + balance);
	
	}
	
	public static void main(String[] args){
		Assignment3 assignment3 = new Assignment3();
		assignment3.credit();
		assignment3.debit();
		assignment3.credit();
		assignment3.print();
	}
}