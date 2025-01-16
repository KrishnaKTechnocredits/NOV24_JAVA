/*write a calculator program having 5 methods, add, sub, div, mul and printTotalAns. 
printTotalAns should print addition of answers get from all individual methods.

input : 
num1 = 10;
num2 = 2;

Answer is 45
 */
package nitesh.basicprogram;

class BasicCalculator{
	int num1 =10;
	int num2 =2;
	int sum;
	int sub;
	int div;
	int mul;

	void addition(){
		sum = num1 + num2;
		System.out.println("Sum of num1 and num2 is:"+ " "+ sum);
	} 

	void substraction(){
		sub = num1-num2;
		System.out.println("Subraction of num1 and num2 is:"+ " "+ sub);
	} 

	void division(){
		div = num1 / num2;
		System.out.println("Division of num1 and num2 is :"+" "+ div);
	}

	void multiplication(){
		mul = num1 * num2;
		System.out.println("Multiplication of num1 and num2 is:"+" "+ mul);
	}

	void printTotalAns(){
		int printTotal = (sum+sub+div+mul);
		System.out.println("Total of all Ans is:"+" "+printTotal);
	}

	public static void main(String[] args){
		BasicCalculator basiccalculator = new BasicCalculator();
		basiccalculator.addition();
		basiccalculator.substraction();
		basiccalculator.division();
		basiccalculator.multiplication();
		basiccalculator.printTotalAns();

	}
}