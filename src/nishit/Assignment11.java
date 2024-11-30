package nishit;

class Assignment11
{
	void highestNumber(int numberOne, int numberTwo)
	{
		if(numberOne > numberTwo)
		{
			System.out.println(numberOne + " is bigger between " + numberOne + " and " + numberTwo);
		}
		else
		{
			System.out.println(numberTwo + " is bigger between " + numberOne + " and " + numberTwo);
		}
	}
	
	void lowestNumber(int numberOne, int numberTwo)
	{
		if(numberOne < numberTwo)
		{
			System.out.println(numberOne + " is smaller between " + numberOne + " and " + numberTwo);
		}
		else
		{
			System.out.println(numberTwo + " is smaller between " + numberOne + " and " + numberTwo);
		}
	}
	
	public static void main(String[] args)
	{
		Assignment11 assignment11 = new Assignment11();
		assignment11.highestNumber(10,17);
		assignment11.lowestNumber(10,17);
	}
}