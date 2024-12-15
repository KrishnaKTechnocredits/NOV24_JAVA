package imran.ArrayPrograms;

public class Assignment46_MiddleCharacterofStringarrayElement {

	void getData()
	{
		String[] name =  {"Rohan", "Premlata", "Anuja", "Fazrana"};
		System.out.println("The Middle Character of the Array Element are as follows");
		for(int i=0;i<=name.length-1;i++)
		{
			String temp = name[i];
			int middleIndex = temp.length()/2;
			char ch = temp.charAt(middleIndex);
			System.out.println(temp + " --> " + ch);
		}
	}
	
	public static void main(String[] args) {
		Assignment46_MiddleCharacterofStringarrayElement assignment46_MiddleCharacterofStringarrayElement_1 = new Assignment46_MiddleCharacterofStringarrayElement();
		assignment46_MiddleCharacterofStringarrayElement_1.getData();
	}
}
