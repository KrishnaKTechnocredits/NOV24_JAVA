package imran.string_programs;

public class Assignment33_FrequencyOfUpperCaseCharacter {

	void getDataFrequency(String data)
	{
		System.out.println("The Given String is: " +  data);
		System.out.println("The Frequency of Each UpperCase Character in string are as followes");
		for(int i=0;i<data.length();i++)
		{
			char ch= data.charAt(i);
			int index = data.indexOf(ch);
			if(Character.isUpperCase(ch))
			{
				if(index==i)
				{
					int freq= getFrequency(data,ch);
					System.out.println("The UpperCase Character present is : " +ch + " and the Frequency is  -> " + freq);
				}
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
		Assignment33_FrequencyOfUpperCaseCharacter assignment33_FrequencyOfCharacter_1 = new Assignment33_FrequencyOfUpperCaseCharacter();
		assignment33_FrequencyOfCharacter_1.getDataFrequency("Imran Ahmed Ansari");
	}
}
