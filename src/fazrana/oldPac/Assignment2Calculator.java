package fazrana.oldPac;

public class Assignment2Calculator {
	int num1= 10;
	int num2= 5;
	int addAns;
	int subAns;
	int mulAns;
	int divAns;
	int sumAns;
	
	void add(){
		addAns= num1+num2;
		System.out.println("addition is " + addAns);
	}
	
	void substraction(){
		subAns= num1-num2;
		System.out.println("substraction is " + subAns);
	}
	
	void multiplication(){
		mulAns= num1*num2;
		System.out.println("multiplication is " + mulAns);
	}
	
	void division(){
		divAns= num1/num2;
		System.out.println("division is " + divAns);
	}
	
	void totalAns(){
		System.out.println("Total addition is " + (addAns+subAns+mulAns+divAns));
	}
	
	public static void main(String[] args){
		Assignment2Calculator calculator= new Assignment2Calculator();
		calculator.add();
		calculator.substraction();
		calculator.multiplication();
		calculator.division();
		calculator.totalAns();
	}
}
