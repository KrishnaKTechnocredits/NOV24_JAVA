/* reverse each string in array and place at in reverse order.

input : {"tech", "aashvi", "Credits", "Ansh"}
output : [hsnA, stiderC, ivhsaa, hcet]
*/

package imran.ArrayPrograms;
import java.util.Arrays;

public class Assignment62_ReverseEachStringInArrayInReverseIndex {

	void reverseStringReverseInedex(String[] data)
	{
		String[] revString = new String[data.length];
		for(int i =0, j=data.length-1;i<data.length;i++, j--)
		{
			revString[j] = revWord(data[i]);
		}
		System.out.println("The Desired Output String Array is : " + Arrays.toString(revString));
	}
	
	String revWord(String word)
	{
		String revWord = "";
		for(int j=0;j<=word.length()-1;j++)
		{
			char ch = word.charAt(j);
			revWord = ch + revWord;
		}
		return revWord;
	}
	
	public static void main(String[] args) {
		Assignment62_ReverseEachStringInArrayInReverseIndex assignment62_ReverseEachStringInArrayInReverseIndex_1 = new Assignment62_ReverseEachStringInArrayInReverseIndex();
		String[] str = {"tech", "aashvi", "Credits", "Ansh"};
		System.out.println("The input String Array is : " + Arrays.toString(str));
		assignment62_ReverseEachStringInArrayInReverseIndex_1.reverseStringReverseInedex(str);
	}
}
