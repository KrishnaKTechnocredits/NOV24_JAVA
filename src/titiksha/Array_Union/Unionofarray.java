//return union of given two array.
//input : 
//{10,19,18}
//{99,8}
//output :  {10,19,18,99,8}

package titiksha.Array_Union;

import java.util.Arrays;

public class Unionofarray {

 int[] getArrayUnion(int[] arr1 , int[] arr2) {
		int union[] = new int[arr1.length + arr2.length];//concating two arrays length
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {//loop for 1st array
			union[count] = arr1[i];
			count++;
		}

		for (int j = 0; j < arr2.length; j++) {//loop for 2nd array
			union[count] = arr2[j];
			count++;
		}

		return union;
	}

	public static void main(String[] args) {
		Unionofarray unionofarray = new Unionofarray();
		int[] arr1 = { 10, 19, 18 };
		int[] arr2 = { 99, 8 };
		int[] output = unionofarray.getArrayUnion(arr1, arr2);
		System.out.println(Arrays.toString(output));

	}
}
