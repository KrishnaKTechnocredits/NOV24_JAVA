package ajay;
/*Problem Statement:- Assignment - 2 : 10th Nov'2024
write a calculator program having 5 methods, add, sub, div, mul and printTotalAns. 
printTotalAns should print addition of answers get from all individual methods.
input:  
num1 = 10;
num2 = 2;
Answer is 45 */

class Calculator{

	int num1=10;
	int num2=2;
	int add;
	int sub;
	int mul;
	int div;
	int total;
	void add(){
		
		add=num1+num2;
		System.out.println("Addition is = " + add);
	}
	void sub(){
		sub=num1-num2;
		System.out.println("Subtraction is = " + sub);
	}
	void mul(){
		mul=num1*num2;
		System.out.println("Multiplication is = " + mul);
	}
	void div(){
		div=num1/num2;
		System.out.println("Division is = " + div);
	}
	void printTotal(){
		total=add+sub+mul+div;
		System.out.println("Total of (add + sub + mul + div) is = " +total);
		
	}
	public static void main(String[] args){
		Calculator calculator=new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
		calculator.printTotal();
	}
}