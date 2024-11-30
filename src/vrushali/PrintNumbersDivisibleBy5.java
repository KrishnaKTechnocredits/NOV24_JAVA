package vrushali;

//Assignment - 17 : 22nd Nov'2024 [20 mins]
//On user defined range print last 5 numbers which is divisible by 5.
//
//Hint : pass start and end index as a parameter.
//
//Input : Range -> 10 to 500
//Output : Last 5 numbers divisible by 5 is :
//500
//495
//490
//485
//480

public class PrintNumbersDivisibleBy5 {
	
	void printLastNumbersDivisibleBy5(int startNumber,int endNumber)
	{ 
		int count=0;
		System.out.println("Numbers Divisible by 3 & 4 numbers are:");
		
		for(int num=endNumber;num>=startNumber;num--)
		{
			if(num%5==0 && count<5)
			{
				System.out.println(num);
				count++;
			}
		}
	}
    public static void main(String[] args) {
		
    	PrintNumbersDivisibleBy5 printNumbersDivisibleBy5=new  PrintNumbersDivisibleBy5();
    	printNumbersDivisibleBy5.printLastNumbersDivisibleBy5(10, 500);
	}

}
