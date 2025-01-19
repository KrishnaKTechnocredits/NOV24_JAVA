package pranita;

class BankAss_3{
	int balance =1000;
	
	void credit(){
		balance = balance + 300;
	}
	
	void debit(){
		balance = balance - 500;
	}
	
	void Display(){
		System.out.println("Your Bank Balance is : " + balance);
	}
	 
	public static void main (String[]args){
		BankAss_3 bank = new BankAss_3();
		bank.credit();
		bank.debit();
		bank.credit();
		bank.Display();
	}
		
}