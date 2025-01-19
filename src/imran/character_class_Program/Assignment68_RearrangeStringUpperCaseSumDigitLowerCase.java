package imran.character_class_Program;

public class Assignment68_RearrangeStringUpperCaseSumDigitLowerCase {

	String getStringUpperSumDigitLowerSequence(String data)
	{
		String upperChar = "";
		String lowerChar = "";
		int Sumdigit=0;
		char ch;
		for(int i=0;i<=data.length()-1;i++)
		{
			ch = data.charAt(i);
			if(Character.isUpperCase(ch))
			{
				upperChar = upperChar + ch;
			}
			if(Character.isDigit(ch))
			{
				Sumdigit = Sumdigit + Character.getNumericValue(ch);
			}
			if(Character.isLowerCase(ch))
			{
				lowerChar = lowerChar + ch;
			}
		}
		String finalString = upperChar + Sumdigit + lowerChar;
		return finalString;
	}
	
	public static void main(String[] args) {
		Assignment68_RearrangeStringUpperCaseSumDigitLowerCase assignment68_RearrangeStringUpperCaseSumDigitLowerCase_1 = new Assignment68_RearrangeStringUpperCaseSumDigitLowerCase();
		String resultString = assignment68_RearrangeStringUpperCaseSumDigitLowerCase_1.getStringUpperSumDigitLowerSequence("Te1ch6NOCre4dits");
		System.out.println("The given String is : " + "Te1ch6NOCre4dits");
		System.out.println(" The Result String is : " + resultString);
	}
}
