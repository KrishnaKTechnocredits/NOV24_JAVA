/*  Assignment - 55 : 18th Dec'2024 [15-20 mins]

return union of given two array.

input : 
{10,19,18}
{99,8}

output :  {10,19,18,99,8}
*/

package nikita.arraysdemo;

import java.util.Arrays;

public class Assignment55 {
	
	int[] getUnionOfArray(int arr1[], int arr2[]) {
		int[] obj = new int[arr1.length + arr2.length];
		int count = 0;
		
		for(int i = 0; i<arr1.length; i++, count++) {
			obj[count] = arr1[i];
		}
		
		for(int k = 0; k<arr2.length; k++, count++) {
			obj[count] = arr2[k];
		}
		return obj;
	}

	public static void main(String[] args) {
		int[] arr1 = {10,19,18};
		int[] arr2 = {99, 8};
		Assignment55 a55 = new Assignment55();
		int[] ans = a55.getUnionOfArray(arr1, arr2);
		System.out.println(Arrays.toString(ans));
	}
}


