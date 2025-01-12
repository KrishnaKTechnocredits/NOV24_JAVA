package imran.string_programs;

public class Assignment34_FrequencyAllDigits {

	void getData(String data)
	{
		for(int i=0;i<data.length();i++)
		{
			char ch= data.charAt(i);
			int index = data.indexOf(ch);
			if(Character.isDigit(ch))
			{
				if(index == i)
				{
					int digiFreq = getFreq(data, ch);
					System.out.println("The frequency of UppercaseCharacter: " +ch + " in string : "+data+ " is: "+ digiFreq );
				}
							
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
		Assignment34_FrequencyAllDigits assignment34_FrequencyAllDigits_1 = new Assignment34_FrequencyAllDigits();
		assignment34_FrequencyAllDigits_1.getData("Imran 17 Ahmed 06 Ansari 1996 ");
	}
}
