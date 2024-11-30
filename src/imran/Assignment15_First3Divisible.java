package imran;

public class Assignment15_First3Divisible {

	int count=0;
	void divisible(int start_range, int end_range)
	{
		if(start_range<end_range)
		{
			System.out.println("The first 3 Number divisible by 3 and 4 in the range of " + start_range+ " and " + end_range + " are as follows");
			for(int i=start_range;i<=end_range;i++)
			{
				if(i%3==0 && i%4==0)
				{
					if(count<=2)
					{
						System.out.println(i);
						count++;
					}
					else
					{
						break;
					}
				}
			}
		}
		else
		{
			System.out.println("The first 3 Number divisible by 3 and 4 in the range of " + end_range+ " and " + start_range + " are as follows");
			for(int i=end_range;i<=start_range;i++)
			{
				if(i%3==0 && i%4==0)
				{
					if(count<=2)
					{
						System.out.println(i);
						count++;
					}
					else
					{
						break;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment15_First3Divisible assignment15_First3Divisible_1 =new Assignment15_First3Divisible();
		assignment15_First3Divisible_1.divisible(10,500);
	}
}
