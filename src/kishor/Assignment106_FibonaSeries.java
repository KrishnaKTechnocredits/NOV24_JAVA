package kishor;
//🔹 Assignment 106: Print Fibonacci Series

//📥 Input: 10
//📤 Output: 0 1 1 2 3 5 8 13 21 34
//last 2 digit sum is next number--ex 0+1=1, then 1+1=2, 1+2=3
//fibonacciseries start with 0 and 1

public class Assignment106_FibonaSeries {

	static void displaySeries(int n) {

		int first = 0;
		int second = 1;
		System.out.print(first + " " + second);
		
		for (int i = 3; i <= n; i++) {
			int next = first + second;
			first = second;
			second = next;
			System.out.print(" " + next + " ");
		}
	}

	public static void main(String[] args) {

		displaySeries(10);
	}
}
