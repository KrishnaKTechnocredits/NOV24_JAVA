/*
 * Assignment - 12 : 21st Nov'2024 [12-15 mins]

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

package amruta;

public class Assign_12_PrintEvenNums {

	static void printEvenNumbers(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			if(num % 2 == 0)
				System.out.println(num + " is Even Number.");
		}
	}

	public static void main(String[] args) {
		printEvenNumbers(10,15);
	}
}
