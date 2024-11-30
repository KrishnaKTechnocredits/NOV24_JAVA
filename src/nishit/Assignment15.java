package nishit;

public class Assignment15
{
	void printData(int startRange, int endRange)
	{
		int count = 0;
		
		for(int num = startRange; num <= endRange; num++)
		{
			if(num % 3 == 0 && num % 4 == 0)
			{
				System.out.println(num);
				count++;
				if(count == 3)
					break;
			}
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("First 3 numbers divisible by 3 and 4 are :");
		Assignment15 assignment15 = new Assignment15();
		assignment15.printData(10, 500);
	}
}
