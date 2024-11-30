package nishit;

public class Assignment18
{
	int returnLastNumber(int startRange, int endRange)
	{
		int lastNumber = 0;
		
		for(int index = startRange; index <= endRange; index++)
		{
			if(index % 5 == 0)
			{
				lastNumber = index;
			}
		}
		return lastNumber;
	}
	
	public static void main(String[] args)
	{
		Assignment18 assignment18 = new Assignment18();
		int lastNumber = assignment18.returnLastNumber(10, 498);
		System.out.println(lastNumber + " is the last number which is div by 5 in the given range.");
	}
}
