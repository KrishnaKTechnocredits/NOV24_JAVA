package swapnil;

public class Assignment12 {
	 int startRange,endRange;
	 
	 void even(int startRange,int endRange) {
		// for(int num=startRange; num<=endRange; num++) {
		 for(; startRange<=endRange; startRange++){	 
			 if (startRange%2 == 0) {
				 System.out.println(startRange);
			 }
		 }
		  
	 }
	

	public static void main(String[] args) {
		Assignment12 assignment12 = new Assignment12();
		System.out.println("Even numbers are: ");
		assignment12.even(10, 15);

	}

}


/* Write only one program having the following methods.

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