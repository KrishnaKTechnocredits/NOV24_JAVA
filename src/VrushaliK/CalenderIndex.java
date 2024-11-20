package VrushaliK;
//Assignment - 10 : 18th Nov'2024
//Please use nested if else for below requirement.
//Based on month index, print quarter and name of the month.
//1 to 3 -> Q1
//4 to 6 -> Q2
//7 to 9 -> Q3
//10 to 12 -> Q4


public class CalenderIndex {
	
	void showMonthDetails(int monthIndex)
	{
		if(monthIndex==1)
		{
			System.out.println("Month index is 1 is in Q1,its JANUARY");
		}
		else if(monthIndex==2)
		{
			System.out.println("Month index is 2 is in Q1,its FEBUARY");
		}
		else if(monthIndex==3)
		{
			System.out.println("Month index is 3 is in Q1,its MARCH");
		}
		else if(monthIndex==4)
		{
			System.out.println("Month index is 4 is in Q2,its APRIL");
		}
		else if(monthIndex==5)
		{
			System.out.println("Month index is 5 is in Q2,its MAY");
		}
		else if(monthIndex==6)
		{
			System.out.println("Month index is 6 is in Q2,its JUNE");
		}
		else if(monthIndex==7)
		{
			System.out.println("Month index is 7 is in Q3,its JULY");
		}
		else if(monthIndex==8)
		{
			System.out.println("Month index is 8 is in Q3,its AUGUST");
		}
		else if(monthIndex==9)
		{
			System.out.println("Month index is 9 is in Q3,its SEPTEMBER");
		}
		else if(monthIndex==10)
		{
			System.out.println("Month index is 10 is in Q4,its OCTOMBER");
		}
		else if(monthIndex==11)
		{
			System.out.println("Month index is 11 is in Q4,its NOVEMBER");
		}
		else if(monthIndex==12)
		{
			System.out.println("Month index is 12 is in Q4,its DECEMBER");
		}
		else if(monthIndex<0)
		{
			System.out.println("Invalid month index, it can't be negative.");
		}
		else if(monthIndex>12)
		{
			System.out.println("Invalid month index, it can't be greater than 12");
		}
	}

	public static void main(String[] args) {
		CalenderIndex calenderIndex=new CalenderIndex();
		
		calenderIndex.showMonthDetails(5);
		calenderIndex.showMonthDetails(2);
		calenderIndex.showMonthDetails(-3);
		calenderIndex.showMonthDetails(13);
	}

}
