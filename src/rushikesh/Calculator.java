package rushikesh;

class Calculator{
	int num1=10;
	int num2=2;
	int add;
	int sub;
	int mult;
	int div;
	
	void addition(){
		add= num1 + num2;
		System.out.println("Addition is "+add);
	}
	
	void substraction(){
		sub= num1 - num2;
		System.out.println("Substraction is "+sub);
	}
	
	void multiplication(){
		mult= num1 * num2;
		System.out.println("Multiplication is "+mult);
	}
	
	void division(){
		div= num1 / num2;
		System.out.println("Division is "+div);
	}
	
	void printTotalAns(){
		System.out.println("Total answer is = "+(add+sub+mult+div));
	}
	
	public static void main (String[] args){
		Calculator calculator= new Calculator();
		calculator.addition();
		calculator.substraction();
		calculator.multiplication();
		calculator.division();
		calculator.printTotalAns();
	}
}
