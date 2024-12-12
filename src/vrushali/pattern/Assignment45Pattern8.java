package vrushali.pattern;
//
//Assignment - 45 : 10th Dec 
//# * # * # 
//# * # 
//# * # * # 
//# * # 
public class Assignment45Pattern8 {
	void printPattern()
	{
		char ch='*',ch1='#';
		for(int i=1;i<5;i++)
		{
			if(i%2==0)
			{
				for(int j=1;j<=i;j++)
				{
					if(j%2==0)
					{
						System.out.print(ch1+" ");
					}
					else
					{
						System.out.print(ch+" ");
					}
				}
				System.out.println();
			}
			else
			{
				for(int j=1;j<=3;j++)
				{
					if(j%2==0)
					{
						System.out.print(ch1+" ");
					}
					else
					{
						System.out.print(ch+" ");
					}
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		Assignment45Pattern8 assignment45Pattern8=new Assignment45Pattern8();
		assignment45Pattern8.printPattern();
		
	}

}
