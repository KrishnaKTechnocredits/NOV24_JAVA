package ashwini.interview;
/*
  Assignment 106: Print Fibonacci Series
📥 Input: 10
📤 Output: 0 1 1 2 3 5 8 13 21 34
 */
public class FibonacciAssignment106 {
void printFibonacci(int n) {
	int first=0,second=1;
	System.out.print(first +" "+second);
	for(int i=3;i<=n;i++) {
		int next=first+second;
		System.out.print(" "+ next);
		first=second;
		second=next;
	}
}
public static void main(String[] args) {
	FibonacciAssignment106 fb1= new FibonacciAssignment106();
	int n=10;
	fb1.printFibonacci(n);
}
}
