package anuja.anuja_oops_practice;

public class Child1 extends Parent1 {

	public void m1() {
			System.out.println("I am from diff child ");
			 m5();//non static method m1 if calls a static method which is common then , it gives preferance to static from child.
	}
	
	static void m5() {
		System.out.println("I am static method from child");
	}
	 
	public static void main(String[] args) {
		Parent1 parent1 = new Child1();
		parent1.m1();
		parent1.m2();
		parent1.m5();
		
	}
}
