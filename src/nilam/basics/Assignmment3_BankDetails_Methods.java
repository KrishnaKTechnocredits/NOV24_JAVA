package nilam.basics;

public class Assignmment3_BankDetails_Methods {
	int bal=1000;
	
	void credit(){
		bal = bal+300;
		System.out.println("Credit Amount= " +bal);
	}
			
	void debit(){
		bal = bal-500;
		System.out.println("Debit Amount= " +bal);
	}
			
	void display(){
		System.out.println("Cutrrent balance= " +bal);
	}
	
	public static void main(String[] args){
		Assignmment3_BankDetails_Methods assignmment3_bankDetails_methods= new Assignmment3_BankDetails_Methods();
		assignmment3_bankDetails_methods.credit();
		assignmment3_bankDetails_methods.debit();
		assignmment3_bankDetails_methods.credit();
		assignmment3_bankDetails_methods.display();	
	}
}

