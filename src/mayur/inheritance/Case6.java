package mayur.inheritance;

public class Case6 {
	public static void main(String[] args){
		A a = new B();
		B b = new B();
		//b = a;		//not possible to store ref variable type A into type B
		b = (B)a;		//using type-casting , this statement is resolved as  B b = new B()
		
		System.out.println(b.x); // 
		System.out.println(b.y); //
		System.out.println(b.z); // 
		
		b.m1(); // 
		b.m2(); // 
		b.m3(); // 
	}
}