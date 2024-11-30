/*
Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]

Input : "Te4c_hno Credi3ts"
Output : uppercase -> 2
lowercase -> 11
digit -> 2
space -> 1
special char -> 1

Hint : use Character class static methods.
 */


package pankaj.stringAssignment;

public class Assignment23 {


	
	int ucount,dcount,lcount,scount,spcount;
	void getCount(String str)
	{
		
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			boolean flag=Character.isLetter(ch);
			if(flag==true)
			{
				if(Character.isUpperCase(ch))
				{
					ucount++;
				}
				else   //(Character.isLowerCase(ch))
				{
					lcount++;
				}
			}
			else if(Character.isDigit(ch))
			{
					dcount++;
			}
			else if(ch ==' ')
			{
					scount++;
			}
			else
			{
					spcount++;
			}
		}	
	
	System.out.println("Upper Case Count  ==>>" +ucount);
	System.out.println("Lower Case Count  ==>>" +lcount);
	System.out.println("Digit Case Count  ==>>" +dcount);
	System.out.println("Spaces Count      ==>>" +scount);
	System.out.println("SpecialChar Count ==>>" +spcount);
	
			
			
		
		
	}
	public static void main(String[] args) 
	{
		Assignment23 A23=new Assignment23();
		A23.getCount("Te4c_hno Credi3ts");
		
		

	}

}
