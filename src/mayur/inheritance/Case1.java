package mayur.inheritance;

public class Case1 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.x);
		System.out.println(a.y);
		//System.out.println(a.z);		//member of child class
		
		a.m1();
		a.m2();
		//a.m3();		//member of child class
	}
}
