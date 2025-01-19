package vrushali.pattern;
//Assignment - 44 : 8th Dec[15 mins]
//write a logic to print below pattern.
//
//* 
//* # 
//* # * 
//* # * # 
//* # * # * 


public class Assignment44Pattern7 {
	void printPattern()
	{
		char ch='*',ch1='#';
		for(int i=1;i<5;i++)
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
	}
	public static void main(String[] args) {
		Assignment44Pattern7 assignment44Pattern7=new Assignment44Pattern7();
		assignment44Pattern7.printPattern();
		
	}
}
