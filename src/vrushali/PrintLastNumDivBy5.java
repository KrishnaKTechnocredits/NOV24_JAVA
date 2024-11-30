package vrushali;
//Assignment - 18 : 23rd Nov'2024 [20 mins]
//On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.
//
//int getLastDivNumber(int startIndex, int endIndex){
//
//}
//
//Hint : pass start and end index as a parameter.
//
//Input : Range -> 10 to 498
//Output : 495 is the last number which is div by 5 in the given range.

public class PrintLastNumDivBy5 {

	
	int getLastNumbersDivisibleBy5(int startNumber,int endNumber)
	{ 
		
		for(int num=endNumber;num>=startNumber;num--)
		{
			if(num%5==0)
			{
				return num;
			}
			
		}
		return 0;
	}
    public static void main(String[] args) {
		
    	PrintLastNumDivBy5 printLastNumDivBy5=new  PrintLastNumDivBy5();
    	int num=printLastNumDivBy5.getLastNumbersDivisibleBy5(10, 498);
    	if(num!=0)
    	{
    		System.out.println(num+" is the last number which is div by 5 in the given range");
    	}
    	else
    	{
    		System.out.println("There are no number divisible by 5");
    	}
	}

}
