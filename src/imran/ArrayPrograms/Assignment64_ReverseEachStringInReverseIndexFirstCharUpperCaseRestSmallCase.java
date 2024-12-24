/* reverse each string in array and place at in reverse order, each word first letter capital and rest in lowercase.

input : {"Tech", "Aashvi", "Credits", "Ansh"}
output : [Hsna,Stiderc, Ivhsaa, Hcet]
*/

package imran.ArrayPrograms;
import java.util.*;

public class Assignment64_ReverseEachStringInReverseIndexFirstCharUpperCaseRestSmallCase {

	void reverseString(String[] data)
	{
		String[] revString = new String[data.length];
		for(int i=0,j= data.length-1;i<data.length;i++,j--)
		{
			revString[j] = reverseWord(data[i]);
			revString[j] = returnFirstCharUpperCaseandrestLowerCase(revString[j]);
		}
		System.out.println("The Desired Output String Array is : " + Arrays.toString(revString));
	}
	
	String reverseWord(String word)
	{
		String revWord = "";
		for(int i = 0;i<word.length();i++)
		{
			char ch = word.charAt(i);
			revWord = ch+ revWord;
		}
		return revWord;
	}
	
	String returnFirstCharUpperCaseandrestLowerCase(String word)
	{
		String str = word;
		int len = word.length();
		return str.substring(0, 1).toUpperCase() + str.substring(1, len).toLowerCase();
	}
	
	public static void main(String[] args) {
		Assignment64_ReverseEachStringInReverseIndexFirstCharUpperCaseRestSmallCase assignment64_ReverseEachStringInReverseIndexFirstCharUpperCaseRestSmallCase_1 = new Assignment64_ReverseEachStringInReverseIndexFirstCharUpperCaseRestSmallCase();
		String[] str = {"tech", "aashvi", "Credits", "Ansh"};
		System.out.println("The input String Array is : " + Arrays.toString(str));
		assignment64_ReverseEachStringInReverseIndexFirstCharUpperCaseRestSmallCase_1.reverseString(str);
	}
}
