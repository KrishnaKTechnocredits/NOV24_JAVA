package imran.character_class_Program;

public class Assignment67_RearrangeStringUpperCaseDigitLowerCaseCharSequence {

	String getStringUpperDigitLowerSequence(String data)
	{
		String upperChar = "";
		String digitChar ="";
		String lowerChar = "";
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
				digitChar = digitChar + ch;
			}
			if(Character.isLowerCase(ch))
			{
				lowerChar = lowerChar + ch;
			}
		}
		String finalString = upperChar + digitChar + lowerChar;
		return finalString;
	}
	
	public static void main(String[] args) {
		Assignment67_RearrangeStringUpperCaseDigitLowerCaseCharSequence  assignment67_RearrangeStringUpperCaseDigitLowerCaseCharSequence_1 = new Assignment67_RearrangeStringUpperCaseDigitLowerCaseCharSequence ();
		String resultString =assignment67_RearrangeStringUpperCaseDigitLowerCaseCharSequence_1.getStringUpperDigitLowerSequence("Te1ch6NOCre3dits");
		System.out.println("The given String is : " + "Te1ch6NOCre3dits");
		System.out.println(" The Result String is : " + resultString);
	}
}