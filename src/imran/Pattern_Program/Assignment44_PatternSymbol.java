package imran.Pattern_Program;

public class Assignment44_PatternSymbol {

	void getpattern()
	{
		for(int i =1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		Assignment44_PatternSymbol assignment44_PatternSymbol_1 = new Assignment44_PatternSymbol();
		assignment44_PatternSymbol_1.getpattern();
	}
}
