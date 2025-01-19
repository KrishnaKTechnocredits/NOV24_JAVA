package pranita;

public class Assignment_42 {

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
		Assignment_42 assignment42 = new Assignment_42();
		assignment42.getPattern();
	}
}