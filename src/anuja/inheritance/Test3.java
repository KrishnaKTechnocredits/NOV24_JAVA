package anuja.inheritance;
/*inheritance case3*/
public class Test3 {
	public static void main(String[] args) {
		A a = new B();//object is created for class  A(check just next to new keyword), 
		//and assigned to class A and reference variable name is a
		// a a = new A --not possible coz a class is
		//child and A is parent. child to parent is not possible.
		//always check relationship, no matter if number of members is more in child.
		System.out.println("x variable from class A " +a.x);
		System.out.println("x variable from class A \n" + a.y);
		//System.out.println(a.z);//compilation error
		a.m1();
		a.m2();//m2 from class A
		System.out.println("m4 parametrised method from class A, its not common and its object taregt to class A");
		a.m4(0);//m4 is also from class A
		//a.m4 not possible, compile error as its not common and non parametrised is not present in A, its in B
		//a.m3();//compilation error, 
			}
	}
