package mousumi;

class BankDetailsAssignment5{
	int balance;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmount(){
		
	   balance = balance-500;
	   debitCount++;
 }
 
    void creditAmount(){
    	
	   balance = balance+1000;
	   creditCount++;
 }
 
    void printStatement(){
    	
	   printStatementCount++;
	   System.out.println("Total balance is: " + balance);
 }
      void printCountInfo(){
    	  
      System.out.println("debit method call Count: " + debitCount);
      System.out.println("credit method call Count: " + creditCount);
      System.out.println("print statement method call Count: " + printStatementCount);
 }
 
    public static void main(String[] args){
	   BankDetailsAssignment5 bankDetails = new BankDetailsAssignment5();
	   bankDetails.debitAmount();
	   bankDetails.creditAmount();
	   bankDetails.creditAmount();
	   bankDetails.creditAmount();
	   bankDetails.printStatement();
	   bankDetails.printCountInfo();
	}
 }	
	   