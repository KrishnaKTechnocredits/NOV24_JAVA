/*
 Assignment - 73 : 6th Jan'2024

Shift all the zeros at the begining of an array.

int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {0,0,0,0,5,22,44,55,12,19}
 */

package imran.ArrayPrograms;

import java.util.Arrays;

public class Assignment73_Shift0AtBegining {

	void shift0AtBeginng(int[] data)
	{
		int[] arr1 = new int[data.length];
		int count=0;
		for(int i=0;i<data.length;i++)
		{
			if(data[i]==0)
			{
				count++;
			}
		}
		for(int i=0; i<data.length;i++)
		{
			if(data[i]!=0)
			{
				arr1[count]= data[i];
				count++;
			}
		}
		System.out.println("The Result array is : "+ Arrays.toString(arr1));
	}
	
	public static void main(String[] args) {
		Assignment73_Shift0AtBegining assignment73_Shift0AtBegining_1 = new Assignment73_Shift0AtBegining();
		int[] arr = {5,0,22,44,0,0,55,0,12,19};
		System.out.println("The Given array is : "+ Arrays.toString(arr));
		assignment73_Shift0AtBegining_1.shift0AtBeginng(arr);
	}
	
}
