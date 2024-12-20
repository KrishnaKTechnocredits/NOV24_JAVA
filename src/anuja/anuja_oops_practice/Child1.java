package anuja.anuja_oops_practice;

public class Child1 extends Parent1 {

	public int m1(int x, int y) {
			System.out.println("m1-I am from diff child ");

			 m5();
			 return 0;//non static method m1 if calls a static method which is common then , it gives preferance to static from child.
	}
	
	static void m5() {
		System.out.println("M5-I am static method from child");
	}
	
	//@Override
	 
	public int m2(int x, int y) {
		System.out.println(" M2-I am from child int m2 ");
		return 0;
	}
	
	
	public double m2(double x, double y) {
		System.out.println(" ******M2 am from child int m2 ");
		return 0;
	}
	
	@Override
	
	int printAdd() {
		int a = 10;
		int b = 0;
		int c =10;
		int sum =  a+b+c;
		return sum;
		
	}
	
	public static void main(String[] args) {
		Parent1 parent1 = new Child1();
		parent1.m1();
		parent1.m2(5,6);
		parent1.m2(5.8,6.7);
		int sum1 = parent1.printAdd();
		System.out.println(sum1);
//		/parent1.m5();	
	}
}
