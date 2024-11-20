package vrushali;

//Assignment - 13 : 20th Nov'2024 [20 mins]
//
//1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
//Hint : pass start and end index as a parameter.
//
//Input : Range -> 5 to 40
//Output : Divisible by 5 & 3, numbers are:
//15
//30.

public class FindDivisibleNumber {
	
	void findDivisibleBy3And5(int startNumber,int endNumber)
	{ 
		System.out.println("Numbers Divisible by 5 & 3 numbers are:");
		
		for(int num=startNumber;num<=endNumber;num++)
		{
			if(num%3==0 && num%5==0)
			{
				System.out.println(num);
			}
		}
	}
	
    public static void main(String[] args) {
		
    	FindDivisibleNumber findDivisibleNumber=new  FindDivisibleNumber();
    	findDivisibleNumber.findDivisibleBy3And5(5, 40);
	}
}
