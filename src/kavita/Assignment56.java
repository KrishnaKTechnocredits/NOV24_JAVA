package kavita;
/*Return the array having maximum number from each index of given two array.
input : 
{10,55,22,77,88}
{5,102,28,77,18}
output : [10,102,28,77,88]
NOTE : Use sop(Arrays.toString(output)) to print the array without for loop
Time:11m*/
import java.util.Arrays;

public class Assignment56 {
	
		int[] getMaxNumber(int[] input1, int[] input2) {
			int[] output = new int[input1.length];
			for (int i = 0; i < output.length; i++) {
				if (input1[i] > input2[i]) {
					output[i] = input1[i];
				} else {
					output[i] = input2[i];
				}
			}
			return output;
		}
			
			public static void main(String[] args) {
				Assignment56 a = new Assignment56();
				int[] arr1 = { 10, 55, 22, 77, 88 };
				int[] arr2 = { 5, 102, 28, 77, 18 };
				int[] maxOutput = a.getMaxNumber(arr1, arr2);
				System.out.println(Arrays.toString(maxOutput));
			}
		}


