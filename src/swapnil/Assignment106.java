package swapnil;

public class Assignment106 {
	
	void printFibonacci(int n) {
		int first=0,second=1;
		System.out.println(first+"-"+second);
		for(int i=3;i<n;i++) {
			int next = first+second;
			System.out.println(" "+next);
			first=second;
			second=next;
		}
	}
	public static void main(String[] args) {
		Assignment106 a = new Assignment106();
		int n = 10;
		a.printFibonacci(n);
	}
}
