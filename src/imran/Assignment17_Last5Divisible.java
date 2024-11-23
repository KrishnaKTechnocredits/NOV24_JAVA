package imran;

public class Assignment17_Last5Divisible {

	int count=0;
	void last5Dvsble(int start_range, int end_range)
	{
		if(start_range>end_range)
		{
			System.out.println("The Last 5 divisible by 5 ranging between "+ end_range+ " and "+start_range+" are as follows:");
			for(int i=start_range; i>=end_range; i--)
			{
				if(i%5==0)
				{
					if(count<=4)
					{
						System.out.println(i);
						count++;
					}
				}
			}
		}
		else
		{
			System.out.println("The Last 5 divisible by 5 ranging between "+ start_range+ " and "+end_range+" are as follows:");
			for(int i=end_range; i>=start_range; i--)
			{
				if(i%5==0)
				{
					if(count<=4)
					{
						System.out.println(i);
						count++;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment17_Last5Divisible assignment17_Last5Divisible_1= new Assignment17_Last5Divisible();
		Assignment17_Last5Divisible assignment17_Last5Divisible_2= new Assignment17_Last5Divisible();
		assignment17_Last5Divisible_1.last5Dvsble(10,500);
		assignment17_Last5Divisible_2.last5Dvsble(600,20);
	}
}
