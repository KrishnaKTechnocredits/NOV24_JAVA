package pratiksha;

public class BankDetails {
	
		int balance;
			
			void initBalance (int balance) {
				
				this.balance = balance;
			}
			void creditAmt(int Amt) {
				
				balance = balance + Amt;
			}
			void debitAmt(int Amt) {
				
				balance = balance - Amt;
			}
			void display() {
				System.out.println("Current Balance is =" +balance);
			}
			public static void main(String[] args) {
				BankDetails bank= new BankDetails();
				bank.initBalance(5000);
				bank.creditAmt(2000);
				bank.debitAmt(6500);
				bank.creditAmt(1500);
				bank.display();
			}

		}

