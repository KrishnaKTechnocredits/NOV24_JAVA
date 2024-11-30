package nishit;

public class Assignment16
{
	void printData(int startRange, int endRange)
	{
		int count = 0;
		int sum = 0;
		int average = 0;
		
		for(int num = startRange; num <= endRange; num++)
		{
			if(num % 5 == 0 && num % 7 == 0)
			{
				System.out.println(num);
				sum = sum + num;
				count++;
				if(count == 3)
					break;
			}
		}
		average = sum / count;
		System.out.println("Sum of first 3 numbers is: " + sum);
		System.out.println("Average of firt 3 numbers is: " + average);
	}
	
	public static void main(String[] args)
	{
		System.out.println("First 3 numbers divisible by 5 and 7 are :");
		Assignment16 assignment16 = new Assignment16();
		assignment16.printData(1, 210);
	}
}
