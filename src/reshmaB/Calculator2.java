package reshmaB;

public class Calculator2 {
	int num1=10;
	int num2=2;
	int additionans;
	int substractionans;
	int multiplicationans;
	int divisionans;
	int ans;
	

	void addition(){
		additionans=num1+num2;
		System.out.println("Addition is " +additionans);
	}

	void substraction(){
		substractionans=num1-num2;
		System.out.println("Substraction is " +substractionans);
	}
	
	void multiplication(){
		multiplicationans=num1*num2;
		System.out.println("Multiplication is " +multiplicationans);
	}
	
	void division(){
		divisionans=num1/num2;
		System.out.println("division is " +divisionans);
	}
	
	void printTotalAns(){
		ans=additionans + substractionans + multiplicationans + divisionans;
		System.out.println("all addition is " +ans);
	}
	
	public static void main(String[] args){
		Calculator2 calculator=new Calculator2();
		calculator.addition();
		calculator.substraction();
		calculator.multiplication();
		calculator.division();
		calculator.printTotalAns();
	}
}
