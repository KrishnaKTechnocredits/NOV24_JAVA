package imran.string_programs;

public class Assignment32_1_FrequencyofCharacter {

	void getData(String data)
	{
		System.out.println("The Given String is: " +  data);
		System.out.println("The Frequency of Each Character present in string are as follows");
		for(int i=0;i<data.length();i++)
		{
			char ch= data.charAt(i);
			int index = data.indexOf(ch);
			if(index==i)
			{
				int freq= getFrequency(data,ch);
				System.out.println(ch + "  -> " + freq);
			}
		}
	}
	
	int getFrequency(String data, char gt)
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
		Assignment32_1_FrequencyofCharacter assignment32_1_FrequencyofCharacter_1 = new Assignment32_1_FrequencyofCharacter();
		assignment32_1_FrequencyofCharacter_1.getData("Imran Ahmed Ansari");
	}
}
