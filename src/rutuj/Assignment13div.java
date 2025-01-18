package rutuj;

public class Assignment13div {
	int i=1;
	int sum;
	void division(int no1 , int no2)
	{
		for(i=no1;i<=no2;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("Divisible by 3 and 5 ,Numbers are " + i);
			}
			
		}
	}

	public static void main(String[] args)
	{
		Assignment13div ex5 = new Assignment13div();
		ex5.division(1, 70);
	} 
}
