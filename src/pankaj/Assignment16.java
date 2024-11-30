package pankaj;

public class Assignment16 {
	
	int sum;
	int num;
	int Avg;
	
	void processdata(int startrange,int endrange)
	{
		int count=0;
		for(int num=startrange;num<=endrange;num++)
		{
			if(num%5==0 && num%7==0)
			{
				System.out.println(num);
				sum=sum+num;
				count++;
				
			if(count==3) {
				break;
			}
			
			}
		}
		
		System.out.println("The sum is==>>"+sum);
		Avg=sum/count;
		System.out.println("The Average is==>>"+Avg);
		
		
		
	}

	public static void main(String[] args)
	{
		Assignment16 A11=new Assignment16();
		A11.processdata(1,210);

	}

}
