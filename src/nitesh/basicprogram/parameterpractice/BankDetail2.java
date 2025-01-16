/*Create a class called BankDetail, which should 4 methods.
Set your initial balance by calling initBalance method.

1. creditAmt : which should increase balance by credit rs
2. debitAmt : which should deduct balance by debit rs
3. display : which should print current balance. 
4. initBalance : which should initiliase your balance with given amount.

from main method, calling sequence should be,
initBalance(5000);
creditAmt(2000);
debitAmt(6500);
creditAmt(1500);
display();

output : Your current balance is 2000.
 */
package nitesh.basicprogram.parameterpractice;


class BankDetail2{
	int balance;
	int credit;
	int debit;

	void initBalance(int initialBalance){
		balance = initialBalance;
		System.out.println("Initial balance is:"+" "+ initialBalance);
	}

	void creditAmt(int credit){
		balance = balance + credit;
	}

	void debitAmt(int debit){
		balance = balance -debit;
	}

	void display(){
		System.out.println("Current Balance is:"+ " "+ balance);
	}

	public static void main(String[] agrs){
		BankDetail2 bankdetail2 = new BankDetail2();
		bankdetail2.initBalance(5000);
		bankdetail2.creditAmt(2000);
		bankdetail2.debitAmt(6500);
		bankdetail2.creditAmt(1500);
		bankdetail2.display();
	}
}
