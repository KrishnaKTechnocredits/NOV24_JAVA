package narendra;
/*
Assignment - 2 : 10th Nov'2024 (Day2)
write a calculator program having 5 methods, add, sub, div, mul and printTotalAns. 
printTotalAns should print addition of answers get from all individual methods.

input:  
num1 = 10;
num2 = 2;

Answer is 45
*/

public class Assignment_02_Calculator {
	int addAns;
	int subAns;
	int mulAns;
	int divAns;
	int num1 = 10;
	int num2 = 2;
	
	void getAddition() { 
		addAns = num1 + num2;		
	}
	
	void getSubtraction() { 
		subAns = num1 - num2;		
	}
	
	void getMultiplication() { 
		mulAns = num1 * num2;		
	}
	
	void getDivision() { 
		divAns = num1 / num2;		
	}
	
	void printTotalAns() {
		int finalAns = addAns + subAns + mulAns + divAns;
		System.out.println("Final answer is: " + finalAns);		
	}
	
	
	public static void main(String[] args) {
		Assignment_02_Calculator calculator = new Assignment_02_Calculator();
		calculator.getAddition();
		calculator.getSubtraction();
		calculator.getMultiplication();
		calculator.getDivision();
		calculator.printTotalAns();
	}
	
}