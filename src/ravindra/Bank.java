package ravindra;
class Bank{
	int currentBalence=1000;
	int creaditAmt=300;
	int debitAmt=500;
	
	void creaditAmt(){
		currentBalence =currentBalence + creaditAmt;
	}
	
	void debitAmt(){
		currentBalence=currentBalence - debitAmt;
	}
	
	void display(){
		System.out.println("Current balance is "+currentBalence);
	}
	
	public static void main(String []args){
		Bank bank=new Bank();
		bank.creaditAmt();
		bank.debitAmt();
		bank.creaditAmt();
		bank.display();
	}
	
}









