package imran.Pattern_Program;

public class Assignment42_Pattern5DigitIncrementRepeat {

	void getPattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		Assignment42_Pattern5DigitIncrementRepeat assignment42_Pattern5DigitIncrementRepeat_1 = new Assignment42_Pattern5DigitIncrementRepeat();
		assignment42_Pattern5DigitIncrementRepeat_1.getPattern();
	}
}
