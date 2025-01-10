/*Assignment - 73 : 6th Jan'2024

Shift all the zeros at the begining of an array.

int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {0,0,0,0,5,22,44,55,12,19}      */

package pankaj;

import java.util.Arrays;

public class Assignment73 {
	
	
	void shiftZero(int[] arr)
	{
		int index=arr.length-1;
		for(int i=arr.length-1;i>=0;i--)
		{
			if((arr[i]!=0))
			{
				arr[index]=arr[i];
				index--;
			}
		}
		for(int i=index;i>=0;i--)
		{
			arr[i]=0;
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr={5,0,22,44,0,0,55,0,12,19};
		Assignment73 A=new Assignment73();
		A.shiftZero(arr);
		
		
		      System.out.println(Arrays.toString(arr));
		
	}

}