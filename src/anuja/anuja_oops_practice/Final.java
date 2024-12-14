package anuja.anuja_oops_practice;
//basic on final
public class Final {
	final float num =20;
	int num2 ; //final have to initialse and declared at once
	
	public void finalWork() {
		//final int delta = 10; //shows compilation error if incremented.
		int delta = 20;
		delta++; 
		System.out.println(delta);
	}
	
	public void fianlOutput() {
		System.out.println(num); //you can use only final.
	}
	
	
	public static void main(String[] args) {
		Final a = new Final();
		a.finalWork();
		a.fianlOutput();
	}
}
