package anuja.inheritance;
/*here we are learning the case2 from inheritance where object of 
 * child class is created in new class.*/
public class Test2 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);
		b.m1();
		b.m2();
		b.m3();
		b.m4(); //self local method of child as its different, signature is diff than class A m4 method
		b.m4(10);//derived method from parent class as its signature different so its new identity. 
	}
}
