package mayur.inheritance;

public class Case3 {
	
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.x);
		System.out.println(a.y);
		//System.out.println(a.z);	//its not possible to access member which is not present in parent class using dynmaic polymorphism
		
		a.m1();
		a.m2();
		//a.m3();		//its not possible to access member which is not present in parent class using dynmaic polymorphism
	}
}
