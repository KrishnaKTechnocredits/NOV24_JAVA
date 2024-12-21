/*Assignment - 55 : 18th Dec'2024 [15-20 mins]

return union of given two array.

input : 
{10,19,18}
{99,8}

output :  {10,19,18,99,8}*/

package SheetalG;

import java.util.Arrays;

public class UnionArray {
	public static void main(String[] args) {
		int[] arr1 = {10,19,18};
		int[] arr2 = {99,8};
		int[] union = new int[arr1.length+arr2.length];
		System.out.println("Input : "+Arrays.toString(arr1));
		System.out.println("Input : "+Arrays.toString(arr2));
		
		for(int i=0;i<arr1.length;i++) {
			union[i]=arr1[i];
		}
		int i=arr1.length;
		for(int j=0;j<arr2.length;j++) {
			union[i]=arr2[j];
			i++;
		}
		System.out.println("Output : "+ Arrays.toString(union));
	}
}
