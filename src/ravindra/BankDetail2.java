//Assignment - 6 : 16th Nov'24 (25 mins)

//Create a class called BankDetail, which should 4 methods.
//Set your initial balance by calling initBalance method.

//1. creditAmt : which should increase balance by 300 rs
//2. debitAmt : which should deduct balance by 500 rs
//3. display : which should print current balance. 
//4. initBalance : which should initiliase your balance with given amount.
 
///from main method, calling sequence should be,
//initBalance(5000);
//creditAmt(2000);
//debitAmt(6500);
//creditAmt(1500);
//display();

//output : Your current balance is 2000.
package ravindra;
class BankDetail2{
	int initBalance;
	
	void initBalance(int initBalance){
		this.initBalance=initBalance;
	}
	
	void creditAmt(int creditAmt){
		initBalance=initBalance+creditAmt;
	}
	
	void debitAmt(int debitAmt){
		initBalance=initBalance-debitAmt;
	}
	
	void display(){
		System.out.println("Your current balance is "+initBalance);
	}
	
	public static void main(String []args){
		BankDetail2 bankDetail=new BankDetail2();
		bankDetail.initBalance(5000);
		bankDetail.creditAmt(2000);
		bankDetail.debitAmt(6500);
		bankDetail.creditAmt(1500);
		bankDetail.display();
	}
}
