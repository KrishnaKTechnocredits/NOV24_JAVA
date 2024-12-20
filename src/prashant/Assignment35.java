/*Assignment - 35 : 7th Dec [20 mins]
return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
if both having same freqency then return "same".

input : teChnOcreDits
output : lower*/

package prashant;

public class Assignment35 {
	
	String getFreq(String input) 
	{
		int lcount = 0;
		int ucount = 0;
		for (int index = 0; index < input.length(); index++) 
		{
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) 
			{
				ucount++;
			} else 
			{
				lcount++;
			}
		}
		if (ucount > lcount) 
		{
			return "Upper";
		} else if (lcount > ucount) 
		{
			return "Lower";
		} else
			return "Same";

	}

	public static void main(String[] args) {
		Assignment35 assignment35=new Assignment35();
		String ans=assignment35.getFreq("teChnOcreDits");
		System.out.println(ans);

	}

}
