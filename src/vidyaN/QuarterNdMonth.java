package vidyaN;

public class QuarterNdMonth {

	void display(int monthIndex) {
		if(monthIndex >=1 && monthIndex <= 3) 
			System.out.println("Q1");
			if(monthIndex == 1)
			System.out.println("January");
			else if(monthIndex == 2)
			System.out.println("February");
			else if(monthIndex == 3)
			System.out.println("March");
		
		else
			if(monthIndex >=4 && monthIndex <= 6)
			System.out.println("Q2");
			if(monthIndex == 4)
				System.out.println("April");
			else if(monthIndex == 5)
				System.out.println("May");
			else if(monthIndex == 6)
				System.out.println("June");
		
		
		else if(monthIndex >=7 && monthIndex <= 9)
				System.out.println("Q3");
				if(monthIndex == 7)
					System.out.println("July");
				else if(monthIndex == 8)
					System.out.println("August");
				else if(monthIndex == 9)
					System.out.println("September");
				
		else if(monthIndex >=10 && monthIndex <= 12)
				System.out.println("Q4");
				if(monthIndex == 10)
				System.out.println("October");
				else if(monthIndex == 11)
				System.out.println("November");
				else if(monthIndex == 12)
				System.out.println("December");
		
			}
	public static void main(String[] a)
	{
		QuarterNdMonth qnm = new QuarterNdMonth();
		qnm.display(5);
	}
}
