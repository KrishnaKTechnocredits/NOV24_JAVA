package rutuj;

public class Assignment14sum {
	int i=1;
	int sum;
	int count;
	void division(int no1 , int no2)
	{
		for(i=no1;i<=no2;i++)
		{
			if(i%3==0 && i%5==0)
			{
				count++;
				sum =sum +i;
			
			}
			
			
		}
	}

	public static void main(String[] args)
	{
		Assignment14sum ex5 = new Assignment14sum();
		ex5.division(1, 70);
		
		System.out.println("in a range no1 to no2 , calculated sum is " + ex5.sum );
		System.out.println("in a range no1 to no2 "  + ex5.count +" number are divisible by 3 an 5");	
	} 

}

