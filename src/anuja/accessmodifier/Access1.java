package anuja.accessmodifier;
// private, default, protected , public
public class Access1 {

	int num2 = 100 ; 
	private int num = 40 ; // priavte var will not go in other class
	//default num 2 = 100; // cant use name as default.
	
	 void m1() {
	int num1 = 10;
	System.out.println( num2 + " is default num");
	}
	
	protected void m3() {
		int num4 = 80;
		System.out.println ( num4 + " I am from protected");
	}
	
	public static void main(String[] args) {
		Access1 a =  new Access1() ;
		a.m1();
		a.m3();
		
	}
}
