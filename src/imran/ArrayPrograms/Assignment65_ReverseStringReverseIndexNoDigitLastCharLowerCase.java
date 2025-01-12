/*
 reverse each string in array and place at in reverse order. No Digit , LastCharacter in Lower Case,FirstCharacterUpperCase

input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
output : [HSNa,StidErc, IvHsaa, HCet]
 */

package imran.ArrayPrograms;
import java.util.*;

public class Assignment65_ReverseStringReverseIndexNoDigitLastCharLowerCase {

	void reverseArray(String[] data)
	{
		String[] revStringArray = new String[data.length];
		for(int i=0, j=data.length-1;i<data.length ;i++, j--)
		{
			revStringArray[j] = reverseWord(data[i]);
			revStringArray[j] = noDigit(revStringArray[j]);
			revStringArray[j] = firstCharUpperLastCharLower(revStringArray[j]);
		}
		System.out.println(" The Result String Array is " + Arrays.toString(revStringArray));
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
		char ch;
		for(int i=0;i<word.length();i++)
		{
			ch= word.charAt(i);
			if(!Character.isDigit(ch))
			{
				str = str + ch;
			}
		}
		return str;
	}
	
	String firstCharUpperLastCharLower(String word)
	{
		int len = word.length();
		return word.substring(0,1).toUpperCase() + word.substring(1, len-1) + word.substring(len-1,len).toLowerCase();
	}
	
	public static void main(String[] args) {
		Assignment65_ReverseStringReverseIndexNoDigitLastCharLowerCase assignment65_ReverseStringReverseIndexNoDigitLastCharLowerCase_1 = new Assignment65_ReverseStringReverseIndexNoDigitLastCharLowerCase();
		String[] arr = {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"};
		System.out.println(" The Given  String Array is: " + Arrays.toString(arr));
		assignment65_ReverseStringReverseIndexNoDigitLastCharLowerCase_1.reverseArray(arr);
	}
}
