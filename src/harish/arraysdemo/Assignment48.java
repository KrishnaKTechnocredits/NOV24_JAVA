package harish.arraysdemo;

/**
 * Assignment - 48 : 15th Dec'2024
 * 
 * From given int array, return count of positive numbers.
 * 
 * input : {10,30,-45,66,-10};
 * 
 * output : 3
 */

public class Assignment48 {

	int getCountOfPositiveNumbers(int[] input) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment48 assignment48 = new Assignment48();
		int[] input = { 10, 30, -45, 66, -10 };
		int countOfPositiveNumbers = assignment48.getCountOfPositiveNumbers(input);
		System.out.println("Count of positive numbers in given array of integers is = " + countOfPositiveNumbers);
	}
}