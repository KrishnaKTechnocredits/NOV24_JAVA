package nishit;

public class Assignment10
{
	void printQuarterandMonth(int index)
	{
		if(index < 1)
		{
			System.out.println("Invalid Month Index, Can't be less than 1");
		}else if (index >= 1 && index <=3)
		{
			if(index == 1)
			{
				System.out.println("Month index " + index + " is in Q1. It's January");
			}else if(index == 2)
			{
				System.out.println("Month index " + index + " is in Q1. It's February");
			}else
			{
				System.out.println("Month index " + index + " is in Q1. It's March");
			}
		}else if (index >= 4 && index <=6)
		{
			if(index == 4)
			{
				System.out.println("Month index " + index + " is in Q2. It's April");
			}else if(index == 5)
			{
				System.out.println("Month index " + index + " is in Q2. It's May");
			}else
			{
				System.out.println("Month index " + index + " is in Q2. It's June");
			}
		}else if (index >= 7 && index <=9)
		{
			if(index == 7)
			{
				System.out.println("Month index " + index + " is in Q3. It's July");
			}else if(index == 8)
			{
				System.out.println("Month index " + index + " is in Q3. It's August");
			}else
			{
				System.out.println("Month index " + index + " is in Q3. It's September");
			}
		}else if (index >= 10 && index <=12)
		{
			if(index == 10)
			{
				System.out.println("Month index " + index + " is in Q4. It's October");
			}else if(index == 11)
			{
				System.out.println("Month index " + index + " is in Q4. It's November");
			}else
			{
				System.out.println("Month index " + index + " is in Q4. It's December");
			}
		}
		else
		{
			System.out.println("Invalid month index, Can't be greater than 12");
		}
	}
	
	public static void main(String[] args)
	{
		Assignment10 assignment10 = new Assignment10();
		assignment10.printQuarterandMonth(5);
		assignment10.printQuarterandMonth(2);
		assignment10.printQuarterandMonth(-3);
		assignment10.printQuarterandMonth(13);
	}
}
