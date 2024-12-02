package anuja.inheritance;
/*here in inheritance we are lering case1, objevt of parent class.*/
 class Test1 {
	 public static void main(String[] args) {
		 A a= new A();
		 System.out.println(a.x);
		 System.out.println(a.y);
		// System.out.println(a.z); //got a compilation error as "Can not be resolved"
		 a.m1();
		 a.m2();
		 a.m4(0);
		 //a.m3();//same error here, coz A is a parent and we have created object of class A itself.
	}
	}
