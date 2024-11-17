/*Assignment - 2 : 10th Nov'2024
write a calculator program having 5 methods, add, sub, div, mul and printTotalAns. 
printTotalAns should print addition of answers get from all individual methods.

input:  
num1 = 10;
num2 = 2;

Answer is 45*/

package MayurW;

class NewCalculator{
	int num1=10;
	int num2=2;
	int ans;
	int totalAns=0;
	
	void add(){
		ans=num1+num2;
		System.out.println("Addition answer is = "+ans);
	}
	
	void subtract(){
		ans=num1-num2;
		System.out.println("Subtraction answer is = "+ans);
	}
	
	void multiplication(){
		ans=num1*num2;
		System.out.println("Multiplication answer is = "+ans);
	}
	
	void division(){
		ans=num1/num2;
		System.out.println("Division answer is = "+ans);
	}
	
	void printTotalAns(){
		System.out.println("Addition of all answers is = "+totalAns);
	}
	
	public static void main(String[] args){
		NewCalculator newCalculator = new NewCalculator();
		newCalculator.add();
		newCalculator.totalAns=newCalculator.totalAns+newCalculator.ans;
		newCalculator.subtract();
		newCalculator.totalAns=newCalculator.totalAns+newCalculator.ans;
		newCalculator.multiplication();
		newCalculator.totalAns=newCalculator.totalAns+newCalculator.ans;
		newCalculator.division();
		newCalculator.totalAns=newCalculator.totalAns+newCalculator.ans;
		newCalculator.printTotalAns();
	}
}