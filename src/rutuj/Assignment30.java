package rutuj;

//import basic.Assci.Assignment25;

public class Assignment30 {
	
	
	void SumofEven(String str )
	{
		int  sum=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(Character.isDigit(ch))
			{
				int digit = Character.getNumericValue(ch);
				if(digit%2==0)
				sum = sum+digit;
	
			//	System.out.println(digit);
		
			}
			
		}
		System.out.println("sum of even no " + sum);
			
	}
	
	public static void main(String[] args)
	{
		Assignment30 ex1 = new Assignment30();
		ex1.SumofEven("te1ch2no3cre7dits");
		ex1.SumofEven("techno");
		ex1.SumofEven("4563");

}}
