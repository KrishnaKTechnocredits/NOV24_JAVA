package vrushali;

//Assignment - 12 : 21st Nov'2024 [12-15 mins]
//
//Write only one program having the following methods.
//
//1. print all even numbers in a user defined range.
//Hint : pass start and end index as a parameter.
//
//Input : Range -> 10 to 15
//Output : Even numbers are:
//10
//12
//14
//
//printEvenNum(int startRange, int endRange){
//for(int num=startRange; num<=endRange; num++){
//
//}
//}
//
//printEvenNum(int startRange, int endRange){
//for(; startRange<=endRange; startRange++){
//
//}
//}

public class FindEvenNumber {
	
	void printEvenNumbers(int startRange,int endRange)
	{
		System.out.println("Even Number List :");
		for(int num=startRange; num<=endRange; num++)
		{
			
			if (num%2==0)
			{
				System.out.println(num);
			}
		}
		
		
	}
	
	//another method to print even number
	void printEvenNumber1(int startRange,int endRange)
	{
		System.out.println("Even Number List :");
		for(; startRange<=endRange; startRange++)
		{
			if (startRange%2==0)
			{
				System.out.println(startRange);
			}
		}
	}
	
	public static void main(String[] args) {
		FindEvenNumber findEvenNumber =new FindEvenNumber();
		findEvenNumber.printEvenNumbers(10, 15);
		System.out.println();
		findEvenNumber.printEvenNumber1(10, 15);
		
	}
}
