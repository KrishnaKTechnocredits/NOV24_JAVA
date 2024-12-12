package vrushali.pattern;

//Assignment - 38 : 8th Dec [15 mins]
//write a logic to print below pattern.
//
//*
//**
//***
//****

public class Assignment38Pattern1 {
	
	void printPattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment38Pattern1  assignment38Pattern1=new Assignment38Pattern1();
		assignment38Pattern1.printPattern();
	}
}
