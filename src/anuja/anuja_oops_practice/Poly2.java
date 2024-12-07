package anuja.anuja_oops_practice;

public class Poly2 {
	
	static void m1() {
		System.out.println("I am static");
	}
	
	void m1(char ch) {
		System.out.println("I am non static m1 with char \n");
	}
	
	void m1(int x, int y) {
		System.out.println("I am non static \n");
	}
	
	double m1(double x1, double y1) {
		System.out.println("I am double return type");
		return x1+y1;
	}
	
	public static void main(String[] args) {
		Poly2 poly2 = new Poly2();
		Poly2.m1(); //if same name m1 static method need to access, use class name.
		poly2.m1(2, 4);
		poly2.m1(10.2, 19.2);
		poly2.m1('a');
		
			}//polymorphism is accessing same method with diff parametrs to perform diff task.

}
