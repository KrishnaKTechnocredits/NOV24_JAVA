package deepali;

//calculator: print add/subtract/multiply/division of two numbers
public class Assignment_3 {
	int num1 = 10;
	int num2 = 30;
	int ans;
	int addNum;
	int subNum;
	int divNum;
	int mulNum;
	
	
	void additionNumber() {
		addNum = num1 + num2;
		System.out.println("Addition of two numbers : " + addNum );	
	}
	void subtractionNumber() {
		subNum = num1 - num2;
		System.out.println("Subtraction of two numbers : " + subNum );
	}
	void divisionNumber() {
		divNum = num1 / num2;
		System.out.println("Division of two numbers : " + divNum );
	}
	void multipicationNumber() {
		mulNum = num1 * num2;
		System.out.println("Multiplication of two numbers : " + mulNum );	
	}
	
	public static void main(String[] args) {
		Assignment_3 assignment = new Assignment_3();
		assignment.additionNumber();
		assignment.subtractionNumber();
		assignment.divisionNumber();
		assignment.multipicationNumber();
	}
}
