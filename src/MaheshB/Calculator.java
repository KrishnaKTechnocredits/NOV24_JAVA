package MaheshB;

class Calculator {
	
	int num1 = 10;
	int num2 = 2;
	int add;
	int sub;
	int multiply;
	int divide;
	int ans;
	
	void addition() {
		add = num1+num2;
		System.out.println("Addition is "+add);
	}
	
	void subtraction() {
		sub = num1-num2;
		System.out.println("Subtraction is "+sub);
	}
	
	void multiplication() {
		multiply = num1*num2;
		System.out.println("Multiplication is "+multiply);
	}

	void division() {
		divide = num1/num2;
		System.out.println("Division is "+divide);
	}
	
	void totalAns() {
		ans = add + sub + multiply + divide;
		System.out.println("The sum of all answers is "+ans);
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.addition();
		calculator.subtraction();
		calculator.multiplication();
		calculator.division();
		calculator.totalAns();
	}
}