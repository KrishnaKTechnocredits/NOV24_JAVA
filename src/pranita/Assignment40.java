package pranita;

public class Assignment40{

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
		Assignment40 assignment40 = new Assignment40();
		assignment40.getPattern();
	}
}