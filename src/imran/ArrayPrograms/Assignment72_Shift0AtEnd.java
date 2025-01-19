/*
 Assignment - 72 : 6th Jan'2024

Shift all the zeros at the end of an array.

int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {5,22,44,55,12,19,0,0,0,0}
 */

package imran.ArrayPrograms;
import java.util.*;
public class Assignment72_Shift0AtEnd {

	void shift0atEnd(int[] data)
	{
		int[] arr1 = new int[data.length];
		int j=0;
		for(int i=0; i<data.length;i++)
		{
			if(data[i]!=0)
			{
				arr1[j]= data[i];
				j++;
			}
		}
		System.out.println("The Result array is : "+ Arrays.toString(arr1));
	}
	
	public static void main(String[] args) {
		Assignment72_Shift0AtEnd assignment72_Shift0AtEnd_1 = new Assignment72_Shift0AtEnd();
		int[] arr = {5,0,22,44,0,0,55,0,12,19};
		System.out.println("The Given array is : "+ Arrays.toString(arr));
		assignment72_Shift0AtEnd_1.shift0atEnd(arr);
	}
}
