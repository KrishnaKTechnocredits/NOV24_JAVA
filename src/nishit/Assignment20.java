package nishit;

public class Assignment20
{
	int getCharFreq(String str, char ch)
	{
		int count = 0;
	    for (int i = 0; i < str.length(); i++)
	    {
	        if (str.charAt(i) == ch)
	        {
	             count++;
	        }
	    }
	    System.out.println("Count of " + ch + " in " + str + " is: " + count);
	    return count;
	}
	
	public static void main(String[] args)
	{
		Assignment20 assignment20 = new Assignment20();
		assignment20.getCharFreq("aakanskha", 'a');
	}
}
