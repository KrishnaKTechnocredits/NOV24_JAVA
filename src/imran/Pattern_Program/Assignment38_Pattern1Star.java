package imran.Pattern_Program;

public class Assignment38_Pattern1Star {

	void getPatternSymbol(char ch)
	{
		for(int i=1; i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		Assignment38_Pattern1Star assignment38_Pattern1Star_1 = new Assignment38_Pattern1Star();
		assignment38_Pattern1Star_1.getPatternSymbol('*');
	}
}
