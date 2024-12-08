package imran.string_programs;

public class Assignment35_CompareFrequencyUpperLowercaseCharacter {

	int uCaseCount=0, lCaseCount=0;
	void getData(String data)
	{
		for(int i=0;i<data.length();i++)
		{
			char ch = data.charAt(i);
			int index = data.indexOf(ch);
			if(Character.isUpperCase(ch))
			{
				if(index == i)
				{
					int uCasefreq= getFrequency(data,ch);
					uCaseCount= uCaseCount+ uCasefreq;
				}
			}
		}
		System.out.println(" The total frequency of Uppercase Character in the String :"+data+ " is :" +uCaseCount);
		
		for(int i=0;i<data.length();i++)
		{
			char ch = data.charAt(i);
			int index = data.indexOf(ch);
			if(Character.isLowerCase(ch))
			{
				if(index == i)
				{
					int lCasefreq= getFrequency(data,ch);
					lCaseCount= lCaseCount+ lCasefreq;
				}
			}
		}
		System.out.println(" The total frequency of Lowercase Character in the String :"+data+ " is :" +lCaseCount);
	}
		
	int getFrequency(String data, char ch)
	{
		int count=0;
		for(int i=0;i<data.length();i++)
		{
			if(data.charAt(i)==ch)
			{
				count++;
			}
		}
		return count;
	}
	void getDifference()
	{
		if(uCaseCount>lCaseCount)
		{
			System.out.println(" UpperCase Character have higher Frequency in the String");
		}
		else 
		{
			System.out.println(" LowerCase Character have higher Frequency in the String");
		}
	}
	
	public static void main(String[] args) {
		Assignment35_CompareFrequencyUpperLowercaseCharacter assignment35_CompareFrequencyUpperLowercaseCharacter_1 =new Assignment35_CompareFrequencyUpperLowercaseCharacter();
		assignment35_CompareFrequencyUpperLowercaseCharacter_1.getData("Imran 17 Ahmed 06 Ansari 1996 ");
		assignment35_CompareFrequencyUpperLowercaseCharacter_1.getDifference();
	}
}
