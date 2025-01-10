/* Assignment - 56 : 20th Dec'2024 [15 mins]
Return the array having maximum number from each index of given two array.

input : 
{10,55,22,77,88}
{5,102,28,77,18}

output : [10,102,28,77,88]

NOTE : Use sop(Arrays.toString(output)) to print the array without for loop
*/

package nikita;

import java.util.Arrays;

public class Assignment56 {
	
	int[] getUnionOfMaxNumbersFromArrays(int[] num1, int[] num2) {
		int[] obj = new int[num1.length];
		int count = 0;
		
		for(int i = 0, k = 0; i<num1.length; i++, k++) 
		{
			if(num1[i] > num2[k]) 
			{
			obj[count] = num1[i];
			count++;
			}
		else {
			obj[count] = num2[k];
			count++;
		}
	}
		return obj;
	}

	public static void main(String[] args) {
		int[] num1 = {10,55,22,77,88};
		int[] num2 = {5,102,28,77,18};
		Assignment56 a56 = new Assignment56();
		int[] ans = a56.getUnionOfMaxNumbersFromArrays(num1, num2);
		System.out.println(Arrays.toString(ans));
	}

}
