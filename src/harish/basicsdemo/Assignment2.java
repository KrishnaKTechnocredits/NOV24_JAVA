package harish.basicsdemo;

/**
 * Assignment - 2 : 10th Nov'2024
 * 
 * Write a calculator program having 5 methods, add, sub, div, mul and
 * printTotalAns. printTotalAns should print addition of answers get from all
 * individual methods.
 * 
 */

class Assignment2 {

	int num1 = 10;
	int num2 = 2;
	int addAns;
	int subAns;
	int mulAns;
	int divAns;

	void add() {
		addAns = num1 + num2;
		System.out.println("Addition answer is " + addAns);
	}

	void subtract() {
		subAns = num1 - num2;
		System.out.println("Subtraction answer is " + subAns);
	}

	void multiply() {
		mulAns = num1 * num2;
		System.out.println("Multiplication answer is " + mulAns);
	}

	void divide() {
		divAns = num1 / num2;
		System.out.println("Division answer is " + divAns);
	}

	void printTotalAnswer() {
		System.out.println("Total Answer is : " + (addAns + subAns + mulAns + divAns));
	}

	public static void main(String[] args) {
		Assignment2 assignment2 = new Assignment2();
		assignment2.add();
		assignment2.subtract();
		assignment2.multiply();
		assignment2.divide();
		assignment2.printTotalAnswer();
	}
}