/*Assignment - 56 : 20th Dec'2024 [15 mins]
Return the array having maximum number from each index of given two array.

input : 
{10,55,22,77,88}
{5,102,28,77,18}

output : [10,102,28,77,88]
*/

package prashant;
import java.util.Arrays;
public class Assignment56 {
	
	int[] getMaxNumOfIndex(int[] input, int[] input1) 
	{
		int[] output = new int[input.length];
		
		for (int i = 0; i < output.length; i++) 
		{
			if (input[i] >= input1[i]) 
			{
				output[i] = input[i];
			} 
			else if (input[i] <= input1[i])
			{
				output[i] = input1[i];
			}
		}
		return output;
	}
	
	

	public static void main(String[] args) 
	{
		
		int[] input = { 10, 55, 22, 77, 88 };
		int[] input1 = { 5, 102, 28, 77, 18 };
		
		Assignment56 assignment56=new Assignment56();
		int[] result=assignment56.getMaxNumOfIndex(input, input1);
		System.out.println(Arrays.toString(result));
		
	}


}
