package narendra;
/*
Assignment - 12 : 20th Nov'2024 [12-15 mins]

Write only one program having the following methods.

1. print all even numbers in a user defined range.
Hint : pass start and end index as a parameter.

Input : Range -> 10 to 15
Output : Even numbers are:
10
12
14

printEvenNum(int startRange, int endRange){
for(int num=startRange; num<=endRange; num++){

}
}

printEvenNum(int startRange, int endRange){
for(; startRange<=endRange; startRange++){

}
}
*/

public class Assignment_12_ToPrintEvenNum {
	
	void getEvenNum(int startRange, int endRange) {
		System.out.println("Even numbers are:");
		
		for(int num=startRange; num<=endRange; num++) {
			if(num %2 == 0) {
				int evenNum = num;
				System.out.println(evenNum);
			}
			
		}
						
	}	

	public static void main(String[] args) {
		Assignment_12_ToPrintEvenNum printEvenNum = new Assignment_12_ToPrintEvenNum();
		printEvenNum.getEvenNum(10, 15);

	}

}