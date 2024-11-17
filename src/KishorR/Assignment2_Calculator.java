package KishorR;

public class Assignment2_Calculator {
	int num1=10;
	int num2=2;
	int addAns;
	int subAns;
	int mulAns;
	int divAns;
	
	void add(){
		addAns = num1 + num2;
		System.out.println("Addittion is "+ addAns);
	}
	
	void sub(){
		subAns = num1 - num2;
		System.out.println("Substraction is "+ subAns);
	}
	
	void mul(){
		mulAns = num1 * num2;
		System.out.println("Multiplication is "+ mulAns);
	}
	
	void div(){
		divAns = num1 / num2;
		System.out.println("Division is " + divAns);
	}
	
	void printTotalAns(){
		System.out.println("The total answer is " + (addAns + subAns + mulAns + divAns));
	}
	
	public static void main(String[] args){
		Assignment2_Calculator calculator2 = new Assignment2_Calculator();
		calculator2.add();
		calculator2.sub();
		calculator2.mul();
		calculator2.div();
		calculator2.printTotalAns();
		}
}
