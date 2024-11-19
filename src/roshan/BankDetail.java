package roshan;


public class BankDetail {
	 int initBalance = 5000 ;

		void creditAmt (int initBalance) {
			this.initBalance = this.initBalance + initBalance;
			System.out.println(initBalance +"rs has been credited.");
	}

		void debitAmt (int initBalance) {
			
			if (this.initBalance < initBalance) {
				System.out.println("In Sufficient balance, your ask is" +" " + initBalance + "rs but you only have" + " " + this.initBalance + "rs.");
				}
				else {
					this.initBalance =  this.initBalance - initBalance;
					System.out.println(initBalance+ "rs has been debited");
				}
			
		}
		
		void initBalance () {
			    System.out.println("Balance has been initialized with" + " " + initBalance +"rs.");
				
		}
		void display() {
		
				System.out.println("Your Current Balance Is"+ " " + initBalance);
		}
		
		public static void main(String[] args) {
			BankDetail bankdetail = new BankDetail();
			bankdetail.initBalance();
			bankdetail.creditAmt(2000);
			bankdetail.creditAmt(500);
	        bankdetail.debitAmt(9500);
			bankdetail.creditAmt(1500);
			bankdetail.debitAmt(6000);
			bankdetail.display();
				
		}
	}
