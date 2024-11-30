package kavita;

public class BankDetails {
	int balance;

	void initbalance(int balance){

		this.balance=balance;

		System.out.println("Total balance in account is :"+balance);

		}

	void creditAmt(int credit){

		balance=balance+credit;

		System.out.println(credit+" amount is credited in account");

	}

	void debitAmt(int debit){

		balance=balance-debit;

		System.out.println(debit+" amount is debited in account");

	}

	void displayAmt(){

		System.out.println("Current balance is "+balance);

	}

	public static void main(String[] args) {

		BankDetails bankdetails=new BankDetails();

		bankdetails.initbalance(5000);

		bankdetails.creditAmt(2000);

		bankdetails.debitAmt(6500);

		bankdetails.creditAmt(1500);

		bankdetails.displayAmt();

	}
}
