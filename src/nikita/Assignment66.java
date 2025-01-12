/* Assignment - 66 : 22nd Dec'2024 [20 min]
reverse word in array at the same place provided word should not have any digit, if word is having any digit do not reverse the word.

input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
output : [hcet, aashvi, stiderc, Hi, olleH]
*/

package nikita;

import java.util.Arrays;

public class Assignment66 {

	boolean isWordHavingDigit(String word)
	{
		boolean flag = false;
		for(int i = 0; i<word.length(); i++)
		{
			char ch = word.charAt(i);
			if(Character.isDigit(ch))
			{
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	String getRevOrder(String input) {
		String str = "";
		for(int i = input.length()-1; i>=0; i--)
		{
			char ch = input.charAt(i);
			str = str + ch;
		}
		return str;
	}
	
	String getWordWithoutDigit(String word) 
	{
		String str = "";
		for(int i = 0; i<word.length(); i++)
		{
			char ch = word.charAt(i);
			if(!Character.isDigit(ch)) {
			str = str + ch;
			}
		}
		return str;
	}
	
	String[] getRevStringArray(String[] arr)
	{
		String[] obj = new String[arr.length];
		for(int i = 0; i<arr.length; i++)
		{
			String word = arr[i];
			if(isWordHavingDigit(word) == true)
			{
				obj[i] = getWordWithoutDigit(word);
			}
			else
			{
				obj[i] = getRevOrder(word);
			}
		}
		return obj;
	}
	
	public static void main(String[] args) {
		String[] str = {"tech", "aa1shvi", "credits", "H4i", "Hello"};
		System.out.println("Given Array is: " + Arrays.toString(str));
		Assignment66 a66 = new Assignment66();
		String[] ans =  a66.getRevStringArray(str);
		System.out.println("Reverse order String array having words without digits are: " + Arrays.toString(ans));
	}
}
