package imran.character_class_Program;

public class Assignment25_sumOfDigitinString {

	int sum=0;
	void getASCIIvalue(String data)
	{
		for(int i=0;i<data.length();i++)
		{
			char ch= data.charAt(i);
			if(Character.isDigit(ch)==true)
			{
				int k= Character.getNumericValue(ch);
				sum= sum+k;
			}
		}
		System.out.println("The sum of total number of digits present in a String : " + data+" is " + sum);
	}
	
	public static void main(String[] args) {
		Assignment25_sumOfDigitinString assignment25_sumOfDigitinString_1 = new Assignment25_sumOfDigitinString();
		assignment25_sumOfDigitinString_1.getASCIIvalue("te1ch2no3cre7dits");
		new Assignment25_sumOfDigitinString().getASCIIvalue("techno");
		new Assignment25_sumOfDigitinString().getASCIIvalue("4563");
	}
}
