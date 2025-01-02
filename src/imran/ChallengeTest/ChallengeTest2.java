/*
 * Challenge - 2: Given an array of strings, reverse each string in the array only if the string contains more than one vowel (a, e, i, o, u). The resulting array should reflect the modifications.

Example:
Input:
String[] input = {"apple", "sky", "orange", "try", "eagle"};
Output:
String[] output = {"elppa", "sky", "egnaro", "try", "elgae"};
 */

package imran.ChallengeTest;
import java.util.*;

public class ChallengeTest2 {

	String[] getStringData(String[] data)
	{
		String[] resArray = new String[data.length];
		int vowel = 0;
		for(int i=0;i<data.length;i++)
		{
			vowel = checkWordVowel(data[i]);
			if(vowel>=1)
			{
				resArray[i] = reverseWord(data[i]);
			}
			else
			{
				resArray[i] = data[i];
			}
		}
		return resArray;
	}
	
	String reverseWord(String word)
	{
		String new_word = "";
		for(int i=0;i<=word.length()-1;i++)
		{
			char ch = word.charAt(i);
			new_word = ch + new_word;
		}
		return new_word;
	}
	
	int checkWordVowel(String word)
	{
		int count=0;
		for(int i=0;i<=word.length()-1;i++)
		{
			char ch = word.charAt(i);
			if(ch == 'a' || ch== 'e'|| ch == 'i' || ch== 'o'||ch == 'u' )
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		ChallengeTest2 challengeTest2_1 = new ChallengeTest2();
		String[] input = {"apple", "sky", "orange", "try", "eagle"};
		System.out.println(" the Given array is " + Arrays.toString(input));
		String[] result = challengeTest2_1.getStringData(input);
		System.out.println(" the output array is " + Arrays.toString(result));
	}
}
