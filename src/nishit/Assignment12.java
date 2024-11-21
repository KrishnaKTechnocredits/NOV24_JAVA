package nishit;

public class Assignment12
{
	void printEvenNumbers(int startRange, int endRange)
	{
		for(int index = startRange; index <= endRange; index++)
		{
			if(index%2 == 0)
			{
				System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Even Numbers are: ");
		Assignment12 assignment12 = new Assignment12();
		assignment12.printEvenNumbers(10, 15);
	}
}
