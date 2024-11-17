package harshadaJ;

public class Example2 {
	
	static void sum(int a, int b) {
		int c=a+b;
		System.out.println("sum is "+c);
	}
	
	static void sub(int a, int b) {
		int c=a-b;
		System.out.println("sub is "+c);
	}
	
	static void mul(int a, int b) {
		int c=a*b;
		System.out.println("mul is "+c);
	}
	
	static void div(int a, int b) {
		int c=a/b;
		System.out.println("div is "+c);
	}
	
	public static void main(String[] args) {
		
		Example2.sum(100, 20);
		Example2.sub(100, 20);
		Example2.mul(10, 20);
		Example2.div(100, 20);
	}
}
