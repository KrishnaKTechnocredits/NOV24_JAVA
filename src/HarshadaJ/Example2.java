package HarshadaJ;

public class Example2 {
	
	void sum(int a, int b) {
		int c=a+b;
		System.out.println("sum is "+c);
	}
	
	void sub(int a, int b) {
		int c=a-b;
		System.out.println("sub is "+c);
	}
	
	void mul(int a, int b) {
		int c=a*b;
		System.out.println("mul is "+c);
	}
	
	void div(int a, int b) {
		int c=a/b;
		System.out.println("div is "+c);
	}
	
	public static void main(String[] args) {
		Example2 exmp2= new Example2();
		exmp2.sum(100, 20);
		exmp2.sub(100, 20);
		exmp2.mul(10, 20);
		exmp2.div(100, 20);
	}
}
