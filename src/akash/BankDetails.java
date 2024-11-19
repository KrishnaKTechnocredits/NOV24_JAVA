package akash;

class BankDetails{ //Asignment_5
	
	int balence=1000;
	int debitCount;
	int creditCount;
	int printStatmentCount;
			
	void creditAmount(){
		balence = balence + 400;
		creditCount++;
	}
	
	void debitAmount(){
		balence = balence - 200;
		debitCount++;
	}
	
	void printStatmentAmount(){
		System.out.println("employee address is :"+balence); 
		printStatmentCount++;
	}	
	
	void printCountInfo(){
		System.out.println("credit Amount is called " + creditCount+ "no of times");
		System.out.println("debit Amount is called " + debitCount+ "no of times");
		System.out.println("print Statment amount is called " + printStatmentCount+ "no of times");
	}
	
	public static void main(String[] args){
		BankDetails b = new BankDetails();
			b.creditAmount();
			b.debitAmount();
			b.creditAmount();
			b.creditAmount();
			b.printStatmentAmount();
			b.printCountInfo();
	}	
}