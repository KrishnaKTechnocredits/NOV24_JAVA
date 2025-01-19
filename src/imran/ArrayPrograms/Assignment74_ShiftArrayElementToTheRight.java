/*
 Assignment - 74 : 8th Jan
Rotate all the numbers of an array to the right by one position. 
input : {10,20,30,40,50}
output : {50,10,20,30,40};
         {40,50,10,20,30}
 */
package imran.ArrayPrograms;
import java.util.*;
public class Assignment74_ShiftArrayElementToTheRight {

	int[] getArrayShift(int[] data)
	{
		int[] arr1= new int[data.length];
		for(int i=0;i<=data.length-1;i++)
		{
			if(i!=data.length-1)
			{
				arr1[i+1] = data[i];
			}
			else
			{
				arr1[0] = data[i];
			}
		}
		return arr1;
		//System.out.println("The Result array is: "+ Arrays.toString(arr1));
	}
	
	public static void main(String[] args) {
		Assignment74_ShiftArrayElementToTheRight assignment74_ShiftArrayElementToTheRight_1 = new Assignment74_ShiftArrayElementToTheRight();
		int[] arr = {10,20,30,40,50};
		System.out.println("The Given array is: "+ Arrays.toString(arr));
		int[] arr2 = assignment74_ShiftArrayElementToTheRight_1.getArrayShift(arr);
		int[] arr3 = assignment74_ShiftArrayElementToTheRight_1.getArrayShift(arr2);
		System.out.println("The Result array is: "+ Arrays.toString(arr2));
		System.out.println("                     "+ Arrays.toString(arr3));
	}
}
