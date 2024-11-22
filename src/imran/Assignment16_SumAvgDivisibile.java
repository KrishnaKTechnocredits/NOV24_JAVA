package imran;

public class Assignment16_SumAvgDivisibile {

	int sum=0, avg=0, count=0;
	void sumAvgDivisible(int start_range, int end_range)
	{
		if(start_range< end_range)
		{
			System.out.println("The first three Number divisible by 5 & 7 ranging from " + start_range+ " and " + end_range+ " are as follows: ");
			for(int i= start_range; i<=end_range;i++)
			{
				if(i%5==0 && i%7==0)
				{
					if(count<=2)
					{
						System.out.println(i);
						sum=sum+i;
						count++;
					}
				}
			}
			avg= sum/ count;
			System.out.println("The Sum of first 3 number divisible by 5 and 7 in the range of "+ start_range + " and "+ end_range+" is :"+ sum);
			System.out.println("The Average of first 3 number divisible by 5 and 7 in the range of "+ start_range + " and "+ end_range+" is :"+ avg);
		}
		else
		{
			System.out.println("The first three Number divisible by 5 & 7 ranging from " + end_range+ " and " + start_range+ " are as follows: ");
			for(int i= end_range; i<=start_range;i++)
			{
				if(i%5==0 && i%7==0)
				{
					if(count<=2)
					{
						System.out.println(i);
						sum=sum+i;
						count++;
					}
				}
			}
			avg= sum/ count;
			System.out.println("The Sum of first 3 number divisible by 5 and 7 in the range of "+ end_range + " and "+ start_range+" is :"+ sum);
			System.out.println("The Average of first 3 number divisible by 5 and 7 in the range of "+ end_range + " and "+ start_range+" is :"+ avg);
		}
	}
	
	public static void main(String[] args) {
		Assignment16_SumAvgDivisibile assignment16_SumAvgDivisibile_1 = new Assignment16_SumAvgDivisibile();
		assignment16_SumAvgDivisibile_1.sumAvgDivisible(1, 210);
	}
}
