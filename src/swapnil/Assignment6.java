package swapnil;

public class Assignment6 {
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
			Assignment6 assignment6 = new Assignment6();
			assignment6.init(5000);
			assignment6.creditAmt(2000);
			assignment6.debitAmt(6500);
			assignment6.creditAmt(1500);
			assignment6.display();
			
		}

	}

