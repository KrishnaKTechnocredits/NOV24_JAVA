package pankaj;

/*Assignment - 62 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order.

input : {"tech", "aashvi", "Credits", "Ansh"}
output : [hsnA,stiderC, ivhsaa,hcet]*/

import java.util.*;
public class Assignment62
{
	String revWord(String word)
	{
		String output=" ";
		for(int i=word.length()-1;i>=0;i--)
		{
				output=output+word.charAt(i);
		}
		return output;
	}
	String[] revArray(String[] arr)
	{
		String[] outone= new String[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			outone[i]=revWord(arr[i]);
		}
		return outone;
	}
	String[] revOrderArray(String[] arr1)
	{
			String[] outtwo=new String[arr1.length];
		
			for(int i=0,j=arr1.length-1;i<arr1.length;i++,j--)
			{
				outtwo[j]=(arr1[i]);	
			}
		return outtwo;
	}
	public static void main(String[] args)
	{
			Assignment62 A=new Assignment62();
			String[] arr={"tech", "aashvi", "Credits", "Ansh"};
			String[] firstArray=A.revArray(arr);
			System.out.println("The given array is         ==>>"+Arrays.toString(arr));
			System.out.println("The words are reversed     ==>>"+Arrays.toString(firstArray));
			System.out.println("The whole array is reversed==>>"+Arrays.toString(A.revOrderArray(firstArray)));
	}



}