package RavindraM;
class Calculator{
	int num1=10;
	int num2=2;
	int additionAns;
	int multiplicationAns;
	int substractionAns;
	int divisionAns;
	int allAnsAdd;
	
	void addition(){
		additionAns=num1+num2;
		System.out.println("addition of number is "+additionAns);
	}
	
	void multiplication(){
		multiplicationAns=num1*num2;
		System.out.println("multiplication of number is "+multiplicationAns);
	}
	
	void substraction(){
		substractionAns=num1-num2;
		System.out.println("substraction of number is "+substractionAns);
	}
	
	void division(){
		divisionAns=num1/num2;
		System.out.println("division of number is "+divisionAns);
	}
	
	void allAnsAddition(){
		allAnsAdd=additionAns+multiplicationAns+substractionAns+divisionAns;
		System.out.println("all answers addition is"+allAnsAdd);
	}
		
	public static void main(String []args){
		Calculator calculator=new Calculator();
		calculator.addition();
		calculator.multiplication();
		calculator.substraction();
		calculator.division();
		calculator.allAnsAddition();
	}
	
}
