package imran.Pattern_Program;

public class Assignment39_Pattern2Digit {

	void getPattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Assignment39_Pattern2Digit assignment39_Pattern2Digit_1 = new Assignment39_Pattern2Digit();
		assignment39_Pattern2Digit_1.getPattern();
	}
}
