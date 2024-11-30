package ajay;
/*Day - 8 : 16th Nov'2024
Assignment - 6 : 16th Nov'24 (25 mins)
Create a class called BankDetail, which should 4 methods.
Set your initial balance by calling initBalance method.
1. creditAmt : which should increase balance by 300 rs
2. debitAmt : which should deduct balance by 500 rs
3. display : which should print current balance. 
4. initBalance : which should initiliase your balance with given amount.
 from main method, calling sequence should be,
initBalance(5000);
creditAmt(2000);
debitAmt(6500);
creditAmt(1500);
display();
output : Your current balance is 2000.
-----------------------------------------------------------------------------------------*/
class BankDetail{
	static int balance;
	int Amt;
	
	void initBalance(int balance){
		
		BankDetail.balance=balance;
	}
	void creditAmt(int Amt){
		balance=balance+Amt;
	}
	
	void debitAmt(int Amt){
		balance=balance-Amt;
	}
	void display(){
		System.out.println("Your current balance is = " +balance);
	}
	public static void main(String[] args){
	
		BankDetail bankdetail= new BankDetail();
		bankdetail.initBalance(5000);
		bankdetail.creditAmt(2000);
		bankdetail.debitAmt(6500);
		bankdetail.creditAmt(1500);
		bankdetail.display();
	}
}
