package nishit;

public class Assignment17
{
	void printData(int startRange, int endRange)
	{
		int count = 0;
		
		for(int num = endRange; num >= startRange; num--)
		{
			if(num % 5 == 0)
			{
				System.out.println(num);
				count++;
				if(count == 5)
					break;
			}
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Last 5 numbers divisible by 5 are :");
		Assignment17 assignment17 = new Assignment17();
		assignment17.printData(10, 500);
	}
}
