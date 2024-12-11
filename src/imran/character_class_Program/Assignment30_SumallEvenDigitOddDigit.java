package imran.character_class_Program;

public class Assignment30_SumallEvenDigitOddDigit {

	int even=0,odd=0;
	void getdata(String data)
	{
		for(int i=0;i<data.length();i++)
		{
			char ch= data.charAt(i);
			if(Character.isDigit(ch)== true)
			{
				int k = Character.getNumericValue(ch);
				if(k%2==0)
				{
					even= even+k;
				}
				else
				{
					odd = odd +k;
				}
			}
		}
		System.out.println("The Sum of all even digit present in a String : "+ data+ " is "+ even);
		System.out.println("The Sum of all odd digit present in a String : "+ data+ " is "+ odd);
	}
	
	public static void main(String[] args) {
		Assignment30_SumallEvenDigitOddDigit assignment30_SumallEvenDigitOddDigit_1 =new Assignment30_SumallEvenDigitOddDigit();
		assignment30_SumallEvenDigitOddDigit_1.getdata("te1ch2no3cre7dits");
		new Assignment30_SumallEvenDigitOddDigit().getdata("techno");
		new Assignment30_SumallEvenDigitOddDigit().getdata("4563");
		
	}
}
