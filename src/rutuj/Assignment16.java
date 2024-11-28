package rutuj;

public class Assignment16 {
	
	int count=0, sum=0;
	
	void Example5(int start , int end)
	{
		for(int i=start;i<=end;i++)
		{
			if(i%5==0 && i%7==0)
			{
				System.out.println("given no is divisible by 5 and 7 "  + i);
				count++;
				sum=sum+i;
				
				
				if(count==3)
				{
					System.out.println("sum is "+ sum);
					System.out.println("Avarage is "+ (sum/3));
					break;
			    }		
				
			}
			
		}
	}
public static void main(String[] args)
{
	Assignment16 ex1= new Assignment16();
	ex1.Example5(1, 270);
}
}