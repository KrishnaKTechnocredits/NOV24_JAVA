package kavita;
/*return union of given two array.

input : 
{10,19,18}
{99,8}

output :  {10,19,18,99,8}
Time:15m*/
import java.util.Arrays;

public class Assignment55 {
	int[] getUnionOfArray(int[] input1, int[] input2) {
		int[] output = new int[input1.length + input2.length];
		int count = 0;
		for (int i = 0, j = 0; i < input1.length + input2.length; i++, j++) {
			if (i < input1.length) {
				output[i] = input1[j];
			} else if (count < input2.length) {
				output[i] = input2[count];
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment55 assignment55 = new Assignment55();
		int[] input1 = { 10, 19, 18 };
		int[] input2 = { 99, 8 };
		int[] ans=assignment55.getUnionOfArray(input1,input2);
		System.out.println(Arrays.toString(ans));
	}
}
