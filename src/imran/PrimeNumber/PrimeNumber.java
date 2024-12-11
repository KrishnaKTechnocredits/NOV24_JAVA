package imran.PrimeNumber;

public class PrimeNumber {

	void getPrimeNumber(int num)
	{
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%2==0)
			{
				System.out.println(num + " is not a prime number");
				count++;
				break;
			}
		}
		
		if(count==0) 
		{
			System.out.println(num +" is a prime number");
		}
	}
	
	void getPrimeNumberRange( int start_range, int end_range)
	{
		System.out.println("The Prime Number ranging between "+ start_range + " to "+  end_range + " are as follows");
		for(int j=start_range;j<end_range;j++)
		{
			int count=0;
			for(int k=2;k<j;k++)
			{
				if(j%k==0)
				{
					count++;
					break;
				}
			}
			if(count==0) 
			{
				System.out.println(j +" is a prime number");
			}
		}
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber_1 = new PrimeNumber();
		primeNumber_1.getPrimeNumber(59);
		primeNumber_1.getPrimeNumberRange(15,119);
	}
}
