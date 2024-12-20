package imran.ArrayPrograms;

public class Assignment47_PrintElementMoreThan6Character {

	void getElementMorethan6Character(String[] data)
	{
		System.out.println("The Element having more than 6 Character are as follows");
		for(int i=0;i<= data.length -1;i++)
		{
			String temp = data[i];
			int lenOfElement = temp.length();
			if(lenOfElement>6)
			{
				System.out.println(temp);
			}
			
		}
	}
	
	public static void main(String[] args) {
		Assignment47_PrintElementMoreThan6Character assignment47_PrintElementMoreThan6Character_1 = new Assignment47_PrintElementMoreThan6Character();
		String[] data = {"Rohan", "Premlata", "Anuja", "Fazrana"};
		assignment47_PrintElementMoreThan6Character_1.getElementMorethan6Character(data);
	}
}
