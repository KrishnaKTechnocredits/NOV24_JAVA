package nishit;

public class Assignment14
{
	int sum = 0;
	int count = 0;
	
	void divisibleBySpecificNumbers(int startRange, int endRange)
	{
		for(int index = startRange; index <= endRange; index++)
		{
			if(index % 3 == 0 && index % 5 == 0)
			{
				sum = sum + index;
				count++;
			}
		}
	}
	
	public static void main(String[] args)
	{
		Assignment14 assignment14 = new Assignment14();
		assignment14.divisibleBySpecificNumbers(1,70);
		
		System.out.println("In the range 1 to 70, calculated sum is: " + assignment14.sum);
		System.out.println("In the range 1 to 70, " + assignment14.count + " numbers are divisible by 3 and 5.");
	}
}
