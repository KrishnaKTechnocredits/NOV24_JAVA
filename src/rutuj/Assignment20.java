package rutuj;

public class Assignment20 {
	
	int count=0;
	void Example2(int startNo, int endNO)
	{
		for(int i=startNo;i<=endNO;i++)
		{
			if(i%3 ==0 && i%5 == 0 )
			{
				System.out.println("given no is divisible by 3 and 5 " + i);
				count++;
				if(count == 3)
				{
					break;
				}
								
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		Assignment20 ex2= new Assignment20();
		ex2.Example2(10,500);

	}
}
