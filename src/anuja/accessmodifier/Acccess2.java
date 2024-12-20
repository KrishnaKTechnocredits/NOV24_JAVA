package anuja.accessmodifier;

public class Acccess2 {

	public void m2() {
		Access1 a =  new Access1() ;
		//System.out.println(a.num); //as its private in other clas, change the visibility or create a new variable
		System.out.println(a.num2); 
		
	}
	
	public static void main(String[] args) {
		Acccess2 b =  new Acccess2() ;
		b.m2();
		
	}
}
