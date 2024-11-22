/*Assignment - 12 : 21st Nov'2024 [12-15 mins]

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
}*/

package prashant;

public class Assignment12 {

	void printEvenNum(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			if (num % 2 == 0) {
				System.out.println("Even numbers are:" + num);
			}

		}
	}

	public static void main(String[] args) {

		Assignment12 assignment12 = new Assignment12();
		assignment12.printEvenNum(10, 15);

	}

}
