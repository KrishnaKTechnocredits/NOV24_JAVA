package pratiksha;

import java.util.Arrays;

public class Assignment55 {
/*
 Assignment - 55 : 18th Dec'2024 [15-20 mins]

return union of given two array.

input : 
{10,19,18}
{99,8}

output :  {10,19,18,99,8}
 */
	
	static int[] output;
	static int i;

	int[] getUnion(int[] digit, int[] digit1) {
		int[] output = new int[digit.length + digit1.length];
		for (int i = 0; i <= digit.length - 1; i++) {
			output[i] = digit[i];
			if (i == digit.length - 1) {
				i++;
				for (int j = 0; j <= digit1.length - 1; i++, j++) {
					output[i] = digit1[j];
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment55 assign55 = new Assignment55();
		int[] digit = { 10, 19, 18 };
		int[] digit1 = { 99, 8 };
		int[] ans = assign55.getUnion(digit, digit1);
		System.out.println(Arrays.toString(ans));
}
}
