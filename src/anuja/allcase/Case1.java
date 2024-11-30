package anuja.allcase;

public class Case1 {
	 public static void main(String[] args) {
		 System.out.println("This is case1 \n");
		 Manager manager= new Manager();
		 System.out.println(manager.x);
		 System.out.println(manager.y);
		// System.out.println(manager.z); //got a compilation error as "Can not be resolved"
		 manager.m1();
		 manager.m2();
		 manager.m4(0);
		 //manager.m3();//same error here, coz A is a parent and we have created object of class A itself.
	}
}
