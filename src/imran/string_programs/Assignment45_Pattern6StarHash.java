package imran.string_programs;

public class Assignment45_Pattern6StarHash {

	void getPattern()
	{
		for(int i=1;i<=4;i++)
		{
			if(i%2==0)
			{
				for(int j=1;j<=3;j++)
				{
					if(j%2==0)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print("#");
					}
				}
			}
			else
			{
				for(int j=1;j<=5;j++)
				{
					if(j%2==0)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print("#");
					}
				}
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		Assignment45_Pattern6StarHash assignment45_Pattern6StarHash_1 = new Assignment45_Pattern6StarHash();
		assignment45_Pattern6StarHash_1.getPattern();
	}
}
