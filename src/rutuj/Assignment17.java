package rutuj;

public class Assignment17 {
	
int count=0;
	void Example1(int start, int end)
	{
		for(int i=end;i>=start;i--)
		{
			if(i%5==0)
			{
				System.out.println("last 5 no divisible by 5 " + i );
				count++;
				
				if(count==5)
				{
					break;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		Assignment17 ex1 = new Assignment17();
		ex1.Example1(10 , 500);
	}

}
