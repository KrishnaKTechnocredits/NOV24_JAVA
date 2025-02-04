package anuja.anuja_interview;

//📥 Input: 10
//📤 Output: 0 1 1 2 3 5 8 13 21 34
public class Assignment106Fibonacci {
	public static void main(String[] args) {
		Assignment106Fibonacci obj = new Assignment106Fibonacci();
		int num = 10;
		obj.printFibonacci(num);
	}

	private void printFibonacci(int num) {
		System.out.println("Printing fibinacci till number " + num);

		int numAt0 = 0;
		int numAt1 = 1;
		System.out.print(numAt0 + " " + numAt1 + " ");
		int nextNumInFibonnacci = 0;
		for (int i = 2; i < 10; i++) {
			nextNumInFibonnacci = numAt0 + numAt1;
			System.out.print(nextNumInFibonnacci + " ");
			numAt0 = numAt1;
			numAt1 = nextNumInFibonnacci;
		}
	}
}

/*
 * -----------------------------------------------
 * 🔥 Fibonacci Series Cheat Sheet 🔥
 * -----------------------------------------------
 * ✅ Formula: F(n) = F(n-1) + F(n-2)
 * ✅ First two numbers are always: 0, 1
 * ✅ Loop starts from 2, since 0 & 1 are already printed
 * ✅ Update numbers in each iteration:
 *    - nextNum = numAt0 + numAt1
 *    - numAt0 = numAt1
 *    - numAt1 = nextNum
 *
 * 📌 Common Mistakes:
 * ❌ Forgetting to start loop from `i = 2`
 * ❌ Not updating `numAt0` & `numAt1` correctly
 * ❌ Using incorrect formula like `nextNum = nextNum + i`
 *
 * ✅ Correct Output Example (For num = 10):
 *    0 1 1 2 3 5 8 13 21 34
 */

