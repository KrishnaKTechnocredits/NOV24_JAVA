/*•	Assignment - 2 : 10th Nov'2024
write a calculator program having 5 methods, add, sub, div, mul and printTotalAns. 
printTotalAns should print addition of answers get from all individual methods.

input:  
num1 = 10;
num2 = 2;
Answer is 45
*/


package nikita;

public class Assignment02 {
	
	int num1 = 10;
	int num2 = 2;
	int addAns;
	int subAns;
	int multiAns;
	int divideAns;
	int totalAns;
	
	void addition() {
		addAns = num1 + num2;
	}
	
	void subtraction() {
		subAns = num1 - num2;
	}
	
	void multiplication() {
		multiAns = num1 * num2;
	}
	
	void division() {
		divideAns = num1 / num2;
	}
	
	void displayInfo() {
		totalAns = addAns + subAns + multiAns + divideAns;
		System.out.println("Total Answer is: " + totalAns);
	}

	public static void main(String[] args) {
		Assignment02 a02 = new Assignment02();
		a02.addition();
		a02.subtraction();
		a02.multiplication();
		a02.division();
		a02.displayInfo();
	}
}
