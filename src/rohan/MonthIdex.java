package rohan;

public class MonthIdex {
	public static void main(String[] args){
		MonthIdex n = new MonthIdex();
		n.monthNum(5);
		n.monthNum(2);
		n.monthNum(-3);
		n.monthNum(13);
	}
	
	void monthNum(int input){
		
		if(input< 0) 
		{
			System.out.println("Please Enter positive number");
		}else if(input>12) 
		{
			System.out.println("It's can't be greater than 13");
		}else if(input>=1 && input<=3)
		{
			if(input == 1)
			{
				System.out.println("It's January");
			}else if(input == 2)
			{
				System.out.println("It's February");
			}else 
			{
				System.out.println("It's March");
			}
	}else if(input>=4 && input<=6)
			{
			if(input == 4)
			{
				System.out.println("It's April");
			}else if(input == 5)
			{
				System.out.println("It's May");
			}else 
			{
				System.out.println("It's June");
			}
	}else if(input>=7 && input<=9)
			{
			if(input == 7)
			{
				System.out.println("It's July");
			}else if(input == 8)
			{
				System.out.println("It's Aug");
			}else 
			{
				System.out.println("It's September");
			}
	}else if(input>=10 && input<=12)
			{
			if(input == 10)
			{
				System.out.println("It's October");
			}else if(input == 11)
			{
				System.out.println("It's November");
			}else 
			{
				System.out.println("It's December");
			}
	}else
			{
				System.out.println("Inter valid month number");
			}
	}
}
