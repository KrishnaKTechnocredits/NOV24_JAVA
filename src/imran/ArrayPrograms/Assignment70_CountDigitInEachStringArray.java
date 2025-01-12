/*
 Assignment - 70 : 5th Jan'2025 [IMP]

Print count of digit in each word.
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : 
H2i22 -> 3
H1ello -> 1
Techno -> 0
C2red3i3t4s5 -> 5
 */

package imran.ArrayPrograms;

public class Assignment70_CountDigitInEachStringArray {

	void getDigitCount(String data)
	{
		String[] str = data.split(" ");
		for(int i=0;i<str.length;i++)
		{
			int count=0;
			String word= str[i];
			for(int j=0; j<word.length();j++)
			{
				char ch = word.charAt(j);
				if(Character.isDigit(ch))
				{
					count++;
				}
			}
			System.out.println(" The String is ---> "+ word +" and Total digit presesnt is --> "+ count);
		}
	}
	
	public static void main(String[] args) {
		Assignment70_CountDigitInEachStringArray assignment70_CountDigitInEachStringArray_1 = new Assignment70_CountDigitInEachStringArray();
		String arr ="H2i22 H1ello Techno C2red3i3t4s5";
		assignment70_CountDigitInEachStringArray_1.getDigitCount(arr);
	}
}
