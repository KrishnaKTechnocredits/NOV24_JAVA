package ImranA;

public class Assignment2_Calc {
	int num1=10;
	int num2=2;
	int addAns, multiplyAns;
	int subAns, divideAns;
	
	void add()
	{
		int num1=3;
		addAns= num1 + num2 ;
		System.out.println("Addition is " + addAns);
	}
	
	void subtract()
	{
		subAns= num1 - num2 ;
		System.out.println("Subtraction is " + subAns);
	}
	
	void multiplication()
	{
		multiplyAns= num1 * num2 ;
		System.out.println("Multiplication is " + multiplyAns);
	}
	
	void divide()
	{
		divideAns= num1/num2 ;
		System.out.println("Division is " + divideAns);
	}
	
	void printTotalAns()
	{
		int totalAns= addAns+ subAns+ multiplyAns+ divideAns ;
		System.out.println("Total Answer is " + totalAns);
	}
	
	public static void main(String[] args) {
		Assignment2_Calc assignment_Calc1 = new Assignment2_Calc();
		assignment_Calc1.add();
		assignment_Calc1.subtract();
		assignment_Calc1.multiplication();
		assignment_Calc1.divide();
		assignment_Calc1.printTotalAns();
	}
}
