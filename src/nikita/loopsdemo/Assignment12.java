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
} */

package nikita.loopsdemo;

public class Assignment12 {
	
	void printEvenNumber (int startRange, int endRange) {
		System.out.println("Even Numbers between " + startRange + " and " + endRange + ":");
		for(int i = startRange; i<=endRange; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Assignment12 a12 = new Assignment12();
		a12.printEvenNumber(10, 20);

	}


}
