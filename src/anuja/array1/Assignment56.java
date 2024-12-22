package anuja.array1;

import java.util.Arrays;

/*Return the array having maximum number from each index of given two array.

input : 
{10,55,22,77,88}
{5,102,28,77,18}

output : [10,102,28,77,88]

NOTE : Use sop(Arrays.toString(output)) to print the array without for loop*/

public class Assignment56 {

	public int[] getMaxArrayFromTwoArray(int[] a , int[] b) {
		int[] maxArr = new int[a.length];
		int index = 0; //set this for the output array
		for(int i = 0,j=0 ; i<a.length ; i++, j++) {
			if(a[i] > b[j]) {
			maxArr [index] = a[i];
			index++;
			}
			else 
				{
				maxArr[index] = b[j];
				index++;
				}
		}
		
		return maxArr;
	}
	
	public static void main(String[] args) {
		Assignment56 a = new Assignment56();
		int[] arr1 = {10,55,22,77,88};
		System.out.println("Array1 is ");
		System.out.println(Arrays.toString(arr1));
		System.out.println("-------------------------------------");
		int[] arr2 = {5,102,28,77,18};
		int[] maxArr = a.getMaxArrayFromTwoArray(arr1, arr2);
		System.out.println("Array2 is ");
		System.out.println(Arrays.toString(arr2));
		System.out.println("-------------------------------------");
		System.out.println("New array with max element from arra1 and array2  in each index ");
		System.out.println(Arrays.toString(maxArr));
	}
}	
	

