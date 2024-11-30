package nishit;

public class Assignment19
{
	String printCharInReverse(String str)
	{
		String reverse = "";
		int length = str.length();
		
		for(int i = length - 1; i >= 0; i--)
		{
			System.out.println(str.charAt(i));
		}
		
		return reverse;
	}
	
	public static void main(String[] args)
	{
		Assignment19 assignment19 = new Assignment19();
		assignment19.printCharInReverse("te ch3no");
	}
}
