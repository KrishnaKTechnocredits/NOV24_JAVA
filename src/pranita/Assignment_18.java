package pranita;

public class Assignment_18
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
		Assignment_18 assignment18 = new Assignment_18();
		int lastNumber = assignment18.returnLastNumber(10, 498);
		System.out.println(lastNumber + " is the last number which is div by 5 in the given range.");
	}
}

