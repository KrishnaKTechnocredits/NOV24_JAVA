/*Assignment - 63 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order;
all word should be in lowercase.

input : {"TeCh", "Aashvi", "Credits", "AnsH"}
output : [hsna,stiderc, ivhsaa, hcet]*/

package pankaj;

import java.util.Arrays;

public class Assignment63 {
	
	String revWord(String str)
	{
		String word=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			word=word+str.charAt(i);
		}
		return word;
		
	}
	String[] revArray(String[] arr)
	{
		String[] arrone=new String[arr.length];
		for(int i=0,j=arr.length-1;i<arr.length;i++,j--)
		{
			String word=revWord(arr[i]);
			arrone[j]=word.toLowerCase();
		}
		return arrone;
	}
	public static void main(String[] args)
	{
		Assignment63 A=new Assignment63();
		String[] arr= {"TeCh", "Aashvi", "Credits", "AnsH"};
		String[] ome=A.revArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(ome));
	}

}
