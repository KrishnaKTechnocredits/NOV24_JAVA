package sachin;

class Calculators {
	int num1 = 10;
	int num2 = 2;
	int ansTotal;
	int ansAddition;
	int ansSustraction;
	int ansMultiplication;
	int ansDivision;

	void addition() {
		ansAddition = num1 + num2;
		System.out.println("Addition of num1 and num2 is : " + ansAddition);

	}

	void sustraction() {
		ansSustraction = num1 - num2;
		System.out.println("sustraction of num1 and num2 is : " + ansSustraction);

	}

	void multiplication() {
		ansMultiplication = num1 * num2;
		System.out.println("multiplication of num1 and num2 is : " + ansMultiplication);

	}

	void division() {
		ansDivision = num1 / num2;
		System.out.println("multiplication of num1 and num2 is : " + ansDivision);

	}

	void printTotalAns() {
		ansTotal = ansAddition + ansSustraction + ansMultiplication + ansDivision;
		System.out.println("Total of all ans is : " + ansTotal);

	}

	public static void main(String[] args) {
		Calculators calculator = new Calculators();
		calculator.addition();
		calculator.sustraction();
		calculator.multiplication();
		calculator.division();
		calculator.printTotalAns();

	}
}