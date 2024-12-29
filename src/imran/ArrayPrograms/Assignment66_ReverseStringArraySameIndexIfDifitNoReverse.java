/*
 reverse word in array at the same place provided word should not have any digit, if word is having any digit do not reverse the word. exclude digit only

input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
output : [hcet, aashvi, stiderc, Hi, olleH]
 */

package imran.ArrayPrograms;

import java.util.Arrays;

public class Assignment66_ReverseStringArraySameIndexIfDifitNoReverse {

	String[] reverseArray(String[] data)
	{
		String[] revStringArray = new String[data.length];
		for(int i=0;i<data.length;i++)
		{
			revStringArray[i] = reverseWord(data[i]);
			revStringArray[i] = noDigit(revStringArray[i]);
			//revStringArray[i] = firstCharUpperLastCharLower(revStringArray[i]);
		}
		return revStringArray;
	}
	
	String reverseWord(String word)
	{
		String revWord = "";
		char ch;
		for(int i= 0;i<word.length();i++)
		{
			ch = word.charAt(i);
			revWord = ch + revWord;
		}
		return revWord;
	}
	
	String noDigit(String word)
	{
		String str = "";
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			char ch= word.charAt(i);
			if(!Character.isDigit(ch))
			{
				str = str + ch;
			}
			else 
			{
				count++;
			}
		}
		if(count == 0)
		{
			return str;
		}
		else
		{
			str = reverseWord(str);
			return str;
		}
	}
	
	public static void main(String[] args) {
		Assignment66_ReverseStringArraySameIndexIfDifitNoReverse assignment66_ReverseStringArraySameIndexIfDifitNoReverse_1 = new Assignment66_ReverseStringArraySameIndexIfDifitNoReverse();
		String[] arr = {"tech", "aa1shvi", "credits", "H4i", "Hello"};
		System.out.println(" The Given  String Array is: " + Arrays.toString(arr));
		String[] resultArray = assignment66_ReverseStringArraySameIndexIfDifitNoReverse_1.reverseArray(arr);
		System.out.println(" The Result String Array is " + Arrays.toString(resultArray));
	}
}
