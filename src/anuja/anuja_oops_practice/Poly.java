package anuja.anuja_oops_practice;

/* practice polymorphism1 */

public class Poly {
	int num;
	char ch;
	static int sum;

	void m1(int num1) {

		System.out.println("Hi I am void m1 \n");
	}

	int m1(int num, int num2) {
		this.num = num;

		System.out.println("I am m2 and I am parametrised. \n");
		System.out.println(num2 + num);
		return num;
	}

	public static void main(String[] args_) {
		Poly poly = new Poly();
		poly.m1(10);
		System.out.println(poly.num);// 0

		poly.m1(10, 200);
		System.out.println(poly.num);

	}

}