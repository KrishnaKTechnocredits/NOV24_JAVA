package nishit;

public class Assignment13
{
	void divisibleBySpecificNumbers(int startRange, int endRange)
	{
		for(int index = startRange; index <= endRange; index++)
		{
			if(index % 3 == 0 && index % 5 == 0)
			{
				System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Divisible by 5 & 3, numbers are: ");
		Assignment13 assignment13 = new Assignment13();
		assignment13.divisibleBySpecificNumbers(5,40);
	}
}