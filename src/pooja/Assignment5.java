package pooja;
class Assignment5{
	int balance = 1000,debitCount,creditCount,printStatementCount;
	
	void debitAmt(){
		balance -= 200;
		debitCount++;
	}
	
	void creditAmt(){
		balance += 400;
		creditCount++;
	}

	void printStatement(){
		System.out.println("Remaining Balance = " + balance);
		printStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("Debit method call count = " + debitCount);
		System.out.println("Credit method call count = " + creditCount);
		System.out.println("Print statement count = " + printStatementCount);
	}
	
	public static void main(String[] aregs){
		Assignment5 assignment5 = new Assignment5();
		assignment5.debitAmt();
		assignment5.creditAmt();
		assignment5.creditAmt();
		assignment5.creditAmt();
		assignment5.printStatement();
		assignment5.printCountInfo();
	}
}