package pankaj;

public class Assignment12 
{
	int num1;
	void evennumber(int startrange,int endrange)
	{
		System.out.println("The even numbers between"+" "+startrange+" "+"and"+" "+endrange);
		
		for(int num1=startrange;num1<endrange;num1++)
		{
			if(num1%2==0)
			{
				System.out.println("  "+num1);
			}
			
		}
	}

	public static void main(String[] args) 
	{
		Assignment12 for1=new Assignment12();
		for1.evennumber(10,15);		

	}

}
