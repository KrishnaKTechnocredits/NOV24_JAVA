//Assignment - 52 : 16th Dec'2024 [15 mins]
//
//return maximum and minimum number from given array.

package harshada.array2;
import java.util.Arrays;
public class ArrayAss7 {
	
	int[] getMinMaxFromArr(int[] input) {
		int[]output=new int[2];
		int maxNum = input[0], minNum = input[0];

		for (int i = 1; i < input.length; i++) {
			if (maxNum < input[i]) {
				maxNum = input[i];
			}

			if (input[i] < minNum) {
				minNum = input[i];
			}
		}
		output[0]=maxNum;
		output[1]=minNum;
		return output;
	}
	
	public static void main(String[] args) {
		ArrayAss7 arrayAss7 = new ArrayAss7();
		int[] arr2 = { -44, -45, -22, -25, -47, 29, 46 };
		int[]minMaxArr=arrayAss7.getMinMaxFromArr(arr2);
		System.out.println(Arrays.toString(minMaxArr));
	}
}
