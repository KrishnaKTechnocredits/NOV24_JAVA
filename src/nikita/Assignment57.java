/* Assignment - 57 : 21th Dec'2024 [15 mins]
Return the maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : Technocredits*/

package nikita;

public class Assignment57 {
	
	void getMaxLengthStringFromArrays(String[] str) {
		int maxLen = str[0].length();
		String maxName = str[0];
		
		for(int i = 1; i<str.length; i++) 
		{
			if(str[i].length() > maxLen)
			{
				maxLen = str[i].length();
				maxName = str[i];
			}
		}
		System.out.println(maxName + " : " + maxLen);
	}

	public static void main(String[] args) {
		String str[] = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		Assignment57 a57 = new Assignment57();
		a57.getMaxLengthStringFromArrays(str);
	}
}
