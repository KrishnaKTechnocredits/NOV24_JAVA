package nishit;

class Calculator
{
	int num1 = 10;
	int num2 = 2;
	int additionanswer;
	int subtractionanswer;
	int multiplicationanswer;
	int divisionanswer;
	int totalAnswer;
	
	void addition()
	{
		additionanswer = num1 + num2;
		System.out.println("Addition is: " + additionanswer);
	}
	
	void subtraction()
	{
		subtractionanswer = num1 - num2;
		System.out.println("Subtraction is: " + subtractionanswer);
	}
	
	void multiplication()
	{
		multiplicationanswer = num1 * num2;
		System.out.println("Multiplication is: " + multiplicationanswer);
	}
	
	void division()
	{
		divisionanswer = num1 / num2;
		System.out.println("Division is: " + divisionanswer);
	}
	
	void printTotalAnswer()
	{
		totalAnswer = additionanswer + subtractionanswer + multiplicationanswer + divisionanswer;
		System.out.println("Total answer is: " + totalAnswer);
	}
	
	public static void main(String[] args)
	{
		Calculator calculator = new Calculator();
		calculator.addition();
		calculator.subtraction();
		calculator.multiplication();
		calculator.division();
		calculator.printTotalAnswer();
		calculator.printTotalAnswer();
		calculator.printTotalAnswer();
	}
}