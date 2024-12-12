package vrushali.pattern;

//Assignment - 43 : 8th Dec[10 mins]
//
//write a logic to print below pattern.
//
//A
//B C
//D E F
//G H I J
//
//char ch = 'A';

public class Assignment43Pattern6 {
	
	void printPattern()
	{
		char ch='A';
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment43Pattern6 assignment43Pattern6=new Assignment43Pattern6();
		assignment43Pattern6.printPattern();
		
	}
}
