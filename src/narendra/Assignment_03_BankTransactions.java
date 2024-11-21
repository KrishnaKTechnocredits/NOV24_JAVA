package narendra;
/*
Assingment - 3 : 11th Nov'24 (Day3)

Create a class called Bank, which should 3 methods.
Consider your initial balance is 1000 rs.
1. creditAmt : which should increase balance by 300 rs
2. debitAmt : which should deduct balance by 500 rs
3. display : which should print current balance. 

from main method, calling sequence should be,
creditAmt();
debitAmt();
creditAmt();
display;

output : Your current balance is 1100.
*/

public class Assignment_03_BankTransactions {
	static int bal = 1000;
	
	void getDebitAmt(int debitamt) { // to call debitaAmt method
		bal = bal - debitamt;		
	}
	
	void getCreditAmt(int creditamt) { // to call creditAmt method
		bal = bal + creditamt;
	}
	
	void toDisplayBalance() { // to display remaining balance
		System.out.println("Your current balance is: ₹" + bal +"/-");
	}
	
	public static void main(String[] args) {
		Assignment_03_BankTransactions banktransactions = new Assignment_03_BankTransactions();
		banktransactions.getCreditAmt(300);
		banktransactions.getCreditAmt(1300);
		banktransactions.getDebitAmt(500);
		banktransactions.toDisplayBalance();

	}
	
}