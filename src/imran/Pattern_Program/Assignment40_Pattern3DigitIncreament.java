package imran.Pattern_Program;

public class Assignment40_Pattern3DigitIncreament {

	int count=1;
	void getPattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count);
				count++;
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		Assignment40_Pattern3DigitIncreament assignment40_Pattern3DigitIncreament_1 = new Assignment40_Pattern3DigitIncreament();
		assignment40_Pattern3DigitIncreament_1.getPattern();
	}
}
