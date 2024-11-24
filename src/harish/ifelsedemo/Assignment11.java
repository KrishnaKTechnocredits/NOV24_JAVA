package harish.ifelsedemo;

/**
 * Assignment 11 - Program to print greater and smaller numbers between two
 * numbers
 */

public class Assignment11 {

	void maximumNumber(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is greater between " + num1 + " and " + num2);
		} else {
			System.out.println(num2 + " is greater between " + num1 + " and " + num2);
		}
	}

	void minimumNumber(int num1, int num2) {
		if (num1 < num2) {
			System.out.println(num1 + " is smaller between " + num1 + " and " + num2);
		} else {
			System.out.println(num2 + " is smaller between " + num1 + " and " + num2);
		}
	}

	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.maximumNumber(10, 17);
		assignment11.minimumNumber(25, 33);
	}
}
