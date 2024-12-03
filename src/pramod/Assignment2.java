/*Assignment - 2 : 10th Nov'2024
write a calculator program having 5 methods, add, sub, div, mul and printTotalAns. 
printTotalAns should print addition of answers get from all individual methods.

input:  
num1 = 10;
num2 = 2;

Answer is 45*/
package pramod; 

class Assignment2{
	
	int num1=10;
	int num2=2;
	int addAns;
	int subAns;
	int divAns;
	int multiAns;
	
	void printAdditon(){
		addAns = num1 + num2;
		System.out.println("Addition is " + addAns);
	}
	
	void printSubtraction(){
		subAns = num1 - num2;
		System.out.println("Subtraction is " + subAns);
	}
	
	void printMultiplication(){
		multiAns = num1 * num2;
		System.out.println("Multiplication is " + multiAns);
	}
	
	void printDivision(){
		divAns = num1 / num2;
		System.out.println("Division is " + divAns);
	}
	
	void printTotalAnserAdditon(){
		System.out.println("Total of all answers is " + (addAns + subAns + multiAns + divAns));
	}
	
	public static void main(String[] args){
		Assignment2 cal = new Assignment2();
		cal.printAdditon();
		cal.printSubtraction();
		cal.printMultiplication();
		cal.printDivision();
		cal.printTotalAnserAdditon();
	}
}