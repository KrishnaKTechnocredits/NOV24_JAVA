/* reverse each string in array and place at in reverse order. First Character in Small case.

input : {"TeCh", "Aashvi", "Credits", "AnsH"}
output : [hsna,stiderC, ivhsaa, hCeT]
*/

package imran.ArrayPrograms;
import java.util.Arrays;

public class Assignment63_ReverseStringArrayFirstCharLower {

	void reverseStringReverseIndex(String[] data)
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
		return str.substring(0, 1).toLowerCase() + str.substring(1, len);
	}
	
	public static void main(String[] args) {
		Assignment63_ReverseStringArrayFirstCharLower assignment63_ReverseStringArrayFirstCharLower_1 = new Assignment63_ReverseStringArrayFirstCharLower();
		String[] str = { "TeCh", "Aashvi", "Credits", "AnsH"};
		System.out.println("The input String Array is : " + Arrays.toString(str));
		assignment63_ReverseStringArrayFirstCharLower_1.reverseStringReverseIndex(str);
	}
}
