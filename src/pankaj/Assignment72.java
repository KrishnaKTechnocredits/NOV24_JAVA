/*Assignment - 72 : 6th Jan'2024

Shift all the zeros at the end of an array.

int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {5,22,44,55,12,19,0,0,0,0}    */

package pankaj;

import java.util.Arrays;

public class Assignment72 {
	
	int index=0;
	void shiftZero(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]!=0))
			{
				arr[index]=arr[i];
				index++;
			}
		}
		for(int i=index;i<arr.length;i++)
		{
			arr[i]=0;
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr={5,0,22,44,0,0,55,0,12,19};
		Assignment72 A=new Assignment72();
		A.shiftZero(arr);
		
		
		      System.out.println(Arrays.toString(arr));
		
	}

}
