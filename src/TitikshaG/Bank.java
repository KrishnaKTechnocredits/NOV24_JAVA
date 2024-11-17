package TitikshaG;

public class Bank{
	int balance = 1000;

	void creditAmt(){
		balance = balance + 300;
		System.out.println("Current balance after credit is : " + balance);
		}
	
	void debitAmt(){
		balance = balance - 500;
		System.out.println("Current balance after debit is : " + balance);
		}
	
	void display(){
		System.out.println("Current balance is : " + balance);
		}
		
	public static void main(String[] args){
		Bank bank=new Bank();
		bank.creditAmt();
		bank.debitAmt();
		bank.creditAmt();
		bank.display();
	}
}