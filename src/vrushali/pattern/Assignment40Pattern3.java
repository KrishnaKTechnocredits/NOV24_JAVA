package vrushali.pattern;
//Assignment - 40 : 8th Dec[15 mins]
//write a logic to print below pattern.
//
//1
//2 3
//4 5 6
//7 8 9 10

public class Assignment40Pattern3 {
	
	void printPattern()
	{
		int count=1;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+count+" ");
				count++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment40Pattern3 assignment40Pattern3=new Assignment40Pattern3();
		assignment40Pattern3.printPattern();
		
	}
}
