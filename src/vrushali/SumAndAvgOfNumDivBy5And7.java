package vrushali;

//Assignment - 16 : 22nd Jun'2024 [25 mins]
//On user defined range print sum and average of first 3 numbers which is divisible by 5 & 7.
//
//Hint : pass start and end index as a parameter.
//
//Input : Range -> 1 to 210
//Output : Numbers are,
//35
//70
//105
//Found 3 numbers which are divible by 5 & 7.
//sum = 210
//Average = 70


public class SumAndAvgOfNumDivBy5And7 {
	
	void printSumAndAvgOfNumDivBy5And7(int startNumber,int endNumber)
	{ 
		int count=0,sum=0,avg=0;
		System.out.println("Numbers Divisible by 5 & 7 numbers are:");
		
		for(int num=startNumber;num<=endNumber;num++)
		{
			if(num%5==0 && num%7==0 && count<3)
			{
				sum=sum+num;
				System.out.println(num);
				count++;
			}
		}
		avg=sum/3;
		System.out.println("Sum of Numbers = "+sum);
		System.out.println("Avg of Numbers= "+avg);
	}

	public static void main(String[] args) {
		SumAndAvgOfNumDivBy5And7 sumAndAvgOfNumDivBy5And7 = new SumAndAvgOfNumDivBy5And7();
		sumAndAvgOfNumDivBy5And7.printSumAndAvgOfNumDivBy5And7(1, 210);
	}

}
