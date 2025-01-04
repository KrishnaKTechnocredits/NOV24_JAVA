/*Assignment - 48 : 15th Dec'2024 [15 mins]

From given int array, return count of positive numbers.

input : {10,30,-45,66,-10};
output : 3 */

package SheetalG;

import java.util.Arrays;

public class CountOfPositiveNumber {
	public static void main(String[] args) {
		int count=0;
		int[] input = {10,30,-45,66,-10};
		for(int i=0;i<input.length;i++) {
			if(input[i]>0) {
				count++;
			}
		}
		System.out.println("Input : " +Arrays.toString(input));
		System.out.println("Output : "+count);
	}

}
