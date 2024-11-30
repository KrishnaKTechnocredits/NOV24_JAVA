package Assignments1to10;

import java.util.Scanner;

public class Assignment2_Calculator {
	
	int num1 = 10;
	int num2 =2;
	int temp ;
	void getSum() {
		int sumOfNumbers = num1+num2;
		temp += sumOfNumbers; 
		System.out.println(" sum of numbers is " + sumOfNumbers);
	}
	
	void getDiv() {
		int divOfNumbers = num1/num2;
		temp += divOfNumbers;
		System.out.println(" sub of numbers is " + divOfNumbers);
	}
	
	void getSub() {
		int subOfNumbers = num1-num2;
		temp += subOfNumbers;
		System.out.println(" sum of numbers is " + subOfNumbers);
	}

	void getMul() {
		int mulOfNumbers = num1*num2;
		temp +=mulOfNumbers;
		System.out.println(" sum of numbers is " + mulOfNumbers);
	}
	
	void printTotalAns() {
		
		System.out.println(" total of numbers is " + temp);
	}

	public static void main(String[] args) {
		Assignment2_Calculator test = new Assignment2_Calculator();
		test.getSum();
		test.getSub();
		test.getMul();
		test.getDiv();
		test.printTotalAns();
	}
}
