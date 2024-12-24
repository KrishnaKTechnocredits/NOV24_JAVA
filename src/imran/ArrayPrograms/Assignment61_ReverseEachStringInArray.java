/* reverse each string in array at the same place.

input : {"tech", "aashvi", "credits"}
output : [hcet, ivhsaa, stiderc] */

package imran.ArrayPrograms;
import java.util.*;

public class Assignment61_ReverseEachStringInArray {

	void reverseStringElement(String[] data)
	{
		String[] reverseStringElement = new String[data.length];
		for(int i =0;i<= data.length-1;i++)
		{
			reverseStringElement[i]= reverseString(data[i]);
		}
		System.out.println(" The reverse String Element in Array at same place is: "+ Arrays.toString(reverseStringElement));
	}
	
	String reverseString(String word)
	{
		String rev_word ="";
		for(int j=0;j<=word.length()-1;j++)
		{
			rev_word = word.charAt(j) + rev_word;
		}
		return rev_word;
	}
	
	public static void main(String[] args) {
		Assignment61_ReverseEachStringInArray assignment61_ReverseEachStringInArray_1 = new Assignment61_ReverseEachStringInArray();
		String[] arr = {"tech", "aashvi", "credits"};
		System.out.println(" The Given String Array is : " +Arrays.toString(arr) );
		assignment61_ReverseEachStringInArray_1.reverseStringElement(arr);
	}
}
