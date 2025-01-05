package kavita;

import java.util.Arrays;

public class Challenge1 {

	int getArraySum(int[] input) {
		int sumArray = 0;
		for (int i = 0; i < input.length; i++) {
			sumArray = sumArray + input[i];
		}
		// System.out.println("Sum of the all the elements is: "+sumArray);
		return sumArray;
	}

	int[] getSumOfElement(int[] input) {
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			output[i] = getArraySum(input) - input[i];
		}
		return output;

	}

	public static void main(String[] args) {
		Challenge1 c = new Challenge1();
		int[] input = { 3, 5, 7, 1, 9 };
		// System.out.println(Arrays.toString(input));
		int[] ans = c.getSumOfElement(input);
		System.out.println(Arrays.toString(ans));

	}
}
