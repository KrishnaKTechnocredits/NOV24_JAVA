package imran.character_class_Program;

public class Assignment29_PrintASCII {

	void getUpperCaseAscii()
	{
		for(int i='A'; i<='Z';i++)
		{
			char ch= (char)i;
			int val= i;
			System.out.println("The Character is " + ch + " and the ASCII Value is :" + val);
		}
	}
	
	void getDigitAscii()
	{
		for(int i='0';i<='9';i++)
		{
			char ch = (char)i;
			int val =i;
			System.out.println("The Character_Digit is " + ch + " and the ASCII Value is :" + val);
		}
	}
	
	void getLowercaseAscii()
	{
		for(int i='a'; i<='z';i++)
		{
			char ch= (char)i;
			int val= i;
			System.out.println("The Character is " + ch + " and the ASCII Value is :" + val);
		}
	}
	
	public static void main(String[] args) {
		Assignment29_PrintASCII assignment29_PrintASCII_1 = new Assignment29_PrintASCII();
		assignment29_PrintASCII_1.getUpperCaseAscii();
		assignment29_PrintASCII_1.getLowercaseAscii();
		assignment29_PrintASCII_1.getDigitAscii();
		
	}
}
