package nitesh;

public class BasicCalculator {
	int num1 = 10;
	int num2 = 2;
	int add;
	int sub;
	int div;
	int mul;

	
	void addition() {
		 add = num1 + num2;
	}
	
	void substraction() {
		 sub = num1 - num2;
	}
	
	void division() {
		 div = num1/ num2;
	}
	
	void multiplication() {
		 mul = num1 * num2;
	}
	
	void printTotalAns() {
		System.out.println("Sum of all is "+" "+(add+sub+div+mul));
	}
	
	public static void main(String[] args) {
		BasicCalculator basiccalculator = new BasicCalculator();
		basiccalculator.addition();
		basiccalculator.substraction();
		basiccalculator.division();
		basiccalculator.multiplication();
		basiccalculator.printTotalAns();
	}
}
