/*
 * Assignment - 55 : 18th Dec'2024 [15-20 mins]

return union of given two array.

input : 
{ 10, 17, 15 }
{ 50, 12, 55 }

output :  {10,17,15,50,12,55}
 */

package pramod.arraydemo;

public class Assignment55 {

	int[] getUnionOfArray(int[] num1, int[] num2) {
		int count = 0;
		int[] output = new int[num1.length + num2.length];
		for (int i = 0; i < num1.length; i++) {
			output[count] = num1[i];
			count++;
		}
		for (int j = 0; j < num2.length; j++) {
			output[count] = num2[j];
			count++;
		}

		return output;

	}

	public static void main(String[] args) {
		int[] num1 = { 10, 17, 15 };
		int[] num2 = { 50, 12, 55 };
		Assignment55 UA = new Assignment55();
		int[] output = UA.getUnionOfArray(num1, num2);
		System.out.println("Union of given array is as belwo:");
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
