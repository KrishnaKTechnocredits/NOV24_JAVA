package anuja.allcase;
/*parent class*/
public class Manager {
	int x =10;
	 int y =12;
	 
	 void m1(){
		 System.out.println("A.m1");
	 }
	 
	 void m2() {
		 System.out.println("A.m2");
	 }
	 // add one parameterized method which will be having same name in class B but signature is diff.
	 void m4(int x) {
		 System.out.println("A.m4.parameterised method");
}
}
