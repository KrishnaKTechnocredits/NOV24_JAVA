package vrushali;

//Assignment - 23 : 26th Nov'2024 [30 mins]
//
//Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]
//
//Input : "Te4c_hno Credi3ts"
//Output : uppercase -> 2
//lowercase -> 11
//digit -> 2
//space -> 1
//special char -> 1
//
//Hint : use Character class static methods.

public class FindCaseDetailsInString {
	
	void printDetailAboutAlphabets(String str)
	{
		int upperCaseCount=0,lowerCaseCount=0,digitCount=0,spaceCount=0,specialCharCount=0;
		char ch;
		for(int num=0;num<str.length();num++)
		{
			ch=str.charAt(num);
			if(Character.isLetter(ch))
			{
				if(Character.isUpperCase(ch))
				{
					upperCaseCount++;
				}
				else
				{
					lowerCaseCount++;
				}
			}
			else if(Character.isDigit(ch))
			{
				digitCount++;
			}
			else if(ch==' ')
			{
				spaceCount++;
			}
			else
			{
				specialCharCount++;
			}
		}
		
		System.out.println("Count of Upper case alplhbets in given string : "+upperCaseCount);
		System.out.println("Count of Lower case alplhbets in given string : "+lowerCaseCount);
		System.out.println("Count of Digits in given string : "+digitCount);
		System.out.println("Count of Space in given string : "+spaceCount);
		System.out.println("Count of Special Character in given string : "+specialCharCount);


		
	}
	
	public static void main(String[] args) {
		FindCaseDetailsInString findCaseDetailsInString=new FindCaseDetailsInString();
		findCaseDetailsInString.printDetailAboutAlphabets("Te4c_hno Credi3ts");
	}
	
	

}
