package imran.string_programs;

public class Assignment33_FreqUpperCaseUsing2Function {

	void getData(String data)
	{
		System.out.println("The Given String is : "+ data);
		for(int i=0;i<data.length();i++)
		{
			char ch= data.charAt(i);
			int index = data.indexOf(ch);
			if(Character.isUpperCase(ch))
			{
				if(index == i)
				{
					int capiFreq = getFreq(data, ch);
					System.out.println("The frequency of UppercaseCharacter: " +ch + " in string : "+data+ " is: "+ capiFreq );
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
		Assignment33_FreqUpperCaseUsing2Function assignment33_FreqUpperCaseUsing2Function_1 = new Assignment33_FreqUpperCaseUsing2Function();
		assignment33_FreqUpperCaseUsing2Function_1.getData("Imran Ahmed Ansari");
	}
}
