package imran;

public class Assignment18_LastDivisibleNumber {

	int count=0;
	void getLastDivNumber(int start_range, int end_range)
	{
		if(start_range<end_range)
		{
			System.out.println("The last number Divisivle by 5 ranging from "+ start_range + " to " + "end_range"+ " is :");
			for(int i=start_range;i<=end_range;i++)
			{
				if(i%5==0)
					{
						count=i;
					}
			}
			System.out.println(count);
		}
		else
		{
			System.out.println("The last number Divisivle by 5 ranging from "+ end_range + " to " + "start_range"+ " is :");
			for(int i=end_range;i<=start_range;i++)
			{
				if(i%5==0)
					{
						count=i;
					}
			}
			System.out.println(count);
		}
	}
	
	void getLastDivisibleNumber(int start_range,int end_range)
	{
		if(start_range<end_range)
		{
			System.out.println("The last number Divisivle by 5 ranging from "+ start_range + " to " + end_range+ " is :");
			for(int i=end_range;i>=start_range;i--)
			{
				if(i%5==0)
					{
					count=i;
					break;
					}
			}
			System.out.println(count);
		}
		else
		{
			System.out.println("The last number Divisivle by 5 ranging from "+ end_range + " to " + start_range+ " is :");
			for(int i=start_range;i>=end_range;i--)
			{
				if(i%5==0)
					{
						count=i;
						break;
					}
			}
			System.out.println(count);
		}
	}
	
	public static void main(String[] args) {
		Assignment18_LastDivisibleNumber assignment18_LastDivisibleNumber_1 =new Assignment18_LastDivisibleNumber();
		Assignment18_LastDivisibleNumber assignment18_LastDivisibleNumber_2 =new Assignment18_LastDivisibleNumber();
		assignment18_LastDivisibleNumber_1.getLastDivNumber(10,498);
		assignment18_LastDivisibleNumber_2.getLastDivisibleNumber(1089,498);
	}
}
