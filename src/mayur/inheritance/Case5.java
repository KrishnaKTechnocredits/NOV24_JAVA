package mayur.inheritance;

public class Case5 {
	public static void main(String[] args){
		A a = new A();
		B b = new B();
		a = b;		// this statement resolves as A a = new B() 
		
		System.out.println(a.x); 
		System.out.println(a.y); 
		//System.out.println(a.z);		// not possible to access member which is not in parent class when object of child class is created with ref of parent class
		
		a.m1();
		a.m2(); 
		//a.m3(); 		// not possible to access member which is not in parent class when object of child class is created with ref of parent class
	}
}
