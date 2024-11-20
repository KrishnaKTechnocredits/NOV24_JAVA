package narendra;
/*
Assignment - 6 : 16th Nov'24 (25 mins)

Create a class called BankDetail, which should 4 methods.
Set your initial balance by calling initBalance method.

1. creditAmt : which should increase balance by 300 rs
2. debitAmt : which should deduct balance by 500 rs
3. display : which should print current balance. 
4. initBalance : which should initialize your balance with given amount.
 
from main method, calling sequence should be,
initBalance(5000);
creditAmt(2000);
debitAmt(6500);
creditAmt(1500);
display();

output : Your current balance is 2000.
*/

public class Assignment_06_BankDetails {
	 static int initBal;
	
	void getInitBal(int initBal) { // to get initial balance
		Assignment_06_BankDetails.initBal = initBal;	
	}
	
	void getDebitAmt(int debitAmt) { // to call debitaAmt method
		initBal = initBal - debitAmt;
	}
	
	void getCreditAmt(int creditAmt) { // to call creditAmt method
		initBal = initBal + creditAmt;
	}
	
	void toDisplayBalance() { // to display total remaining balance
		System.out.println("Your current balance is: ₹" + initBal +"/-");
	}
	
	public static void main(String[] args) {
		Assignment_06_BankDetails bankdetails = new Assignment_06_BankDetails();
		bankdetails.getInitBal(5000);
		bankdetails.getCreditAmt(2000);
		bankdetails.getDebitAmt(6500);
		bankdetails.getCreditAmt(1500);
		bankdetails.toDisplayBalance();

	}
	
}