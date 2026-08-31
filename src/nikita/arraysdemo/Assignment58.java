/*Assignment - 58 : 21th Dec'2024 [15 mins]
Return the second maximum length string from given array.
If you find multiple string as second maximum, return the last second maximum.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : PuGlobantne
*/

package nikita.arraysdemo;

public class Assignment58 {
	
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
			else if(secondMaxName.length() < str[i].length())
			{
				secondMaxName = str[i];
			}
		}
		System.out.println(secondMaxName + " : " + secondMaxName.length());
	}
	public static void main(String[] args) {
		String[] str =  {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		Assignment58 a58 = new Assignment58();
		a58.getSecondMaxFromArray(str);
	}
}
