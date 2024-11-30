package nishit;

public class Assignment23
{
	void printCountOfString(String str)
	{
		int lowerCaseCount = 0, upperCaseCount = 0, spaceCount = 0, digitCount = 0, specialCharCount = 0;
		for (int i = 0; i <= str.length() - 1; i++)
		{
			char ch = str.charAt(i);
			if (Character.isLetter(ch))
			{
				if (Character.isLowerCase(ch))
				{
					lowerCaseCount++;
				}
				else
				{
					upperCaseCount++;
				}
			}else if (Character.isDigit(ch))
			{
				digitCount++;
			}else if (str.charAt(i) == ' ')
			{
				spaceCount++;
			}
			else
			{
				specialCharCount++;
			}
		}
		System.out.println("Upper case count: " + upperCaseCount);
		System.out.println("Lower case count: " + lowerCaseCount);
		System.out.println("Digit count: " + digitCount);
		System.out.println("Space count: " + spaceCount);
		System.out.println("Special character count: " + specialCharCount);
	}

	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		assignment23.printCountOfString("Te4c_hno Credi3ts");
	}
}
