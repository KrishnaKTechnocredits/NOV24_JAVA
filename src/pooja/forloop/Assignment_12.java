/*Assignment - 12 : 21st Nov'2024 [12-15 mins]

Write only one program having the following methods.

1. print all even numbers in a user defined .
Hint : pass start and end  as a parameter.

Input :  -> 10 to 15
Output : Even numbers are:
10
12
14

printEvenNum(int start, int end){
for(int num=start; num<=end; num++){

}
}

printEvenNum(int start, int end){
for(; start<=end; start++){

}
}*/
package pooja.forloop;

public class Assignment_12 {

	void evenNumber(int start, int end) {
		System.out.println("Even numbers from  " + start + " to " + end + " are : ");
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	void evenNumber2(int start, int end) {
		System.out.println("Even numbers from  " + start + " to " + end + " are : ");
		for (; start <= end; start++) {
			if (start % 2 == 0) {
				System.out.println(start);
			}
		}
	}

	public static void main(String[] args) {
		Assignment_12 assignment_12 = new Assignment_12();
		assignment_12.evenNumber(10, 20);
		assignment_12.evenNumber2(10, 30);
	}
}
