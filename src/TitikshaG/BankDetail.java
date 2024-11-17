package TitikshaG;
class BankDetail{
	int debitCount;
	int creditCount;
	int balance = 1000;
	int totalCount;
	int printStattementCount;
	
	void debit(){
		balance = balance - 200;
		debitCount++;
		
		}
		
	void credit(){
		balance = balance + 400;
		creditCount++;
		}
		
	void printCountInfo(){
		System.out.println("Total number of debit print count is :" + debitCount);
		System.out.println("Total number of credit print count is :" + creditCount);
		System.out.println("Total number of print count is :" + balance );
		
		}
		
	void printStatement(){
		printStattementCount++;
		System.out.println("Total number of print count is :" + printStattementCount);
		totalCount= debitCount + creditCount;
		System.out.println("Total number of transactions count is :" + totalCount);
		}
		
	public static void main(String[] args){
		BankDetail bankdetail = new BankDetail();
		bankdetail.debit();
		bankdetail.credit();
		bankdetail.credit();
		bankdetail.credit();
		bankdetail.printCountInfo();
		bankdetail.printStatement();
	}
}