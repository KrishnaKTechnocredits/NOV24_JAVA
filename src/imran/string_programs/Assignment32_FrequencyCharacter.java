package imran.string_programs;

public class Assignment32_FrequencyCharacter {

	void getData(String data)
	{
		for(int i=0;i<data.length();i++)
		{
			char ch= data.charAt(i);
			int index = data.indexOf(ch);
			if(index == i)
			{
				int capiFreq = getFreq(data, ch);
				System.out.println("The frequency of UppercaseCharacter: " +ch + " in string : "+data+ " is: "+ capiFreq );
			}
		}
	}
	
	int getFreq(String data, char gt)
	{
		int count=0;
		for(int j=0;j<data.length();j++)
		{
			if(data.charAt(j)==gt)
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Assignment32_FrequencyCharacter assignment32_FrequencyCharacter_1 = new Assignment32_FrequencyCharacter();
		assignment32_FrequencyCharacter_1.getData("Imran Ahmed Ahnsari");
	}
}
