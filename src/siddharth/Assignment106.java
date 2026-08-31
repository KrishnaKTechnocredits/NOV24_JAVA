package siddharth;
/*
Assignment 106: Print Fibonacci Series. 
Input: 10
Output: 0 1 1 2 3 5 8 13 21 34

hint: Fibonacci Series starts with 0 & 1, + sum of last 2 num. Input: 10 means first 10 numbers
 */
public class Assignment106 {
	
	void printFibonacci(int n) {
		int firstNumber=0;
		int secondNumber=1;
		System.out.println("Input : "+n);
		System.out.print("Output : "+firstNumber+" "+secondNumber);
		
		for(int count=3;count<=n;count++) {
			int next = firstNumber + secondNumber;
			System.out.print(" "+next);
			firstNumber = secondNumber;
			secondNumber = next;
		}
	}
	
	public static void main(String[] args) {
		Assignment106 assignment106 = new Assignment106();
		int input = 10;
		assignment106.printFibonacci(input);
	}
}
