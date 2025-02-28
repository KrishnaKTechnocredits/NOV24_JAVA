/* Assignment - 72 : 6th Jan'2024

Shift all the zeros at the end of an array.

int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {5,22,44,55,12,19,0,0,0,0}*/


package nikita.arraysdemo;

import java.util.Arrays;

public class Assignment72 {

	int[] getUpdatedArray(int arr[]) 
	{
		int[] num = new int[arr.length];
		int j = 0;
		
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i]>0)
			{
				num[j] = arr[i];
 				j++;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,0,22,44,0,0,55,0,12,19};
		Assignment72 a72 = new Assignment72();
		int ans[] = a72.getUpdatedArray(arr);
		System.out.println(Arrays.toString(ans));
	}
}
