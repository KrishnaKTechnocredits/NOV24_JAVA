package imran.string_programs;

public class Assignment34_PrintFrequencyOfAllDigit {
	void getDataFrequency(String data)
	{
		System.out.println("The Given String is: " +  data);
		System.out.println("The Frequency of Each Digit in string are as followes");
		for(int i=0;i<data.length();i++)
		{
			char ch= data.charAt(i);
			int index = data.indexOf(ch);
			if(Character.isDigit(ch))
			{
				if(index==i)
				{
					int freq= getFrequency(data,ch);
					System.out.println("The Digit present is : " +ch + " and the Frequency is  -> " + freq);
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
		Assignment34_PrintFrequencyOfAllDigit assignment34_PrintFrequencyOfAllDigit_1 = new Assignment34_PrintFrequencyOfAllDigit();
		assignment34_PrintFrequencyOfAllDigit_1.getDataFrequency("Imran 17 Ahmed 06 Ansari 1996");
	}
}
