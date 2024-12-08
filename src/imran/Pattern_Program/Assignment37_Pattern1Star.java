package imran.Pattern_Program;

public class Assignment37_Pattern1Star {

	void getpattern(char ch)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
			}
			System.out.println(" ");
		}	
	}
	
	void getpattern1()
	{
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		Assignment37_Pattern1Star assignment37_Pattern1Star_1 = new Assignment37_Pattern1Star();
		assignment37_Pattern1Star_1.getpattern('*');
		System.out.println(" ");
		assignment37_Pattern1Star_1.getpattern1();
	}
}
