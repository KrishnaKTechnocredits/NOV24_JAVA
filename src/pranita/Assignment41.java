package pranita;

public class Assignment41{

	void getPattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Assignment41 assignment41 = new Assignment41();
		assignment41.getPattern();
	}
}
