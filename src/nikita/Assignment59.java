/* Assignment - 59 : 21th Dec'2024 [25 mins]
print all the second maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : GlobantPune
        PuneGlobant
		PuGlobantne
*/

package nikita;

public class Assignment59 {
	
	void getSecondMaxFromArray(String[] str)
	{
		String maxName = str[0];
		String secondMaxName = str[1];
		
		if(maxName.length() < secondMaxName.length())
		{
			maxName = str[1];
			secondMaxName = str[0];
		}
		
		for(int i = 2; i<str.length; i++) 
		{
			if(maxName.length() < str[i].length())
			{
				secondMaxName = maxName;
				maxName = str[i];
			}
			else if(secondMaxName.length() <= str[i].length())
			{
				secondMaxName = str[i];
			}
		}
		printWordsHavingExpectedLength(str, secondMaxName.length());
	}
	
	void printWordsHavingExpectedLength(String[] str, int targetLen)
	{
		for(int i = 0; i<str.length; i++) 
		{
			if(str[i].length() == targetLen)
			{
				System.out.println(str[i]);
			}
		}
	}
	public static void main(String[] args) {
		String[] str =  {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		Assignment59 a59 = new Assignment59();
		a59.getSecondMaxFromArray(str);
	}

}
