/*return the difference of Sum of all the odd digits and even digits present in a given String. */

package pankaj.asciiAssignment;

public class Assignment31 {
	
	int evensum=0;
	int oddsum=0;
	int sum=0;
	int sumOddEven(String str)
	{
		
		for(int i=0;i<str.length()-1;i++)
		{
			char ch=str.charAt(i);
			int digit=Character.getNumericValue(ch);
			if(Character.isDigit(ch))
			{
				if(ch%2==0)
				{
					evensum=evensum+digit;
					
				}
				else
				{
					oddsum=oddsum+digit;
				}
			}
			
		}
		return oddsum-evensum;
	}
	public static void main(String[] args)
	{
		Assignment31 A31=new Assignment31();
		int a=A31.sumOddEven("te1ch2no3cre7dits");
		System.out.println("The output of the first string is==>>"+a);
		
		int b=A31.sumOddEven("4563");
		System.out.println("The output of the second string is==>>"+b);
		
	}

}
