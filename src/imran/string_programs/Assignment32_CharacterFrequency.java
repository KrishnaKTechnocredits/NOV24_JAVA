package imran.string_programs;

public class Assignment32_CharacterFrequency {

	int count=0;
	void getData(String data)
	{
		for(int i=0; i<data.length();i++)
		{
			char ch= data.charAt(i);
			int index = data.indexOf(ch);
			if(i==index)
			{
				for(int j=0;j<data.length();j++)
				{
					if(data.charAt(j)== ch)
					{
					  count++;
					}
				}
				System.out.println("The Number of Occurence of Character " + ch+ " is " + count++);
				count=0;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment32_CharacterFrequency  assignment32_CharacterFrequency_1 = new Assignment32_CharacterFrequency();
		assignment32_CharacterFrequency_1.getData("Imran Ahmed Ansari");
	}
}
