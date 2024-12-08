package imran.Pattern_Program;

public class Assignment43_Pattern6CharacterIncreament {

	void getPattern()
	{  char ch='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println("");
		}
	}
	
	void getPatternUsingcharInloop()
	{
		char count='A';
		for(char i='A';i<='D';i++)
		{
			for(int j='A';j<=i;j++)
			{
				System.out.print(count);
				count++;
			}
			System.out.println(" " );
		}
	}
	public static void main(String[] args) {
		Assignment43_Pattern6CharacterIncreament assignment43_Pattern6CharacterIncreament_1 = new Assignment43_Pattern6CharacterIncreament();
		assignment43_Pattern6CharacterIncreament_1.getPattern();
		System.out.println(" ");
		assignment43_Pattern6CharacterIncreament_1.getPatternUsingcharInloop();
	}
}
