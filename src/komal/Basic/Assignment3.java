//Assingment - 3 : 11th Nov'24
//
//Create a class called Bank, which should 3 methods.
//Consider your initial balance is 1000 rs.
//1. creditAmt : which should increase balance by 300 rs
//2. debitAmt : which should deduct balance by 500 rs
//3. display : which should print current balance. 
//
//from main method, calling sequence should be,
//creditAmt();
//debitAmt();
//creditAmt();
//display;
//
//output : Your current balance is 1100.
//
//----------------------------------

package komal.Basic;

public class Assignment3 {
	static int bal = 1000;

	void getCreditAmt(int creditamt) {
		bal = bal + creditamt;
	}

	void getDebitAmt(int debitamt) {
		bal = bal - debitamt;
	}

	void displayBalance() {
		System.out.println("Your current balance is: " + bal);
	}

	public static void main(String[] args) {
		Assignment3 banktransactions = new Assignment3();
		banktransactions.getCreditAmt(300);
		banktransactions.getDebitAmt(500);
		banktransactions.getCreditAmt(300);
		banktransactions.displayBalance();

	}
}
