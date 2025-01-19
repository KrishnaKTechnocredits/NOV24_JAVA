package rutuj;

public class Assignment10 {


	void month(int index)
	{
		if(index<1) {
			System.out.println("Invalid Moth Index it can't be negative.");
		}
	
		else if (index>=1 && index<=3) {
			if(index == 1)	{
			System.out.println("month index " + index + " in Q1 its jan");
		}
		else if (index == 2) {
			System.out.println("month index " + index + " in Q1 its feb");
		}
		else if (index == 3) {
			System.out.println("month index " + index + " in Q1 its March");
		}
		}
		else if (index>=4 && index<=6) {
			if(index == 4)	{
			System.out.println("month index " + index + " in Q2 its April");
			}
		else if (index == 5)
		{
			System.out.println("month index " + index + " in Q2 its May");
		}
		else if (index == 6)
		{
			System.out.println("month index " + index + " in Q2 its June");
		}
			
		}
		else if (index>=7 && index<=9)
		{
			if(index == 7)	{
			System.out.println("month index " + index + " in Q3 its July");
			}
		else if (index == 8)
		{
			System.out.println("month index " + index + " in Q3 its Augest");
		}
		else if (index == 9)
		{
			System.out.println("month index " + index + " in Q3 its Sept");
		}
			
		}
		else if (index>=10 && index<=12)
		{
			if(index == 10)	{
			System.out.println("month index " + index + " in Q4 its Oct");
			}
		else if (index == 11)
		{
			System.out.println("month index " + index + " in Q4 its Nov");
		}
		else if (index == 12)
		{
			System.out.println("month index " + index + " in Q4 its Dec");
		}
		}else
		{
		System.out.println("Invalid Moth Index it can't be grether then 12");
		}
		
		
					
	}
		
	
	public static void main(String[] args) {
		
		Assignment10 ex2 = new Assignment10();
		ex2.month(5);
		ex2.month(2);
		ex2.month(-3);
		ex2.month(13);
		
		
	}
	
}
	
		
		
	

