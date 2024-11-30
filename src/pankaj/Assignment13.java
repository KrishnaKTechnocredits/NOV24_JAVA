package pankaj;

public class Assignment13 {

	int num;
	void divisible(int startrange,int endrange)
	{
		System.out.println("The numbers divisble by 3 & 5 ");
		for(int num=startrange; num<endrange;num++)
		{
			if(num%5==0 && num%3==0)
			{
				System.out.println("  "+num);
			}
		}
	}
	public static void main(String[] args)
	{
		Assignment13 dn=new Assignment13();
		dn.divisible(5,40);

	}

}
