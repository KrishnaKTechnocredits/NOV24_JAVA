package imran.string_programs;

public class Assignment20_FindGivenCharacter {

	int count=0;
	void getData(String data, char to_Find)
	{
		System.out.println("The Given String is :" + data);
		for(int i=0;i<=data.length()-1;i++)
		{
			char ch = data.charAt(i);
			if(ch == to_Find)
			{
				count++;
			}
		}
		System.out.println("The Presence of " + to_Find +" is " + count);
	}
	
	public static void main(String[] args) {
		Assignment20_FindGivenCharacter assignment20_FindGivenCharacter_1 =new Assignment20_FindGivenCharacter();
		assignment20_FindGivenCharacter_1.getData("Imran Ahmed Ansari", 'a');
	}
}
