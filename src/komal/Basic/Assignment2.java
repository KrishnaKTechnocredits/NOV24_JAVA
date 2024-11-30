
//Assingment - 2 : 10th Nov'2024
//write a calculator program having 5 methods, add, sub, div, mul and printTotalAns. 
//printTotalAns should print addition of answers get from all individual methods.
//
//input : 
//num1 = 10;
//num2 = 2;
//
//Answer is 45
package komal.Basic;

public class Assignment2 {
	int addAns, subAns, mulAns, divAns, num1 = 10, num2 = 2;

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
		System.out.println("Total is: " + finalAns);
	}

	public static void main(String[] args) {
		Assignment2 calculator = new Assignment2();
		calculator.getAddition();
		calculator.getSubtraction();
		calculator.getMultiplication();
		calculator.getDivision();
		calculator.printTotalAns();
	}

}
