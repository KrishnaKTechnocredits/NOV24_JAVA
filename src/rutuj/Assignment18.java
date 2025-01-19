package rutuj;

public class Assignment18 {
	int i;
int count=0;
	void Example1(int start, int end)
	{
		for(int i=end;i>=start;i--)
		{
			if(i%5==0)
			{
			//	System.out.println(i +" is last no which  divisible by 5 in the given range " );
				count++;
				
				if(count==1)
				{
					break;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		Assignment18 ex1 = new Assignment18();
		ex1.Example1(10 , 498);
		System.out.println(ex1.i +" is last no which  divisible by 5 in the given range " );
	}

}
