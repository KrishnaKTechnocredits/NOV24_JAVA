package imran;

public class Assignment13_Divisibility {

	void checkDivisibility(int num1,int num2)
	{
		if (num1<num2)
		{
			System.out.println("The Number divisible by 3 and 5 between "+num1+ " and " +num2 +" are as follows");
			for(int i=num1;i<=num2;i++)
			{
				if(i%3==0 && i%5==0)
				{
					System.out.println(i);
				}
			}
		}
		else
		{
			System.out.println("The Number divisible by 3 and 5 between "+num1+ " and " +num2 +" are as follows");
			for(int i=num2;i<=num1;i++)
			{
				if(i%3==0 && i%5==0)
				{
					System.out.println(i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment13_Divisibility assignment13_Divisibility_1 = new Assignment13_Divisibility();
		assignment13_Divisibility_1.checkDivisibility(5,40);
		assignment13_Divisibility_1.checkDivisibility(15,90);
	}
}