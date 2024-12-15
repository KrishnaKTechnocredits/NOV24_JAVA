/*
Assignment - 48 : 15th Dec'2024 [15 mins] [5 mins]

From given int array, return count of positive numbers.

input : {10,30,-45,66,-10};
output : 3 
*/
package pramod;

class Assignment48 {

	void printPositiveNumbers(int[] input) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				count = count + 1;
			}
		}
		System.out.println("Count of numbers which are positive is: " + count);
	}

	public static void main(String[] args) {
		Assignment48 A48 = new Assignment48();
		int[] input = { 10, 30, -45, 66, -10 };
		A48.printPositiveNumbers(input);
	}
}