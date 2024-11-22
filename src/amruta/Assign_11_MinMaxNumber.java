/*
 * Assignment - 11 : 20th Nov'2024 [20 mins]

Write 2 methods, one method to find maximum number from 2 numbers,
other to find minimum number from given 2 numbers.
sample input :
num1 : 10
num2 : 17
output : 10 is smaller between 10 and 17.

sample input :
num1 : 10
num2 : 17
output : 17 is bigger between 10 and 17.
 */
package amruta;

public class Assign_11_MinMaxNumber {

	void findMaximumNumber(int num1, int num2) {
		if (num1 > num2)
			System.out.println(num1 + " is bigger between " + num1 + " & " + num2);
		else
			System.out.println(num2 + " is bigger between " + num1 + " & " + num2);
	}

	static void findMinimumNumber(int num1, int num2) {
		if (num1 < num2)
			System.out.println(num1 + " is smaller between " + num1 + " & " + num2);
		else
			System.out.println(num2 + " is bigger between " + num1 + " & " + num2);
	}

	public static void main(String[] args) {
		Assign_11_MinMaxNumber a11 = new Assign_11_MinMaxNumber();
		a11.findMaximumNumber(10, 17);
		findMinimumNumber(10, 17);
	}
}
