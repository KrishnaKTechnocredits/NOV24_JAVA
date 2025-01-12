/*
 * Challenge - 1: replace each element in the array with the sum of all other elements in the array. The resulting array should be stored in a new array output.

Example:
Input: int[] input = {3, 5, 7, 1, 9};
Output: int[] output = {22, 20, 18, 24, 16};
 */

package imran.ChallengeTest;
import java.util.*;

public class ChallengeTest1 {

	int[] getStringData(int[] data)
	{
		int[] resArray = new int[data.length];
		for(int i=0;i<data.length;i++)
		{
			int sum =0;
			for(int j=0;j<data.length;j++)
			{
				if(i != j)
				{
					sum = sum + data[j];
				}
			}
			resArray[i]= sum;
		}
		return resArray;
	}
	
	public static void main(String[] args) {
		ChallengeTest1 challengeTest1_1 = new ChallengeTest1();
		int[] arr = {3, 5, 7, 1, 9};
		System.out.println(" the Given array is " + Arrays.toString(arr));
		int[] result = challengeTest1_1.getStringData(arr);
		System.out.println(" the output array is " + Arrays.toString(result));
	}
}
