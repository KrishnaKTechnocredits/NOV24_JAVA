/*
 Assignment - 71 : 5th Jan'2025 [IMP]

return the word having highest digits in the given String .
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : C2red3i3t4s5
 */

package imran.ArrayPrograms;
import java.util.*;

public class Assignment71_ReturnHighestDigitStringFromArray {

	String getHighestDigitString(String data)
	{
		String[] str = data.split(" ");
		int maxDigitLen=0, count=0;
		String maxDigitString="";
		for(int i=0; i<str.length;i++)
		{
			String word= str[i];
			for(int j=0;j<word.length();j++)
			{
				char ch= word.charAt(j);
				if(Character.isDigit(ch))
				{
					count++;
				}
						
			}
			if(count>maxDigitLen)
			{
				maxDigitLen= count;
				maxDigitString = word;
			}
		}
		return maxDigitString;	
	}
	
	public static void main(String[] args) {
		Assignment71_ReturnHighestDigitStringFromArray assignment71_ReturnHighestDigitStringFromArray_1 = new Assignment71_ReturnHighestDigitStringFromArray();
		String arr = "H2i22 H1ello Techno C2red3i3t4s5";
		System.out.println("The Given String is : "+ arr);
		String maxStringDigit = assignment71_ReturnHighestDigitStringFromArray_1.getHighestDigitString(arr);
		System.out.println(" The Maxmimun digit Contaning word is : "+ maxStringDigit);
	}
}
