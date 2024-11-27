/*Assignment - 11 : 20th Nov'2024 [20 mins]

Write 2 methods, one method to find maximum number from 2 numbers,
other to find minimum number from given 2 numbers.
sample input :
num1 : 10
num2 : 17
output : 10 is smaller between 10 and 17.

sample input :
num1 : 10
num2 : 17
output : 17 is bigger between 10 and 17.*/
package pooja.ifelse;

public class Assignment_11 {

	void maximumNumber(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " Is bigger between " + num1 + " and " + num2);
		} else {
			System.out.println(num2 + " Is bigger between " + num1 + " and " + num2);
		}
	}

	void minmumNumber(int num1, int num2) {
		if (num1 < num2) {
			System.out.println(num1 + " Is smaller between " + num1 + " and " + num2);
		} else {
			System.out.println(num2 + " Is smaller between " + num1 + " and " + num2);
		}
	}

	public static void main(String[] args) {
		Assignment_11 assignment_11 = new Assignment_11();
		assignment_11.maximumNumber(10, 17);
		assignment_11.minmumNumber(50, 90);
	}
}
