package prem;

public class MaxMinNumber {
	
	void min(int num1,int num2) {
		if (num1<num2) {
			System.out.println(num1 + " is smaller between "+ num1 +" and " + num2);
		}else {
			System.out.println(num2 + " is bigger between "+ num1 +" and " + num2);
		}
	}
	void max(int num1, int num2) {
		if (num1> num2) {
			System.out.println(num1 + " is bigger between "+ num1 +" and " + num2);
		}else {
			System.out.println(num2 + " is smaller between "+ num1 +" and " + num2);
		}		
	}
	
	public static void main(String[] args) {
		MaxMinNumber maxMinNumber = new MaxMinNumber();
		maxMinNumber.min(10,17);
		maxMinNumber.max(10,17);
	}
}
