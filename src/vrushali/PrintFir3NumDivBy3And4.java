package vrushali;

//Assignment - 15 : 22nd Nov'2024 [30-35 mins]
//On user defined range print first 3 numbers which is divisible by 3 & 4.
//
//Hint : pass start and end index as a parameter.
//
//Input : Range -> 10 to 500
//Output : First 3 numbers divisible by 3 and 4 is :
//12
//24
//36


public class PrintFir3NumDivBy3And4 {
	
	void printFirst3NumDivBy3And4(int startNumber,int endNumber)
	{ 
		int count=0;
		System.out.println("Numbers Divisible by 3 & 4 numbers are:");
		
		for(int num=startNumber;num<=endNumber;num++)
		{
			if(num%3==0 && num%4==0 && count<3)
			{
				System.out.println(num);
				count++;
			}
		}
	}
    public static void main(String[] args) {
		
    	PrintFir3NumDivBy3And4 printFir3NumDivBy3And4=new  PrintFir3NumDivBy3And4();
    	printFir3NumDivBy3And4.printFirst3NumDivBy3And4(1, 70);
	}
	

}
